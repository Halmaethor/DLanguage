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

public class DLanguageTemplateMixinExpressionImpl extends ASTWrapperPsiElement implements DLanguageTemplateMixinExpression {

  public DLanguageTemplateMixinExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DLanguageVisitor) ((DLanguageVisitor)visitor).visitTemplateMixinExpression(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public DLanguageMixinTemplateName getMixinTemplateName() {
    return findNotNullChildByClass(DLanguageMixinTemplateName.class);
  }

  @Override
  @Nullable
  public DLanguageTemplateArguments getTemplateArguments() {
    return findChildByClass(DLanguageTemplateArguments.class);
  }

  @Override
  @Nullable
  public PsiElement getIdentifier() {
    return findChildByType(IDENTIFIER);
  }

  @Override
  @NotNull
  public PsiElement getKwMixin() {
    return findNotNullChildByType(KW_MIXIN);
  }

}
