package com.thoughtworks.rectangle;

public class Rectangle {

    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int calculateArea() {
        if(length < 0 || breadth < 0)
            return 0;
        return length * breadth;
    }
}


