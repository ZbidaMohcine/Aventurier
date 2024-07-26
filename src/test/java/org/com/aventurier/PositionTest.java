package org.com.aventurier;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PositionTest {

    @Test
    void testUpdatePosition() {
        Position pos = new Position(5, 5);
        pos.updatePosition(3, -2);
        assertEquals(8, pos.getX(), "Position x should be updated correctly.");
        assertEquals(3, pos.getY(), "Position y should be updated correctly.");
    }

    @Test
    void testToString() {
        Position pos = new Position(7, 9);
        assertEquals("(7, 9)", pos.toString(), "Position string representation should be correct.");
    }
}
