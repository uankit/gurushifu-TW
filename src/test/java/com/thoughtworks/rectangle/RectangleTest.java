package com.thoughtworks.rectangle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTest {

    @Test
    public void testCalculateArea() {
        int length = 5;
        int breadth = 10;
        int expectedArea = 50;
        Rectangle rectangle = new Rectangle(length, breadth);
        int actualArea = rectangle.calculateArea();

        Assertions.assertEquals(expectedArea, actualArea, "Area calculation is incorrect");
    }

    @Test
    public void testCalculateAreaWithZeroLength() {
        int length = 0;
        int breadth = 10;
        int expectedArea = 0;

        Rectangle rectangle = new Rectangle(length, breadth);
        int actualArea = rectangle.calculateArea();

        Assertions.assertEquals(expectedArea, actualArea, "Area calculation is incorrect");
    }
    
    @Test
    public void testCalculateAreaWithZerobreadth() {
        int length = 5;
        int breadth = 0;
        int expectedArea = 0;

        Rectangle rectangle = new Rectangle(length, breadth);
        int actualArea = rectangle.calculateArea();

        Assertions.assertEquals(expectedArea, actualArea, "Area calculation is incorrect");
    }
    
    @Test
    public void testCalculateAreaWithNegativeLength() {
        int length = -5;
        int breadth = 10;
        int expectedArea = -50;

        Rectangle rectangle = new Rectangle(length, breadth);
        int actualArea = rectangle.calculateArea();

        Assertions.assertEquals(expectedArea, actualArea, "Area calculation is incorrect");
    }
    
    @Test
    public void testCalculateAreaWithNegativebreadth() {
        int length = 5;
        int breadth = -10;
        int expectedArea = -50;

        Rectangle rectangle = new Rectangle(length, breadth);
        int actualArea = rectangle.calculateArea();

        Assertions.assertEquals(expectedArea, actualArea, "Area calculation is incorrect");
    }
}