package com.nisarg;

public class Square implements Shape {
    @Override
    public int calculateArea(int sideA, int sideB) {
        return sideA * sideB;
    }

    @Override
    public void printShapeDetails() {

    }

}
