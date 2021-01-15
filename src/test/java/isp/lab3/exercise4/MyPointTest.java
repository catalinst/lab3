package isp.lab3.exercise4;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyPointTest {

    @Test
    public void testConstructors() {
        MyPoint myPoint = new MyPoint();
        assertEquals("Point default y index should be 0", 0, myPoint.getX());
        assertEquals("Point default y index should be 0", 0, myPoint.getY());
        assertEquals("Point default z index should be 0", 0, myPoint.getZ());

        MyPoint myPoint1 = new MyPoint(6, 7, 8);
        assertEquals("Point x index should be 6", 6, myPoint1.getX());
        assertEquals("Point y index should be 7", 7, myPoint1.getY());
        assertEquals("Point z index should be 8", 8, myPoint1.getZ());
    }

    @Test
    public void getX() {
        MyPoint myPoint = new MyPoint();
        assertEquals("Point default x index should be 0", 0, myPoint.getX());
        MyPoint myPoint1 = new MyPoint(2, 4, 6);
        assertEquals("Point x index should be 2", 2, myPoint1.getX());
    }

    @Test
    public void getY() {
        MyPoint myPoint = new MyPoint();
        assertEquals("Point default y index should be 0", 0, myPoint.getY());
        MyPoint myPoint1 = new MyPoint(12, 4, 6);
        assertEquals("Point y index should be 4", 4, myPoint1.getY());
    }

    @Test
    public void getZ() {
        MyPoint myPoint = new MyPoint();
        assertEquals("Point default z index should be 0", 0, myPoint.getZ());
        MyPoint myPoint1 = new MyPoint(12, 4, 6);
        assertEquals("Point z index should be 6", 6, myPoint1.getZ());
    }

    @Test
    public void setX() {
        MyPoint myPoint = new MyPoint(10, 10, 10);
        assertEquals("Point x index should be 10", 10, myPoint.getX());
        myPoint.setX(50);
        assertEquals("Now the x index should be 50", 50, myPoint.getX());
    }

    @Test
    public void setY() {
        MyPoint myPoint = new MyPoint(10, 10, 10);
        assertEquals("Point y index should be 10", 10, myPoint.getY());
        myPoint.setY(20);
        assertEquals("Now the y index should be 20", 20, myPoint.getY());
    }

    @Test
    public void setZ() {
        MyPoint myPoint = new MyPoint(10, 10, 10);
        assertEquals("Point z index should be 10", 10, myPoint.getZ());
        myPoint.setZ(80);
        assertEquals("Now the z index should be 80", 80, myPoint.getZ());
    }

    @Test
    public void setXYZ() {
        MyPoint myPoint = new MyPoint(20, 20, 20);
        myPoint.setXYZ(50, 100, 150);
        assertEquals("Now the x index should be 50", 50, myPoint.getX());
        assertEquals("Now the y index should be 100", 100, myPoint.getY());
        assertEquals("Now the z index should be 150", 150, myPoint.getZ());
    }

    @Test
    public void testToString() {
        MyPoint myPoint = new MyPoint(1, 2, 3);
        assertEquals("ToString should return", "(1,2,3)", myPoint.toString());

    }

    @Test
    public void distance() {
        MyPoint myPoint = new MyPoint();
        assertEquals("Distance should be", 5, myPoint.distance(3, 4, 0),0);
    }

    @Test
    public void testDistance() {
        MyPoint myPoint = new MyPoint();
        MyPoint point2 = new MyPoint(5,10,15);
        assertEquals("Distance should be", 18, Math.floor(myPoint.distance(point2)),0);
    }
}