// This is a generated file. Not intended for manual editing.
package net.masterthought.dlanguage.psi.interfaces;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DLanguageShiftExpression extends PsiElement {

  @NotNull
  DLanguageAddExpression getAddExpression();

  @Nullable
  DLanguageShiftExpression getShiftExpression();

  @Nullable
  PsiElement getOpShLeft();

  @Nullable
  PsiElement getOpShRight();

  @Nullable
  PsiElement getOpUshRight();

}
