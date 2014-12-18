// This is a generated file. Not intended for manual editing.
package net.masterthought.dlanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DLanguageShiftExpression extends PsiElement {

  @NotNull
  DLanguageAddExpression getAddExpression();

  @Nullable
  DLanguageShiftExpression getShiftExpression();

  @Nullable
  PsiElement getLeftShift();

  @Nullable
  PsiElement getRightShift();

  @Nullable
  PsiElement getTripleRshift();

}
