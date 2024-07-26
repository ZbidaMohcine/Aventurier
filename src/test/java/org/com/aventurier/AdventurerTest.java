package org.com.aventurier;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AdventurerTest {

    private Adventurer adventurer;
    private Mapping mapping;

    @BeforeEach
    void setUp() throws IOException {
        // Lire la carte pour les tests
        mapping = new Mapping("src/main/resources/carte.txt");
    }

    @Test
    void testMoveFromInitialPosition() {
        // Position initiale donnée
        Position startPosition = new Position(3, 0);
        adventurer = new Adventurer(startPosition, mapping);

        // Mouvements à tester
        String movements = "SSSSEEEEEENN";
        adventurer.move(movements);

        // Vérifier la position finale attendue
        Position expectedPosition = new Position(9, 2); // Attendu pour ce cas de test
        assertEquals(expectedPosition, adventurer.getPosition(), "La position finale devrait être (9, 2).");
    }
}

