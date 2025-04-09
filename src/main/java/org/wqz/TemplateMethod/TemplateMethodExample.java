package org.wqz.TemplateMethod;

// 主类，用于测试模板方法模式
public class TemplateMethodExample {
    public static void main(String[] args) {
        Game footballGame = new Football();
        footballGame.play();

        System.out.println();

        Game basketballGame = new Basketball();
        basketballGame.play();
    }
}    