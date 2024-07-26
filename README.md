# Aventurier

## Description

Le projet **Aventurier** modélise les déplacements d'un personnage sur une carte en utilisant Java. Le personnage peut se déplacer en fonction des directions spécifiées dans un fichier d'instructions et doit éviter les obstacles (bois impénétrables) sur la carte.

## Fonctionnalités

- Lecture de la carte depuis un fichier texte.
- Lecture des mouvements et de la position initiale depuis un fichier.
- Déplacement du personnage selon les instructions (N, S, E, O).
- Vérification de l'accessibilité des positions sur la carte.

## Structure du Projet

- **src/main/java/org/test/Mapping.java**: Classe qui gère la carte et vérifie l'accessibilité des positions.
- **src/main/java/org/test/Position.java**: Classe représentant la position du personnage.
- **src/main/java/org/test/Adventurer.java**: Classe représentant le personnage et gérant ses déplacements.
- **src/main/java/org/test/Main.java**: Point d'entrée du programme qui lit les fichiers d'entrée, initialise le personnage et affiche sa position finale.
- **src/test/java/org/test/MappingTest.java**: Test unitaire pour vérifier la fonctionnalité de la classe `Mapping`.
- **src/test/java/org/test/AdventurerTest.java**: Test unitaire pour vérifier la fonctionnalité de la classe `Adventurer`.
- **src/test/java/org/test/PositionTest.java**: Test unitaire pour vérifier la fonctionnalité de la classe `Position`.

## Installation

1. Clonez le dépôt :

   ```bash
   git clone https://github.com/ZbidaMohcine/Aventurier.git

    Accédez au répertoire du projet :


    cd Aventurier

    Assurez-vous d'avoir Maven installé pour gérer les dépendances et exécuter les tests. Sinon, vous pouvez utiliser un IDE comme IntelliJ IDEA ou Eclipse pour importer le projet.

Utilisation

    Placez le fichier carte.txt contenant la carte et le fichier movements.txt contenant les instructions de déplacement dans le répertoire src/main/resources/.

    Exécutez le programme en utilisant Maven :

    bash

    mvn exec:java -Dexec.mainClass="org.test.Main"

    Le programme affichera la position finale du personnage après avoir appliqué tous les mouvements.


Cas de Test

    Fichier movements.txt :

3,0
SSSSEEEEEENN

Résultat attendu : (9, 2)



Tests


Pour exécuter les tests unitaires avec Maven, utilisez la commande suivante :

```bash

mvn test

