// This is a generated file. Not intended for manual editing.
package com.github.h3rmt.intellijyuck.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.StubBasedPsiElement;
import com.github.h3rmt.intellijyuck.stubs.YuckCustomWidgetDefinitionStub;

public interface YuckCustomWidgetDefinition extends YuckNamedDefinitionExpression, StubBasedPsiElement<YuckCustomWidgetDefinitionStub> {

  @NotNull
  List<YuckBoxDefinition> getBoxDefinitionList();

  @NotNull
  List<YuckComboBoxTextDefinition> getComboBoxTextDefinitionList();

  @Nullable
  YuckCustomWidgetDefinitionBrackets getCustomWidgetDefinitionBrackets();

  @NotNull
  List<YuckCustomWidgetReference> getCustomWidgetReferenceList();

  @NotNull
  List<YuckExpanderDefinition> getExpanderDefinitionList();

  @NotNull
  PsiElement getDefwidget();

  @NotNull
  PsiElement getLparen();

  @Nullable
  PsiElement getRparen();

  @Nullable
  PsiElement getIdentifier();

  @NotNull
  String getReferenceName();

}
