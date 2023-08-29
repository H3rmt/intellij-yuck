package com.github.h3rmt.intellijyuck.psi

import com.github.h3rmt.intellijyuck.YuckLanguage
import com.intellij.psi.tree.IElementType

open class YuckTokenType(debugName: String) : IElementType(debugName, YuckLanguage) {
    override fun toString() = "YuckTokenType." + super.toString()
}