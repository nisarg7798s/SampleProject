package com.nisarg;

public class Rectangle extends AbstractRectangle{
    int sideA;
    int sideB;

    @Override
    public int calculateArea(int sideA, int sideB) {
        return sideA * sideB;
    }

    @Override
    public void printShapeDetails() {

    }
}
