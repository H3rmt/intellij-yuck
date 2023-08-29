package com.github.h3rmt.intellijyuck.stubs

import com.github.h3rmt.intellijyuck.psi.YuckCustomWidgetDefinition
import com.intellij.psi.stubs.IStubElementType
import com.intellij.psi.stubs.StubElement
import com.intellij.util.io.StringRef

class YuckCustomWidgetDefinitionStub : YuckNamedStub<YuckCustomWidgetDefinition> {
  constructor(parent: StubElement<*>?, elementType: IStubElementType<*, *>, name: StringRef?) :
          super(parent, elementType, name)

  constructor(parent: StubElement<*>?, elementType: IStubElementType<*, *>, name: String?) :
          super(parent, elementType, name)
}
