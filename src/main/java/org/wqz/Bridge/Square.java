package org.wqz.Bridge;

class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.print("Drawing a square. ");
        color.applyColor();
    }
}
