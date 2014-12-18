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

public class DLanguageDestructorImpl extends ASTWrapperPsiElement implements DLanguageDestructor {

  public DLanguageDestructorImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DLanguageVisitor) ((DLanguageVisitor)visitor).visitDestructor(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DLanguageFunctionBody getFunctionBody() {
    return findChildByClass(DLanguageFunctionBody.class);
  }

  @Override
  @NotNull
  public List<DLanguageMemberFunctionAttribute> getMemberFunctionAttributeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DLanguageMemberFunctionAttribute.class);
  }

  @Override
  @NotNull
  public PsiElement getCloseParens() {
    return findNotNullChildByType(CLOSE_PARENS);
  }

  @Override
  @NotNull
  public PsiElement getConcat() {
    return findNotNullChildByType(CONCAT);
  }

  @Override
  @NotNull
  public PsiElement getKwThis() {
    return findNotNullChildByType(KW_THIS);
  }

  @Override
  @NotNull
  public PsiElement getOpenParens() {
    return findNotNullChildByType(OPEN_PARENS);
  }

  @Override
  @Nullable
  public PsiElement getSemicolon() {
    return findChildByType(SEMICOLON);
  }

}
