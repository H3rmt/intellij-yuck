// This is a generated file. Not intended for manual editing.
package com.github.h3rmt.intellijyuck.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.StubBasedPsiElement;
import com.github.h3rmt.intellijyuck.stubs.YuckWindowDefinitionStub;

public interface YuckWindowDefinition extends YuckNamedDefinitionExpression, StubBasedPsiElement<YuckWindowDefinitionStub> {

  @Nullable
  YuckBoxDefinition getBoxDefinition();

  @Nullable
  YuckComboBoxTextDefinition getComboBoxTextDefinition();

  @Nullable
  YuckCustomWidgetReference getCustomWidgetReference();

  @Nullable
  YuckExpanderDefinition getExpanderDefinition();

  @NotNull
  List<YuckWindowProp> getWindowPropList();

  @NotNull
  PsiElement getDefwindow();

  @NotNull
  PsiElement getLparen();

  @Nullable
  PsiElement getRparen();

  @Nullable
  PsiElement getIdentifier();

  @NotNull
  String getReferenceName();

}
