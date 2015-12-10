// This is a generated file. Not intended for manual editing.
package net.masterthought.dlanguage.psi.interfaces;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DLanguageForStatement extends PsiElement {

  @Nullable
  DLanguageIncrement getIncrement();

  @NotNull
  DLanguageInitialize getInitialize();

  @NotNull
  DLanguageScopeStatement getScopeStatement();

  @Nullable
  DLanguageTest getTest();

  @NotNull
  PsiElement getKwFor();

  @NotNull
  PsiElement getOpParLeft();

  @NotNull
  PsiElement getOpParRight();

  @NotNull
  PsiElement getOpScolon();

}
