package isp.lab3.exercise1;

import org.junit.Test;

import static org.junit.Assert.*;

public class TreeTest {

    @Test
    public void testConstructor() {
        Tree tree = new Tree();
        assertEquals("Constructor should make tree height 15", 15, tree.getHeight());
    }

    @Test
    public void testGrow() {
        Tree tree = new Tree();
        tree.grow(10);
        // assertsEquals structure: message, expected, actual
        // expected: zici cat te astepti
        // actual: vezi rezultatul din proces
        assertEquals("Should set height to 15 + 10", 25, tree.getHeight());
        tree.grow(-10);
        assertEquals("Should remain the preveious height", 25, tree.getHeight());
        tree.grow(20);
        assertEquals("Height should now be 45", 45, tree.getHeight());
    }

    @Test
    public void testToString() {
        Tree tree = new Tree();
        // assertEquals("Checking toString","Tree{height=15}", tree); not working
        assertEquals("Checking toString","Tree{height=15}", tree.toString());
    }
}