// This is a generated file. Not intended for manual editing.
package net.masterthought.dlanguage.psi.interfaces;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DLanguageIfCondition extends PsiElement {

  @Nullable
  DLanguageBasicType getBasicType();

  @Nullable
  DLanguageDeclarator getDeclarator();

  @NotNull
  DLanguageExpression getExpression();

  @Nullable
  DLanguageIdentifier getIdentifier();

  @Nullable
  DLanguageTypeCtors getTypeCtors();

  @Nullable
  PsiElement getKwAuto();

  @Nullable
  PsiElement getOpEq();

}
