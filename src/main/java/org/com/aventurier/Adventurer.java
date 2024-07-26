package org.com.aventurier;

public class Adventurer {

    private final Position position;
    private final Mapping mapping;

    // Constructeur pour initialiser le personnage avec une position de départ
    public Adventurer(Position startPosition, Mapping mapping) {
        this.position = startPosition;
        this.mapping = mapping;
    }

    // Méthode pour déplacer le personnage en suivant les instructions
    public void move(String directions) {
        for (char direction : directions.toCharArray()) {
            switch (direction) {
                case 'N':
                    if (mapping.isAccessible(position.getX(), position.getY() - 1)) {
                        position.updatePosition(0, -1); // Déplacement vers le Nord
                        System.out.println("Déplacé vers le Nord : " + position);
                    }
                    break;
                case 'S':
                    if (mapping.isAccessible(position.getX(), position.getY() + 1)) {
                        position.updatePosition(0, 1); // Déplacement vers le Sud
                        System.out.println("Déplacé vers le Sud : " + position);
                    }
                    break;
                case 'E':
                    if (mapping.isAccessible(position.getX() + 1, position.getY())) {
                        position.updatePosition(1, 0); // Déplacement vers l'Est
                        System.out.println("Déplacé vers l'Est : " + position);
                    }
                    break;
                case 'O':
                    if (mapping.isAccessible(position.getX() - 1, position.getY())) {
                        position.updatePosition(-1, 0); // Déplacement vers l'Ouest
                        System.out.println("Déplacé vers l'Ouest : " + position);
                    }
                    break;
            }
        }
    }

    // Méthode pour obtenir la position actuelle du personnage
    public Position getPosition() {
        return position;
    }
}
