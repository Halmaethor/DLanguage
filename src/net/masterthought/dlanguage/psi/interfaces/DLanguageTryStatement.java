// This is a generated file. Not intended for manual editing.
package net.masterthought.dlanguage.psi.interfaces;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DLanguageTryStatement extends PsiElement {

  @Nullable
  DLanguageCatches getCatches();

  @Nullable
  DLanguageFinallyStatement getFinallyStatement();

  @NotNull
  DLanguageScopeStatement getScopeStatement();

  @NotNull
  PsiElement getKwTry();

}
