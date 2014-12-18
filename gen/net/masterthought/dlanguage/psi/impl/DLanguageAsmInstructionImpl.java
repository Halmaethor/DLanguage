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

public class DLanguageAsmInstructionImpl extends ASTWrapperPsiElement implements DLanguageAsmInstruction {

  public DLanguageAsmInstructionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DLanguageVisitor) ((DLanguageVisitor)visitor).visitAsmInstruction(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DLanguageAsmExp getAsmExp() {
    return findChildByClass(DLanguageAsmExp.class);
  }

  @Override
  @Nullable
  public DLanguageAsmInstruction getAsmInstruction() {
    return findChildByClass(DLanguageAsmInstruction.class);
  }

  @Override
  @Nullable
  public DLanguageOperands getOperands() {
    return findChildByClass(DLanguageOperands.class);
  }

  @Override
  @Nullable
  public PsiElement getColon() {
    return findChildByType(COLON);
  }

  @Override
  @Nullable
  public PsiElement getGroupInteger() {
    return findChildByType(GROUP_INTEGER);
  }

  @Override
  @Nullable
  public PsiElement getIdentifier() {
    return findChildByType(IDENTIFIER);
  }

  @Override
  @Nullable
  public PsiElement getKwAlign() {
    return findChildByType(KW_ALIGN);
  }

}
