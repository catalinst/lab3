package isp.lab3.exercise2;

import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    @Test
    public void testConstructors() {
        Rectangle rectangle = new Rectangle(2, 4, "yellow");
        assertEquals("Object should have the length 2", 2, rectangle.getLength());
        assertEquals("Object should have the width 4", 4, rectangle.getWidth());
        assertEquals("Object should have the color yellow", "yellow", rectangle.getColor());

        Rectangle rectangle1 = new Rectangle(10, 20);
        assertEquals("Object should have the length 10", 10, rectangle1.getLength());
        assertEquals("Object should have the width 20", 20, rectangle1.getWidth());
        assertEquals("Object should have the color red", "red", rectangle1.getColor());
    }

    @Test
    public void getLength() {
        Rectangle rectangle = new Rectangle(2,10);
        assertEquals("Object's length should be 2", 2, rectangle.getLength());
    }

    @Test
    public void getWidth() {
        Rectangle rectangle = new Rectangle(2,10);
        assertEquals("Object's width should be 10", 10, rectangle.getWidth());
    }

    @Test
    public void getColor() {
        Rectangle rectangle = new Rectangle(5,5);
        assertEquals("Object's default color should be red", "red", rectangle.getColor());
        Rectangle rectangle1 = new Rectangle(2, 2, "blue");
        assertEquals("Object's personalised should be blue", "blue", rectangle1.getColor());
    }

    @Test
    public void getPerimeter() {
        Rectangle rectangle = new Rectangle(10, 10);
        assertEquals("Object's perimeter should be 40", 40, rectangle.getPerimeter());
    }

    @Test
    public void getArea() {
        Rectangle rectangle = new Rectangle(10, 10);
        assertEquals("Object's area should be 100", 100, rectangle.getArea());
    }
}