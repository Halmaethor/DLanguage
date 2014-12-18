// This is a generated file. Not intended for manual editing.
package net.masterthought.dlanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DLanguageFunctionCallExpression extends PsiElement {

  @NotNull
  DLanguageArguments getArguments();

  @Nullable
  DLanguageTemplateArguments getTemplateArguments();

  @Nullable
  DLanguageType getType();

  @Nullable
  DLanguageUnaryExpression getUnaryExpression();

}
