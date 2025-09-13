package com.example.libtravailpratique01;
import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        // initialisé a zero pour commencer en dehors de la boucle de validation
        // et donc entrer dedans
        int genreHero = 0;

        // constantes pour les constructeurs
        final int pointDeVieHero = 4;
        final int pointDeVieMonstre = 1;
        final int munitionHero = 20;
        final int munitionMonstre = 1;

        // Demande des parametres a l'utilisateur
        System.out.println("*********** Démarrage du jeu ***********");
        System.out.print("Entrez le nom du héro: ");
        String nomHero = scanner.nextLine();
        System.out.println("Entrez le genre du héro: ");

        while (genreHero < 1 || genreHero > 3) {
            System.out.print("homme [1], femme [2], non spécifié [3]: ");
            genreHero = scanner.nextInt();
        }

        scanner.nextLine();
        System.out.print("Entrez la race des monstres: ");
        String raceMonstres = scanner.nextLine();

        System.out.print("Combien de monstre voulez-vous affronter: ");
        int nombreMonstre = scanner.nextInt();
        scanner.nextLine();

        // Generation du hero

    }
}
