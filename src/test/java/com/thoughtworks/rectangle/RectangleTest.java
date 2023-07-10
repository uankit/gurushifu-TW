package com.thoughtworks.rectangle;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class RectangleTest {

    @Test
    public void shouldReturnAreaWhenLengthAndBreadthAreGiven() {
        int length = 5;
        int breadth = 10;
        int expectedArea = 50;
        Rectangle rectangle = new Rectangle(length, breadth);
        int actualArea = rectangle.calculateArea();

        assertThat(actualArea, is(equalTo(expectedArea)));
    }

    @Test
    public void shouldReturnAreaOfZeroWhenLengthIsZero() {
        int length = 0;
        int breadth = 10;
        int expectedArea = 0;

        Rectangle rectangle = new Rectangle(length, breadth);
        int actualArea = rectangle.calculateArea();

        assertThat(actualArea, is(equalTo(expectedArea)));
    }
    
    @Test
    public void shouldReturnAreaOfZeroWhenBreadthIsZero() {
        int length = 5;
        int breadth = 0;
        int expectedArea = 0;

        Rectangle rectangle = new Rectangle(length, breadth);
        int actualArea = rectangle.calculateArea();

        assertThat(actualArea, is(equalTo(expectedArea)));
    }
    
    @Test
    public void shouldReturnAreaOfZeroWhenLengthIsNegative() {
        int length = -5;
        int breadth = 10;
        int expectedArea = 0;

        Rectangle rectangle = new Rectangle(length, breadth);
        int actualArea = rectangle.calculateArea();

        assertThat(actualArea, is(equalTo(expectedArea)));
    }
    
    @Test
    public void shouldReturnAreaOfZeroWhenBreadthIsNegative() {
        int length = 5;
        int breadth = -10;
        int expectedArea = 0;

        Rectangle rectangle = new Rectangle(length, breadth);
        int actualArea = rectangle.calculateArea();

        assertThat(actualArea, is(equalTo(expectedArea)));
    }
}