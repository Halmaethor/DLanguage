// This is a generated file. Not intended for manual editing.
package net.masterthought.dlanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DLanguageAtAttribute extends PsiElement {

  @Nullable
  DLanguageArgumentList getArgumentList();

  @Nullable
  DLanguageFunctionCallExpression getFunctionCallExpression();

  @NotNull
  PsiElement getAt();

  @Nullable
  PsiElement getCloseParens();

  @Nullable
  PsiElement getIdentifier();

  @Nullable
  PsiElement getOpenParens();

}
