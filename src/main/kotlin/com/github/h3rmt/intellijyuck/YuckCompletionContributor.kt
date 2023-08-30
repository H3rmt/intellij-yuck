package com.github.h3rmt.intellijyuck

import com.github.h3rmt.intellijyuck.psi.*
import com.github.h3rmt.intellijyuck.psi.YuckTokenTypes.WIDGETPROPNAMES
import com.github.h3rmt.intellijyuck.psi.YuckTokenTypes.WIDGETS
import com.intellij.codeInsight.completion.*
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.icons.AllIcons
import com.intellij.openapi.diagnostic.logger
import com.intellij.patterns.PlatformPatterns
import com.intellij.util.ProcessingContext


class YuckCompletionContributor : CompletionContributor() {
  init {
//    extend(
//      CompletionType.BASIC,
//      PlatformPatterns.psiElement().withParent(YuckBoxDefinition::class.java),
//      WidgetPropsCompletionProvider
//    )
    extend(
      CompletionType.BASIC,
      PlatformPatterns.psiElement(YuckTypes.IDENTIFIER).inside(YuckCustomWidgetReference::class.java),
      WidgetCompletionProvider
    )
    extend(
      CompletionType.BASIC,
      PlatformPatterns.psiElement(YuckTypes.IDENTIFIER).inside(YuckCustomWidgetReference::class.java),
      CustomWidgetReferenceCompletionProvider
    )
  }

  private object WidgetCompletionProvider : CompletionProvider<CompletionParameters>() {
    override fun addCompletions(
      parameters: CompletionParameters,
      context: ProcessingContext,
      result: CompletionResultSet
    ) {
      val elements = ATTRIBUTES.map {
        LookupElementBuilder.create(it)
          .withIcon(AllIcons.Nodes.Class)
      }

      result.addAllElements(elements)
    }

    private val ATTRIBUTES = WIDGETS.types.map { it.toString().removePrefix("YuckTokenType.") }
  }

  private object CustomWidgetReferenceCompletionProvider : CompletionProvider<CompletionParameters>() {
    override fun addCompletions(
      parameters: CompletionParameters,
      context: ProcessingContext,
      result: CompletionResultSet
    ) {
      val properties = YuckUtil.find<YuckCustomWidgetDefinition>(parameters.position.project)

      val elements = properties.map {
        LookupElementBuilder.create(it)
          .withIcon(AllIcons.Nodes.MethodReference)
      }
      result.addAllElements(elements)
    }
  }

  private object WidgetPropsCompletionProvider : CompletionProvider<CompletionParameters>() {
    override fun addCompletions(
      parameters: CompletionParameters,
      context: ProcessingContext,
      result: CompletionResultSet
    ) {
      val elements = ATTRIBUTES.map {
        LookupElementBuilder.create(it)
          .withIcon(AllIcons.Nodes.Class)
      }

      result.addAllElements(elements)
    }

    private val ATTRIBUTES = WIDGETPROPNAMES.types.map { it.toString().removePrefix("YuckTokenType.") }
  }

  private object BooleanCompletionProvider : CompletionProvider<CompletionParameters>() {
    override fun addCompletions(
      parameters: CompletionParameters,
      context: ProcessingContext,
      result: CompletionResultSet
    ) {
      result.addAllElements(listOf(true, false).map {
        LookupElementBuilder.create(it)
      })
    }
  }
}