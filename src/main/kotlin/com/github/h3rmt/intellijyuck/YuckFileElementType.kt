package com.github.h3rmt.intellijyuck

import com.github.h3rmt.intellijyuck.psi.YuckFile
import com.github.h3rmt.intellijyuck.stubs.YuckFileStub
import com.github.h3rmt.intellijyuck.stubs.index.YuckNamesIndex
import com.intellij.psi.PsiFile
import com.intellij.psi.StubBuilder
import com.intellij.psi.stubs.*
import com.intellij.psi.tree.IStubFileElementType

class YuckFileElementType : IStubFileElementType<YuckFileStub>("Yuck_FILE", YuckLanguage) {
  override fun getStubVersion() = VERSION

  override fun getBuilder(): StubBuilder {
    return object : DefaultStubBuilder() {
      override fun createStubForFile(file: PsiFile): StubElement<*> {
        return if (file is YuckFile) {
          YuckFileStub(file)
        } else {
          super.createStubForFile(file)
        }
      }
    }
  }

  override fun indexStub(stub: PsiFileStub<*>, sink: IndexSink) {
    super.indexStub(stub, sink)
    if (stub !is YuckFileStub) return
  }

  override fun serialize(stub: YuckFileStub, dataStream: StubOutputStream) {}

  override fun deserialize(dataStream: StubInputStream, parentStub: StubElement<*>?): YuckFileStub {
    return YuckFileStub(null)
  }

  override fun getExternalId() = "Yuck.FILE"

  companion object {
    val INSTANCE = YuckFileElementType()
    const val VERSION = 1
  }
}
