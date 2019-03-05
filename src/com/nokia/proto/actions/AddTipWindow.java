package com.nokia.proto.actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import com.nokia.proto.TextFileManager;
import com.nokia.proto.TipsStorage;

public class AddTipWindow extends AnAction {

    public void actionPerformed(AnActionEvent event) {
        Project project = event.getData(PlatformDataKeys.PROJECT);
        String txt= Messages.showInputDialog(project,"Enter your coding tip:", "New coding tip", Messages.getQuestionIcon());
        //if(TextFileManager.appendLineToFile(txt))
        if(TipsStorage.storeTip())
            Messages.showMessageDialog(project, "Your tip was added", "Success", Messages.getInformationIcon());
        else
            Messages.showMessageDialog(project, "An error occured, your tip could not be saved", "Failure", Messages.getInformationIcon());
    }
}



