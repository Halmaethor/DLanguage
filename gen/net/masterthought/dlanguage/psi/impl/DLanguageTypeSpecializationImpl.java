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

public class DLanguageTypeSpecializationImpl extends ASTWrapperPsiElement implements DLanguageTypeSpecialization {

  public DLanguageTypeSpecializationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DLanguageVisitor) ((DLanguageVisitor)visitor).visitTypeSpecialization(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DLanguageType getType() {
    return findChildByClass(DLanguageType.class);
  }

  @Override
  @Nullable
  public PsiElement getKwClass() {
    return findChildByType(KW_CLASS);
  }

  @Override
  @Nullable
  public PsiElement getKwConst() {
    return findChildByType(KW_CONST);
  }

  @Override
  @Nullable
  public PsiElement getKwDelegate() {
    return findChildByType(KW_DELEGATE);
  }

  @Override
  @Nullable
  public PsiElement getKwEnum() {
    return findChildByType(KW_ENUM);
  }

  @Override
  @Nullable
  public PsiElement getKwFunction() {
    return findChildByType(KW_FUNCTION);
  }

  @Override
  @Nullable
  public PsiElement getKwImmutable() {
    return findChildByType(KW_IMMUTABLE);
  }

  @Override
  @Nullable
  public PsiElement getKwInout() {
    return findChildByType(KW_INOUT);
  }

  @Override
  @Nullable
  public PsiElement getKwInterface() {
    return findChildByType(KW_INTERFACE);
  }

  @Override
  @Nullable
  public PsiElement getKwReturn() {
    return findChildByType(KW_RETURN);
  }

  @Override
  @Nullable
  public PsiElement getKwShared() {
    return findChildByType(KW_SHARED);
  }

  @Override
  @Nullable
  public PsiElement getKwStruct() {
    return findChildByType(KW_STRUCT);
  }

  @Override
  @Nullable
  public PsiElement getKwSuper() {
    return findChildByType(KW_SUPER);
  }

  @Override
  @Nullable
  public PsiElement getKwTypedef() {
    return findChildByType(KW_TYPEDEF);
  }

  @Override
  @Nullable
  public PsiElement getKwUnion() {
    return findChildByType(KW_UNION);
  }

}
