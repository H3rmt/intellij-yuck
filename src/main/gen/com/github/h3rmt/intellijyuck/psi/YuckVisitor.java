// This is a generated file. Not intended for manual editing.
package com.github.h3rmt.intellijyuck.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;

public class YuckVisitor extends PsiElementVisitor {

  public void visitActiveProp(@NotNull YuckActiveProp o) {
    visitBooleanExpression(o);
  }

  public void visitBoxDefinition(@NotNull YuckBoxDefinition o) {
    visitDefinitionExpression(o);
  }

  public void visitClassProp(@NotNull YuckClassProp o) {
    visitCompositeElement(o);
  }

  public void visitComboBoxTextDefinition(@NotNull YuckComboBoxTextDefinition o) {
    visitDefinitionExpression(o);
  }

  public void visitCssProp(@NotNull YuckCssProp o) {
    visitCompositeElement(o);
  }

  public void visitCustomWidgetDefinition(@NotNull YuckCustomWidgetDefinition o) {
    visitNamedDefinitionExpression(o);
  }

  public void visitCustomWidgetDefinitionBrackets(@NotNull YuckCustomWidgetDefinitionBrackets o) {
    visitCompositeElement(o);
  }

  public void visitCustomWidgetReference(@NotNull YuckCustomWidgetReference o) {
    visitReferenceExpression(o);
  }

  public void visitExpandProp(@NotNull YuckExpandProp o) {
    visitBooleanExpression(o);
  }

  public void visitExpanderDefinition(@NotNull YuckExpanderDefinition o) {
    visitDefinitionExpression(o);
  }

  public void visitHalignProp(@NotNull YuckHalignProp o) {
    visitCompositeElement(o);
  }

  public void visitHeightProp(@NotNull YuckHeightProp o) {
    visitCompositeElement(o);
  }

  public void visitHexpandProp(@NotNull YuckHexpandProp o) {
    visitBooleanExpression(o);
  }

  public void visitMonitorProp(@NotNull YuckMonitorProp o) {
    visitCompositeElement(o);
  }

  public void visitNameProp(@NotNull YuckNameProp o) {
    visitCompositeElement(o);
  }

  public void visitOnChangeProp(@NotNull YuckOnChangeProp o) {
    visitCompositeElement(o);
  }

  public void visitOrientationProp(@NotNull YuckOrientationProp o) {
    visitCompositeElement(o);
  }

  public void visitSpaceEvenlyProp(@NotNull YuckSpaceEvenlyProp o) {
    visitBooleanExpression(o);
  }

  public void visitSpacingProp(@NotNull YuckSpacingProp o) {
    visitCompositeElement(o);
  }

  public void visitStyleProp(@NotNull YuckStyleProp o) {
    visitCompositeElement(o);
  }

  public void visitTimeoutProp(@NotNull YuckTimeoutProp o) {
    visitCompositeElement(o);
  }

  public void visitTooltipProp(@NotNull YuckTooltipProp o) {
    visitCompositeElement(o);
  }

  public void visitValignProp(@NotNull YuckValignProp o) {
    visitCompositeElement(o);
  }

  public void visitVexpandProp(@NotNull YuckVexpandProp o) {
    visitBooleanExpression(o);
  }

  public void visitVisibleProp(@NotNull YuckVisibleProp o) {
    visitBooleanExpression(o);
  }

  public void visitWidthProp(@NotNull YuckWidthProp o) {
    visitCompositeElement(o);
  }

  public void visitWindowDefinition(@NotNull YuckWindowDefinition o) {
    visitNamedDefinitionExpression(o);
  }

  public void visitWindowProp(@NotNull YuckWindowProp o) {
    visitCompositeElement(o);
  }

  public void visitWmIgnoreProp(@NotNull YuckWmIgnoreProp o) {
    visitBooleanExpression(o);
  }

  public void visitBooleanExpression(@NotNull YuckBooleanExpression o) {
    visitCompositeElement(o);
  }

  public void visitDefinitionExpression(@NotNull YuckDefinitionExpression o) {
    visitCompositeElement(o);
  }

  public void visitNamedDefinitionExpression(@NotNull YuckNamedDefinitionExpression o) {
    visitCompositeElement(o);
  }

  public void visitReferenceExpression(@NotNull YuckReferenceExpression o) {
    visitCompositeElement(o);
  }

  public void visitCompositeElement(@NotNull YuckCompositeElement o) {
    visitElement(o);
  }

}
