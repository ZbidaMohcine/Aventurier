package org.com.aventurier;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Lire la carte à partir du fichier
            Mapping mapping = new Mapping("src/main/resources/carte.txt");

            // Lire les mouvements et la position initiale depuis le fichier
            BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/movements.txt"));
            String[] initialPosition = reader.readLine().split(",");
            Position startPosition = new Position(
                    Integer.parseInt(initialPosition[0]),
                    Integer.parseInt(initialPosition[1])
            );
            String movements = reader.readLine();
            reader.close();

            // Initialiser le personnage et appliquer les mouvements
            Adventurer adventurer = new Adventurer(startPosition, mapping);
            adventurer.move(movements);

            // Afficher la position finale du personnage
            System.out.println("Position finale du personnage: " + adventurer.getPosition());

        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture des fichiers: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Erreur de format des coordonnées initiales: " + e.getMessage());
        }
    }
}
