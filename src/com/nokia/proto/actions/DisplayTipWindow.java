package com.nokia.proto.actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import com.nokia.proto.GUI.TipDialog;
import com.nokia.proto.TextFileManager;
import com.nokia.proto.TipsStorage;

import java.util.List;
import java.util.Random;

public class DisplayTipWindow extends AnAction {

    public void actionPerformed(AnActionEvent event) {
        Project project = event.getData(PlatformDataKeys.PROJECT);

        TipDialog tipDialog = new TipDialog("Coding Rules", "Memory management", "7.2 Always use smart pointers for memory management, never use raw pointers for that", "No memory or resource management should be done using raw pointers, or using manual calls to alloc/free, new/delete, etc functions.\nUse smart pointers (std::unique_ptr, std::shared_ptr or std::weak_ptr) for memory management and RAII wrappers for managing of other resources (see below).", "void doMyFunction()\n {\n Object* memory = malloc(sizeof(Object)); // bad: manual memory management is not allowed; \"malloc\" is not allowed \n free(memory); // bad: manual memory management is not allowed; \"free\" is not allowed\n Object* another = new Object(); // bad: manual memory management is not allowed \n  delete another; // bad: manual memory management is not allowed \n Object obj{}; // good: do not allocate memory when it's not needed \n // ***** good: use smart pointers to avoid manual memory management, but only if heap allocation is reasonable \n std::unique_ptr<Object> yetAnotherObj = std::make_unique<Object>(); \n doSomething(yetAnotherObj); \n } \n");
        //tipDialog.show();
        //TipDialog dialog = new TipDialog();
        tipDialog.pack();
        tipDialog.setVisible(true);
        //System.exit(0);
        //Messages.showMessageDialog(TipsStorage.retrieveRandomTip(), "Coding tip", Messages.getQuestionIcon());
    }

    private boolean doesStorageContainAnyTip(){
        return (TextFileManager.readAllLines().size() > 0);
    }

    private String retrieveRandomTip(){
        List<String> allTips = TextFileManager.readAllLines();

        if(allTips.size() < 1)
            return "";

        Random rand = new Random();
        int tipIndex = rand.nextInt(allTips.size());
        return allTips.get(tipIndex);
    }
}
