// This is a generated file. Not intended for manual editing.
package net.masterthought.dlanguage.psi.interfaces;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DLanguageTemplateArguments extends PsiElement {

  @Nullable
  DLanguageTemplateArgumentList getTemplateArgumentList();

  @Nullable
  DLanguageTemplateSingleArgument getTemplateSingleArgument();

  @NotNull
  PsiElement getOpNot();

  @Nullable
  PsiElement getOpParLeft();

  @Nullable
  PsiElement getOpParRight();

}
