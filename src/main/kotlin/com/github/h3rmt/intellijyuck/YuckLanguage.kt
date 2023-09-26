package com.github.h3rmt.intellijyuck

import com.intellij.lang.Language


object YuckLanguage : Language("yuck") {
  override fun isCaseSensitive() = true
  override fun getDisplayName() = "Yuck"
}