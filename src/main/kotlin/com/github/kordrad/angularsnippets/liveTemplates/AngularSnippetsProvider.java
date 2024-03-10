package com.github.kordrad.angularsnippets.liveTemplates;

import com.intellij.codeInsight.template.TemplateActionContext;
import com.intellij.codeInsight.template.TemplateContextType;
import org.jetbrains.annotations.NotNull;

final class AngularSnippetsProvider extends TemplateContextType {

  AngularSnippetsProvider() {
    super("Angular");
  }

  @Override
  public boolean isInContext(@NotNull TemplateActionContext templateActionContext) {
    String name = templateActionContext.getFile().getName();
    return name.endsWith(".ts") || name.endsWith(".html");
  }

}
