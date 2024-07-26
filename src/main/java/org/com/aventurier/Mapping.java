package org.com.aventurier;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Mapping {
    private char[][] map;
    private int rows;
    private int columns;

    // Constructeur pour lire la carte depuis un fichier
    public Mapping(String fileName) throws IOException {
        readMap(fileName);
    }

    // Lecture de la carte à partir d'un fichier texte
    private void readMap(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            this.rows = 0;

            // Lire chaque ligne du fichier
            while ((line = reader.readLine()) != null) {
                if (map == null) {
                    this.columns = line.length();
                    map = new char[25][columns]; // Taille maximum de la carte fixée à 25x25
                }
                map[rows++] = line.toCharArray();
            }
        }
    }

    // Vérifie si une position est accessible sur la carte
    public boolean isAccessible(int x, int y) {
        if (x < 0 || x >= columns || y < 0 || y >= rows) {
            return false; // Position en dehors des limites de la carte
        }
        return map[y][x] == ' '; // Accessible si la case est un espace vide
    }

    // Méthode pour afficher la carte (pour le débogage)
    public void printMap() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }
}
