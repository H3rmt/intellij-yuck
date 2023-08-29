package com.github.h3rmt.intellijyuck.psi

import com.github.h3rmt.intellijyuck.YuckFileType
import com.github.h3rmt.intellijyuck.YuckIcons
import com.github.h3rmt.intellijyuck.YuckLanguage
import com.intellij.extapi.psi.PsiFileBase
import com.intellij.psi.FileViewProvider

open class YuckFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, YuckLanguage) {
    override fun getFileType() = YuckFileType
    override fun toString() = "Yuck Language file"
    override fun getIcon(flags: Int) = YuckIcons.Icon
}