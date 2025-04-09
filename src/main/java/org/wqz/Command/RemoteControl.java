package org.wqz.Command;

// 遥控器类
class RemoteControl {
    private Command onCommand;
    private Command offCommand;
    private Command undoCommand;

    public void setCommands(Command onCommand, Command offCommand) {
        this.onCommand = onCommand;
        this.offCommand = offCommand;
    }

    public void pressOnButton() {
        onCommand.execute();
        undoCommand = onCommand;
    }

    public void pressOffButton() {
        offCommand.execute();
        undoCommand = offCommand;
    }

    public void pressUndoButton() {
        undoCommand.undo();
    }
}