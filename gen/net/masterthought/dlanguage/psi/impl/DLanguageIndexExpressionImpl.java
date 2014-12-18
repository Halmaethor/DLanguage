// This is a generated file. Not intended for manual editing.
package net.masterthought.dlanguage.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static net.masterthought.dlanguage.psi.DLanguageTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import net.masterthought.dlanguage.psi.*;

public class DLanguageIndexExpressionImpl extends ASTWrapperPsiElement implements DLanguageIndexExpression {

  public DLanguageIndexExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DLanguageVisitor) ((DLanguageVisitor)visitor).visitIndexExpression(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public DLanguageArgumentList getArgumentList() {
    return findNotNullChildByClass(DLanguageArgumentList.class);
  }

  @Override
  @NotNull
  public DLanguageUnaryExpression getUnaryExpression() {
    return findNotNullChildByClass(DLanguageUnaryExpression.class);
  }

  @Override
  @NotNull
  public PsiElement getCloseBracket() {
    return findNotNullChildByType(CLOSE_BRACKET);
  }

  @Override
  @NotNull
  public PsiElement getOpenBracket() {
    return findNotNullChildByType(OPEN_BRACKET);
  }

}
