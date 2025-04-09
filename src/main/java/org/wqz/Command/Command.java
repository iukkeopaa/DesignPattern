package org.wqz.Command;

// 命令接口
interface Command {
    void execute();
    void undo();
}