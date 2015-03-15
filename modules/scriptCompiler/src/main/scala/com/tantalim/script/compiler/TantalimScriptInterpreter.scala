package com.tantalim.script.compiler

import com.tantalim.nodes.{TntString, SmartNodeSet}
import com.tantalim.script.compiler.src._
import com.tantalim.util.TantalimException
import org.antlr.v4.runtime.{ANTLRInputStream, CommonTokenStream}

import scala.collection.immutable.HashMap

/**
 * Inspired by https://github.com/bkiers/Mu/blob/master/src/main/java/mu/EvalVisitor.java
 */
class TantalimScriptInterpreter(script: String) extends TantalimScriptBaseVisitor[Value] {
  private val params = scala.collection.mutable.HashMap.empty[String, Any]
  private def parser = new TantalimScriptParser(
    new CommonTokenStream(
      new TantalimScriptLexer(
        new ANTLRInputStream(script)
      )))

  def run(params: Map[String, Any] = Map.empty): Any = {
    this.params ++= params
    visit(parser.start).toResult
  }

  override def visitStart(ctx: TantalimScriptParser.StartContext) = {
    visit(ctx.block())
  }

  override def visitPrint(ctx: TantalimScriptParser.PrintContext) = {
    val atom = visit(ctx.atom())
    println(atom)
    Value()
  }

  override def visitAssignment(ctx: TantalimScriptParser.AssignmentContext) = {
    val variable = ctx.ID().getText
    params += variable -> visit(ctx.atom())
    Value()
  }

//  override def visitAtom(ctx: TantalimScriptParser.AtomContext) = {
//    visit(ctx)
//  }

  override def visitNumberAtom(ctx: TantalimScriptParser.NumberAtomContext): Value = {
    val intNumber = ctx.INT()
    if (intNumber != null) return Value(intNumber.getText.toInt)
    val floatNumber = ctx.FLOAT()
    if (intNumber != null) return Value(intNumber.getText.toFloat)
    Value()
  }

  override def visitParExpr(ctx: TantalimScriptParser.ParExprContext) = {
    Value(visit(ctx.atom()))
  }

  override def visitStringAtom(ctx: TantalimScriptParser.StringAtomContext) = {
    val stringValue = ctx.STRING().getText
    Value(stringValue.substring(1, stringValue.length - 1))
  }

  override def visitReturnStat(ctx: TantalimScriptParser.ReturnStatContext) = {
    Value(visit(ctx.atom()))
  }

  override def visitForBlock(ctx: TantalimScriptParser.ForBlockContext) = {
    val itemName = ctx.item.getText
    val listName = ctx.list.getText
    val people = params.getOrElse(listName, throw new TantalimException("Unknown variable named " + listName, "")).asInstanceOf[SmartNodeSet]
    people.foreach{ item =>
      params += itemName -> item
      visit(ctx.block())
      item.set("PersonName", TntString("John Doe"))
      params -= itemName
    }

    Value()
  }

}
