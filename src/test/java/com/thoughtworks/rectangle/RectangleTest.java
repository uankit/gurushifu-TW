package com.thoughtworks.rectangle;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.closeTo;

public class RectangleTest {

    @Test
    public void shouldReturnAreaWhenLengthAndBreadthAreGiven() {
        double length = 5;
        double breadth = 10;
        double expectedArea = 50;
        Rectangle rectangle = new Rectangle(length, breadth);
        double actualArea = rectangle.area();

        assertThat(actualArea, is(closeTo(expectedArea, 0.01)));
    }

    @Test
    public void shouldReturnAreaOfZeroWhenLengthIsZero() {
        double length = 0;
        double breadth = 10;
        double expectedArea = 0;

        Rectangle rectangle = new Rectangle(length, breadth);
        double actualArea = rectangle.area();

        assertThat(actualArea, is(closeTo(expectedArea, 0.01)));
    }
    
    @Test
    public void shouldReturnAreaOfZeroWhenBreadthIsZero() {
        double length = 5;
        double breadth = 0;
        double expectedArea = 0;

        Rectangle rectangle = new Rectangle(length, breadth);
        double actualArea = rectangle.area();

        assertThat(actualArea, is(closeTo(expectedArea, 0.01)));
    }
    
    @Test
    public void shouldReturnAreaOfZeroWhenLengthIsNegative() {
        double length = -5;
        double breadth = 10;
        double expectedArea = 0;

        Rectangle rectangle = new Rectangle(length, breadth);
        double actualArea = rectangle.area();

        assertThat(actualArea, is(closeTo(expectedArea, 0.01)));
    }
    
    @Test
    public void shouldReturnAreaOfZeroWhenBreadthIsNegative() {
        double length = 5;
        double breadth = -10;
        double expectedArea = 0;

        Rectangle rectangle = new Rectangle(length, breadth);
        double actualArea = rectangle.area();

        assertThat(actualArea, is(closeTo(expectedArea, 0.01)));
    }

    @Test
    public void shouldReturnAreaCloseTo782Point264WhenLengthAndBreadthAreGiven() {
        double length = 36.64;
        double breadth = 21.35;
        double expectedArea = 782.264;

        Rectangle rectangle = new Rectangle(length, breadth);
        double actualArea = rectangle.area();

        assertThat(actualArea, is(closeTo(expectedArea, 0.01)));
    }

}