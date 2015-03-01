package com.tantalim.models

case class ShallowPage(name: String,
                       title: String,
                       icon: Option[String])

case class Page(
                 name: String,
                 title: String,
                 icon: Option[String],
                 css: Option[String],
                 model: Model,
                 fields: Seq[PageField],
                 hasFormView: Boolean,
                 hasTableView: Boolean,
                 hasNavigation: Boolean,
                 viewMode: String,
                 parentPage: Option[Page],
                 children: Seq[Page]
                 ) {

  def fieldLengthInTableView: Int = {
    fields.count {
      field =>
        field.showInTableView
    }
  }

  private val rootDepth: Int = 1
  def depth: Int = {
    parentPage match {
      case Some(page) => page.depth + 1
      case None => rootDepth
    }
  }

}

case class PageField(
                      name: String,
                      fieldType: String,
                      modelField: ModelField,
                      label: String,
                      required: Boolean,
                      disabled: Boolean,
                      searchable: Boolean,
                      showInFormView: Boolean,
                      showInTableView: Boolean,
                      showInNavigation: Boolean,
                      placeholder: Option[String],
                      help: Option[String],
                      filter: Option[String],
                      blurFunction: Option[String],
                      select: Option[PageFieldSelect],
                      links: Seq[PageFieldLink]
                      ) {
  def alignRight = {
    isNumericType
  }
  def isNumericType = {
    modelField.basisColumn.dataType == "Integer"
  }
  def isDateType = {
    modelField.basisColumn.dataType == "Date"
  }
}

case class PageFieldSelect(model: String,
                           sourceValue: String,
                           targetID: String,
                           where: Option[String],
                           otherMappings: Option[String]
                            )

case class PageFieldLink(page: ShallowPage, filter: String)

