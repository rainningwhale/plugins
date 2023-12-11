package com.zbiti.plugin.action;

import com.intellij.notification.Notification;
import com.intellij.notification.NotificationDisplayType;
import com.intellij.notification.NotificationGroup;
import com.intellij.notification.Notifications;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.MessageType;
import com.zbiti.plugin.dialog.weatherDialog;

public class FirstAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        // TODO: insert action logic here
        NotificationGroup firstplugin_id = new NotificationGroup("firstplugin_id", NotificationDisplayType.BALLOON, true);
        Notification notification = firstplugin_id.createNotification("点击测试", MessageType.ERROR);
        Notifications.Bus.notify(notification);
        weatherDialog weatherDialog = new weatherDialog();
        weatherDialog.show();

    }
}
