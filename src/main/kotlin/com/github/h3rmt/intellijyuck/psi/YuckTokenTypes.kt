package com.github.h3rmt.intellijyuck.psi

import com.github.h3rmt.intellijyuck.psi.YuckTypes.*
import com.intellij.psi.TokenType
import com.intellij.psi.tree.TokenSet


object YuckTokenTypes {
  @JvmField
  val LINE_COMMENT = YuckTokenType("YUCK_COMMENT")

  val IDENTIFIERS = TokenSet.create(IDENTIFIER)

  val STRING_LITERALS = TokenSet.create(
    STRING,
    SINGLE_QUOTE,
    DOUBLE_QUOTE,
  )

  val COMMENTS = TokenSet.create(
    LINE_COMMENT
  )

  val KEYWORDS = TokenSet.create(
    DEFWIDGET,
    DEFWINDOW
  )

  val NUMBERS = TokenSet.create(
    INT,
    FLOAT,
  )

  val WIDGETPROPNAMES = TokenSet.create(
    CLASSPROP,
    VALIGNPROP,
    HALIGNPROP,
    VEXPANDPROP,
    HEXPANDPROP,
    WIDTHPROP,
    HEIGHTPROP,
    ACTIVEPROP,
    TOOLTIPPROP,
    VISIBLEPROP,
    STYLEPROP,
    CSSPROP,
  )

  val PROPNAMES = TokenSet.create(
    MONITORPROP,
    WMIGNOREPROP,

    TIMEOUTPROP,
    ONCHANGEPROP,

    NAMEPROP,
    EXPANDEDPROP,

    SPACINGPROP,
    ORIENTATIONPROP,
    SPACEEVENLYPROP,

    *WIDGETPROPNAMES.types
  )

  val WIDGETS = TokenSet.create(
    COMBOBOXTEXT,
    EXPANDER,
    BOX
  )

  val BOOL_LITERALS = TokenSet.create(TRUE, FALSE)

  val WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE)
}