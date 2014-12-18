// This is a generated file. Not intended for manual editing.
package net.masterthought.dlanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DLanguageTemplateDeclaration extends PsiElement {

  @Nullable
  DLanguageConstraint getConstraint();

  @NotNull
  List<DLanguageDeclaration> getDeclarationList();

  @Nullable
  DLanguageEponymousTemplateDeclaration getEponymousTemplateDeclaration();

  @Nullable
  DLanguageTemplateParameters getTemplateParameters();

  @Nullable
  PsiElement getCloseBrace();

  @Nullable
  PsiElement getIdentifier();

  @Nullable
  PsiElement getKwTemplate();

  @Nullable
  PsiElement getOpenBrace();

}
