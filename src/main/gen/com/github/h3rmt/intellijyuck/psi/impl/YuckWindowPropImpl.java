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

public class YuckWindowPropImpl extends YuckCompositeElementImpl implements YuckWindowProp {

  public YuckWindowPropImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull YuckVisitor visitor) {
    visitor.visitWindowProp(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YuckVisitor) accept((YuckVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public YuckMonitorProp getMonitorProp() {
    return PsiTreeUtil.getChildOfType(this, YuckMonitorProp.class);
  }

  @Override
  @Nullable
  public YuckWmIgnoreProp getWmIgnoreProp() {
    return PsiTreeUtil.getChildOfType(this, YuckWmIgnoreProp.class);
  }

}
