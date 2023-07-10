package com.thoughtworks.rectangle;

public class Rectangle {

    final private double length;
    final private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double area() {
        if(length < 0 || breadth < 0)
            return 0;
        return length * breadth;
    }
}


