package com.thoughtworks.rectangle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTest {

    @Test
    public void shouldReturnAreaWhenLengthAndBreadthAreGiven() {
        int length = 5;
        int breadth = 10;
        int expectedArea = 50;
        Rectangle rectangle = new Rectangle(length, breadth);
        int actualArea = rectangle.calculateArea();

        Assertions.assertEquals(expectedArea, actualArea, "Area calculation is incorrect");
    }

    @Test
    public void shouldReturnAreaOfZeroWhenLengthIsZero() {
        int length = 0;
        int breadth = 10;
        int expectedArea = 0;

        Rectangle rectangle = new Rectangle(length, breadth);
        int actualArea = rectangle.calculateArea();

        Assertions.assertEquals(expectedArea, actualArea, "Area calculation is incorrect");
    }
    
    @Test
    public void shouldReturnAreaOfZeroWhenBreadthIsZero() {
        int length = 5;
        int breadth = 0;
        int expectedArea = 0;

        Rectangle rectangle = new Rectangle(length, breadth);
        int actualArea = rectangle.calculateArea();

        Assertions.assertEquals(expectedArea, actualArea, "Area calculation is incorrect");
    }
    
    @Test
    public void shouldReturnAreaOfZeroWhenLengthIsNegative() {
        int length = -5;
        int breadth = 10;
        int expectedArea = 0;

        Rectangle rectangle = new Rectangle(length, breadth);
        int actualArea = rectangle.calculateArea();

        Assertions.assertEquals(expectedArea, actualArea, "Area calculation is incorrect");
    }
    
    @Test
    public void shouldReturnAreaOfZeroWhenBreadthIsNegative() {
        int length = 5;
        int breadth = -10;
        int expectedArea = 0;

        Rectangle rectangle = new Rectangle(length, breadth);
        int actualArea = rectangle.calculateArea();

        Assertions.assertEquals(expectedArea, actualArea, "Area calculation is incorrect");
    }
}