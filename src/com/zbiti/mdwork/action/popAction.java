package com.zbiti.mdwork.action;


import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.editor.SelectionModel;
import com.zbiti.mdwork.dialog.AddNoteDialog;
import com.zbiti.mdwork.util.Global;

public class popAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        // TODO: insert action logic here
        Editor editor = e.getRequiredData(CommonDataKeys.EDITOR);
        SelectionModel model = editor.getSelectionModel();
        String text = model.getSelectedText();
        String filename = e.getRequiredData(CommonDataKeys.PSI_FILE).getViewProvider().getVirtualFile().getName();
        Global.SELECTED_TEXT = text;
        Global.FILE_NAME = filename;

        AddNoteDialog dialog = new AddNoteDialog();
        dialog.show();
    }
}
