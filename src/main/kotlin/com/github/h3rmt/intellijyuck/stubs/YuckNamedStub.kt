package com.github.h3rmt.intellijyuck.stubs

import com.github.h3rmt.intellijyuck.psi.YuckNamedElement
import com.intellij.openapi.util.text.StringUtil
import com.intellij.psi.stubs.IStubElementType
import com.intellij.psi.stubs.NamedStubBase
import com.intellij.psi.stubs.StubElement
import com.intellij.util.io.StringRef

abstract class YuckNamedStub<T : YuckNamedElement> : NamedStubBase<T> {

  constructor(
    parent: StubElement<*>?,
    elementType: IStubElementType<*, *>,
    name: StringRef?,
  ) : super(parent, elementType, name)

  constructor(
    parent: StubElement<*>?,
    elementType: IStubElementType<*, *>,
    name: String?,
  ) : super(parent, elementType, name)

  override fun toString(): String {
    val name = name
    val str = super.toString()
    return if (StringUtil.isEmpty(name)) str else "$str: $name"
  }
}
