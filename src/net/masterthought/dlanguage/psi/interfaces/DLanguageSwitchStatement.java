// This is a generated file. Not intended for manual editing.
package net.masterthought.dlanguage.psi.interfaces;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DLanguageSwitchStatement extends PsiElement {

  @NotNull
  DLanguageExpression getExpression();

  @NotNull
  DLanguageScopeStatement getScopeStatement();

  @NotNull
  PsiElement getKwSwitch();

  @NotNull
  PsiElement getOpParLeft();

  @NotNull
  PsiElement getOpParRight();

}
