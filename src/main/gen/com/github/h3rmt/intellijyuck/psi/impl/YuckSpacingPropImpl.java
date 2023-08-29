// This is a generated file. Not intended for manual editing.
package com.github.h3rmt.intellijyuck.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.h3rmt.intellijyuck.psi.YuckTypes.*;
import com.github.h3rmt.intellijyuck.psi.*;

public class YuckSpacingPropImpl extends YuckCompositeElementImpl implements YuckSpacingProp {

  public YuckSpacingPropImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull YuckVisitor visitor) {
    visitor.visitSpacingProp(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YuckVisitor) accept((YuckVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PsiElement getSpacingprop() {
    return notNullChild(findChildByType(SPACINGPROP));
  }

  @Override
  @Nullable
  public PsiElement getInt() {
    return findChildByType(INT);
  }

}
