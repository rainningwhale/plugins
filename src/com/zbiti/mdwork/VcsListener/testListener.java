package com.zbiti.mdwork.VcsListener;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

/**
 * 功能描述
 *
 * @author hzh
 * @date 2023/12/11  2:34 PM
 */
public class testListener extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        // TODO: insert action logic here
        System.out.println("1234t提交");
    }
}
