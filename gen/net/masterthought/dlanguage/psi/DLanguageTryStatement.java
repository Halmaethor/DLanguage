// This is a generated file. Not intended for manual editing.
package net.masterthought.dlanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DLanguageTryStatement extends PsiElement {

  @Nullable
  DLanguageCatches getCatches();

  @NotNull
  DLanguageDeclarationOrStatement getDeclarationOrStatement();

  @Nullable
  DLanguageFinally getFinally();

  @NotNull
  PsiElement getKwTry();

}
