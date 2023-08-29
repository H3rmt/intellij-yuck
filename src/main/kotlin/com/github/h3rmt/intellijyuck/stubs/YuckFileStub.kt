package com.github.h3rmt.intellijyuck.stubs

import com.github.h3rmt.intellijyuck.YuckFileElementType
import com.github.h3rmt.intellijyuck.psi.YuckFile
import com.intellij.psi.stubs.PsiFileStubImpl

class YuckFileStub(file: YuckFile?) : PsiFileStubImpl<YuckFile?>(file) {
  override fun getType() = YuckFileElementType.INSTANCE

//  fun getModuleName(): String? {
//    return null
//  }
//
//  fun getModuleQualifiedName(): String {
//    return "unnamed"
//  }
}
