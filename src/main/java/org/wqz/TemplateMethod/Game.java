package org.wqz.TemplateMethod;

// 抽象类，定义模板方法和一些抽象步骤
abstract class Game {
    // 模板方法，定义了游戏的通用流程
    final void play() {
        initialize();
        startPlay();
        endPlay();
    }

    // 初始化游戏，具体实现由子类完成
    abstract void initialize();

    // 开始游戏，具体实现由子类完成
    abstract void startPlay();

    // 结束游戏，具体实现由子类完成
    abstract void endPlay();
}