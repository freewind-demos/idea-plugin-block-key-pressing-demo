package actions

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.ui.Messages

class HelloAction : AnAction() {

    override fun actionPerformed(event: AnActionEvent) {
        println("event.inputEvent.isShiftDown: " + event.inputEvent.isShiftDown)
        Messages.showInfoMessage("Hello from my plugin", "Hello")
    }

}