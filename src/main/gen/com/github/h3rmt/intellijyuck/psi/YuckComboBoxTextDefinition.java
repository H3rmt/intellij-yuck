// This is a generated file. Not intended for manual editing.
package com.github.h3rmt.intellijyuck.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YuckComboBoxTextDefinition extends YuckDefinitionExpression {

  @NotNull
  List<YuckActiveProp> getActivePropList();

  @NotNull
  List<YuckBoxDefinition> getBoxDefinitionList();

  @NotNull
  List<YuckClassProp> getClassPropList();

  @NotNull
  List<YuckComboBoxTextDefinition> getComboBoxTextDefinitionList();

  @NotNull
  List<YuckCssProp> getCssPropList();

  @NotNull
  List<YuckCustomWidgetReference> getCustomWidgetReferenceList();

  @NotNull
  List<YuckExpanderDefinition> getExpanderDefinitionList();

  @NotNull
  List<YuckHalignProp> getHalignPropList();

  @NotNull
  List<YuckHeightProp> getHeightPropList();

  @NotNull
  List<YuckHexpandProp> getHexpandPropList();

  @NotNull
  List<YuckOnChangeProp> getOnChangePropList();

  @NotNull
  List<YuckStyleProp> getStylePropList();

  @NotNull
  List<YuckTimeoutProp> getTimeoutPropList();

  @NotNull
  List<YuckTooltipProp> getTooltipPropList();

  @NotNull
  List<YuckValignProp> getValignPropList();

  @NotNull
  List<YuckVexpandProp> getVexpandPropList();

  @NotNull
  List<YuckVisibleProp> getVisiblePropList();

  @NotNull
  List<YuckWidthProp> getWidthPropList();

  @NotNull
  PsiElement getComboboxtext();

  @NotNull
  PsiElement getLparen();

  @Nullable
  PsiElement getRparen();

  //WARNING: getReferenceName(...) is skipped
  //matching getReferenceName(YuckComboBoxTextDefinition, ...)
  //methods are not found in YuckPsiImplUtil

}
