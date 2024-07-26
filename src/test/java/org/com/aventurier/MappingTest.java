package org.com.aventurier;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class MappingTest {

    private Mapping mapping;

    @BeforeEach
    void setUp() throws IOException {
        // Assuming `carte.txt` contains the map for the tests
        mapping = new Mapping("src/main/resources/carte.txt");
    }

    @Test
    void testIsAccessible() {
        // Modifiez ces assertions en fonction du contenu de `carte.txt`
        assertFalse(mapping.isAccessible(0, 0), "Position (0, 0) should not be accessible."); // '#'
        assertTrue(mapping.isAccessible(4, 0), "Position (4, 0) should be accessible."); // ' '
        assertFalse(mapping.isAccessible(0, 1), "Position (0, 1) should not be accessible."); // '#'
        assertTrue(mapping.isAccessible(4, 1), "Position (4, 1) should be accessible."); // ' '
        assertFalse(mapping.isAccessible(0, 5), "Position (0, 5) should not be accessible."); // '#'
        assertTrue(mapping.isAccessible(5, 5), "Position (5, 5) should be accessible."); // ' '
        assertFalse(mapping.isAccessible(10, 20), "Position (10, 20) should not be accessible."); // '#'
        assertTrue(mapping.isAccessible(5, 18), "Position (5, 18) should be accessible."); // ' '
        assertFalse(mapping.isAccessible(-1, 0), "Position (-1, 0) should be out of bounds."); // out of bounds
        assertFalse(mapping.isAccessible(100, 0), "Position (100, 0) should be out of bounds."); // out of bounds
    }
}

