package com.github.h3rmt.intellijyuck

import com.intellij.openapi.options.colors.ColorDescriptor
import com.intellij.openapi.options.colors.ColorSettingsPage
import com.intellij.psi.codeStyle.DisplayPriority
import com.intellij.psi.codeStyle.DisplayPrioritySortable

class YuckColorSettingsPage : ColorSettingsPage, DisplayPrioritySortable {
  override fun getHighlighter() = YuckSyntaxHighlighter()
  override fun getIcon() = YuckIcons.Icon
  override fun getAttributeDescriptors() = YuckColor.values().map { it.attributesDescriptor }.toTypedArray()
  override fun getColorDescriptors(): Array<ColorDescriptor> = ColorDescriptor.EMPTY_ARRAY
  override fun getAdditionalHighlightingTagToDescriptorMap() =
    YuckColor.values().associateBy({ it.name }, { it.textAttributesKey })

  override fun getDisplayName() = "Yuck"

  override fun getDemoText() = """
; Comment TODO test
(defwindow <DEFINITION>adf</DEFINITION> :monitor 32 :wm-ignore true (<REFERENCE>weather</REFERENCE>) )

(defwidget <DEFINITION>adf</DEFINITION> []
  (box :spacing 213 :class string)
)
    """.trimIndent()

  override fun getPriority() = DisplayPriority.KEY_LANGUAGE_SETTINGS
}