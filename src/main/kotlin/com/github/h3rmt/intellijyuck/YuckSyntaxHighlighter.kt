package com.github.h3rmt.intellijyuck

import com.github.h3rmt.intellijyuck.psi.YuckTokenTypes
import com.github.h3rmt.intellijyuck.psi.YuckTypes.*
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType

class YuckSyntaxHighlighter : SyntaxHighlighterBase() {
  override fun getHighlightingLexer() = YuckLexer()

  override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> =
    pack(
      when (tokenType) {
        LPAREN, RPAREN -> YuckColor.PARENTHESES
        LBRACKET, RBRACKET -> YuckColor.BRACKETS

        in YuckTokenTypes.KEYWORDS -> YuckColor.KEYWORD
        in YuckTokenTypes.WIDGETS -> YuckColor.WIDGETS
        in YuckTokenTypes.PROPNAMES -> YuckColor.PROPNAME
        in YuckTokenTypes.BOOL_LITERALS -> YuckColor.KEYWORD
        in YuckTokenTypes.STRING_LITERALS -> YuckColor.STRING
        in YuckTokenTypes.NUMBERS -> YuckColor.NUMBER
        in YuckTokenTypes.COMMENTS -> YuckColor.LINE_COMMENT

        else -> null
      }?.textAttributesKey
    )

}