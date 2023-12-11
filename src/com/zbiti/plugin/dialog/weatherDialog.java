package com.zbiti.plugin.dialog;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.DialogWrapper;
import com.zbiti.plugin.content.weatherUtil;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class weatherDialog extends DialogWrapper {


    public weatherDialog() {
        super(true);
        setTitle("天气预报");
        init();
    }

    @Nullable
    @Override
    protected JComponent createCenterPanel() {
        JPanel jPanel = new JPanel();
        String content = weatherUtil.getContent();
        JLabel label1 = new JLabel("江苏省南京市雨花台区天气");
        JLabel label = new JLabel(content);

        jPanel.add(label1);
        jPanel.add(label);

        return jPanel;
    }
}
