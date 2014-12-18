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

public class DLanguageConstructorImpl extends ASTWrapperPsiElement implements DLanguageConstructor {

  public DLanguageConstructorImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DLanguageVisitor) ((DLanguageVisitor)visitor).visitConstructor(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DLanguageConstraint getConstraint() {
    return findChildByClass(DLanguageConstraint.class);
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
  public DLanguageParameters getParameters() {
    return findNotNullChildByClass(DLanguageParameters.class);
  }

  @Override
  @NotNull
  public DLanguageTemplateParameters getTemplateParameters() {
    return findNotNullChildByClass(DLanguageTemplateParameters.class);
  }

  @Override
  @NotNull
  public PsiElement getKwThis() {
    return findNotNullChildByType(KW_THIS);
  }

  @Override
  @Nullable
  public PsiElement getSemicolon() {
    return findChildByType(SEMICOLON);
  }

}
