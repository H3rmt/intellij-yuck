package com.github.h3rmt.intellijyuck.color

import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.options.colors.AttributesDescriptor
import com.intellij.openapi.util.NlsContexts
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors as Default

@Suppress("UnstableApiUsage")
enum class YuckColor(
  readableName: @NlsContexts.AttributeDescriptor String,
  default: TextAttributesKey? = null
) {
  KEYWORD("Keywords//Keyword", Default.KEYWORD),
  WIDGETS("Keywords//Widget", Default.KEYWORD),
  LINE_COMMENT("Comments//Line comments", Default.LINE_COMMENT),

  DEFINITION("Types//Definition", Default.CLASS_NAME),
  REFERENCE("Types//Reference", Default.CLASS_REFERENCE),
  UNRESOLVEDREFERENCE("Types//Reference (unresolved)"),

  PROPNAME("Variables//Property", Default.INSTANCE_FIELD),

  STRING("Strings", Default.STRING),
  BRACKETS("Braces and Operators//Brackets", Default.BRACKETS),
  PARENTHESES("Braces and Operators//Parentheses", Default.PARENTHESES),
  NUMBER("Literals//Number", Default.NUMBER),
  ;

  val textAttributesKey = TextAttributesKey.createTextAttributesKey("yuck.$name", default)
  val attributesDescriptor = AttributesDescriptor(readableName, textAttributesKey)
}