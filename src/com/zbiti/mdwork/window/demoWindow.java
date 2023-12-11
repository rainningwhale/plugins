package com.zbiti.mdwork.window;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.zbiti.mdwork.util.Global;

import javax.swing.*;
import java.sql.Time;

import static com.zbiti.mdwork.JList.taskList.addTaskList;
import static com.zbiti.mdwork.JList.taskList.addTaskListAll;

/**
 * 功能描述
 *
 * @author hzh
 * @date 2023/12/11  9:41 AM
 */
public class demoWindow {
    private JButton cancel;
    private JPanel contentPanel;
    private JComboBox commitTask;
    private JList gitList;
    private JList taskList;

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    private void init() {
        DefaultListModel defaultListModel = addTaskListAll();
        gitList.setModel(defaultListModel);
    }


    public demoWindow(Project project, ToolWindow toolWindow) throws InterruptedException {
        init();

    }

//    public demoWindow() {
//    }

    public JPanel getContentPanel() {
        return contentPanel;
    }
}
