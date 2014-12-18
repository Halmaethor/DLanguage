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

public class DLanguageUnaryExpressionImpl extends ASTWrapperPsiElement implements DLanguageUnaryExpression {

  public DLanguageUnaryExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DLanguageVisitor) ((DLanguageVisitor)visitor).visitUnaryExpression(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DLanguageArgumentList getArgumentList() {
    return findChildByClass(DLanguageArgumentList.class);
  }

  @Override
  @Nullable
  public DLanguageArguments getArguments() {
    return findChildByClass(DLanguageArguments.class);
  }

  @Override
  @Nullable
  public DLanguageAssertExpression getAssertExpression() {
    return findChildByClass(DLanguageAssertExpression.class);
  }

  @Override
  @NotNull
  public List<DLanguageAssignExpression> getAssignExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DLanguageAssignExpression.class);
  }

  @Override
  @Nullable
  public DLanguageCastExpression getCastExpression() {
    return findChildByClass(DLanguageCastExpression.class);
  }

  @Override
  @Nullable
  public DLanguageDeleteExpression getDeleteExpression() {
    return findChildByClass(DLanguageDeleteExpression.class);
  }

  @Override
  @Nullable
  public DLanguageIdentifierOrTemplateInstance getIdentifierOrTemplateInstance() {
    return findChildByClass(DLanguageIdentifierOrTemplateInstance.class);
  }

  @Override
  @Nullable
  public DLanguageNewExpression getNewExpression() {
    return findChildByClass(DLanguageNewExpression.class);
  }

  @Override
  @Nullable
  public DLanguagePrimaryExpression getPrimaryExpression() {
    return findChildByClass(DLanguagePrimaryExpression.class);
  }

  @Override
  @Nullable
  public DLanguageTemplateArguments getTemplateArguments() {
    return findChildByClass(DLanguageTemplateArguments.class);
  }

  @Override
  @Nullable
  public DLanguageType getType() {
    return findChildByClass(DLanguageType.class);
  }

  @Override
  @Nullable
  public DLanguageUnaryExpression getUnaryExpression() {
    return findChildByClass(DLanguageUnaryExpression.class);
  }

  @Override
  @Nullable
  public PsiElement getAnd() {
    return findChildByType(AND);
  }

  @Override
  @Nullable
  public PsiElement getCloseBracket() {
    return findChildByType(CLOSE_BRACKET);
  }

  @Override
  @Nullable
  public PsiElement getCloseParens() {
    return findChildByType(CLOSE_PARENS);
  }

  @Override
  @Nullable
  public PsiElement getConcat() {
    return findChildByType(CONCAT);
  }

  @Override
  @Nullable
  public PsiElement getDecrement() {
    return findChildByType(DECREMENT);
  }

  @Override
  @Nullable
  public PsiElement getDot() {
    return findChildByType(DOT);
  }

  @Override
  @Nullable
  public PsiElement getDoubleDot() {
    return findChildByType(DOUBLE_DOT);
  }

  @Override
  @Nullable
  public PsiElement getIncrement() {
    return findChildByType(INCREMENT);
  }

  @Override
  @Nullable
  public PsiElement getMinus() {
    return findChildByType(MINUS);
  }

  @Override
  @Nullable
  public PsiElement getNot() {
    return findChildByType(NOT);
  }

  @Override
  @Nullable
  public PsiElement getOpenBracket() {
    return findChildByType(OPEN_BRACKET);
  }

  @Override
  @Nullable
  public PsiElement getOpenParens() {
    return findChildByType(OPEN_PARENS);
  }

  @Override
  @Nullable
  public PsiElement getPlus() {
    return findChildByType(PLUS);
  }

  @Override
  @Nullable
  public PsiElement getStar() {
    return findChildByType(STAR);
  }

}
