package com.zbiti.mdwork.window;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import org.jetbrains.annotations.NotNull;

public class windowFactory implements ToolWindowFactory {
    @Override
    public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
        demoWindow demoWindow = null;
        try {
            demoWindow = new demoWindow(project, toolWindow);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ContentFactory contentFactory = ContentFactory.SERVICE.getInstance();
        Content content1 = contentFactory.createContent(demoWindow.getContentPanel(), "", false);
        toolWindow.getContentManager().addContent(content1);


//        toolsWindow toolsWindow = new toolsWindow();
//
//        ContentFactory instance = ContentFactory.SERVICE.getInstance();
//        Content content = instance.createContent(toolsWindow.getContentPanel(), "", false);
//        toolWindow.getContentManager().addContent(content);
    }
}
