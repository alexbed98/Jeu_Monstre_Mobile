// Alex Bedard
// TP1 Programmation d'applications mobiles

package com.example.libtravailpratique01;
import java.util.ArrayList;
import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        // variables initialisées a zero pour permettre d'entrer dans
        // la boucle de validation
        int genreHero = 1;  // valeur temporaire pour tester ***** doit etre remi a 0 *************
        int nombreMonstre = 10; // valeur temporaire pour tester ***** doit etre remis a 0 *********

        // constantes pour les constructeurs
        final int pointDeVieHero = 4;
        final int pointDeVieMonstre = 1;
        final int munitionHero = 20;
        final int munitionMonstre = 1;

        // pour compter et afficher le "round"
        int compteurDeTour = 1;

        int monstresTues = 0;

        // pour boucler le jeu tant que faux
        boolean jeuEnCours = true;

        // Demande des parametres a l'utilisateur
        System.out.println("*********** Démarrage du jeu ***********");
        System.out.print("Entrez le nom du héro: ");
        String nomHero = "alex";//scanner.nextLine();
        System.out.println("Entrez le genre du héro: ");

        while (genreHero < 1 || genreHero > 3) {
            System.out.print("homme [1], femme [2], non spécifié [3]: ");
            genreHero = scanner.nextInt();
        }
        //scanner.nextLine(); // *********************************** mit en commentaire pour tester

        System.out.print("Entrez la race des monstres: ");
        String raceMonstres = "trolls";//scanner.nextLine();

        while (nombreMonstre < 1 || nombreMonstre > 20) {
            System.out.println("Combien de monstre voulez-vous affronter? ");
            System.out.print("Entrez une valeur entre 1 et 20: ");
            nombreMonstre = scanner.nextInt();
        }
        //scanner.nextLine(); // *********************************** mit en commentaire pour tester

        // Generation du hero
        Héros hero = new Héros(munitionHero, pointDeVieHero, nomHero, genreHero);

        // Generation des monstres et d'une liste de monstre
        ArrayList<Monstre> monstresEnVie = new ArrayList<>();

        for (int i = 0; i < nombreMonstre; i++){
            monstresEnVie.add(new Monstre(munitionMonstre,
                    pointDeVieMonstre, i + 1, raceMonstres));
        }

        // Presentation des monstres
        System.out.println();
        System.out.println();
        System.out.println("Le héros doit se battre contre");
        for (Monstre monstre : monstresEnVie){
            monstre.afficherEtat();
        }

        // Boucle de jeu principal
        do {
            System.out.println();
            hero.afficherEtat();
            System.out.println("** À l'attaque - " + compteurDeTour + " **" );

            // prise du nombre de munition avec validation
            System.out.print(("Le héro veut attaquer avec combien de munitions: "));
            int munitionUtilise = scanner.nextInt();
            while (munitionUtilise > hero.munition || munitionUtilise < 1){
                System.out.println(hero.nom + " veuillez attaquer avec un nombre " +
                        "de munition entre 1 et " + hero.munition);
                System.out.print(("Le héro veut attaquer avec combien de munitions: "));
                munitionUtilise = scanner.nextInt();
            }

            // attaque du hero dans une boucle (selon le nombre de munition utilise)
            // pour le if c'est une methode qui retourne un bool de 50% de chance
            for (int i = 0; i < munitionUtilise; i++){
                if (Algos.EstReussi()){
                    // on enleve de la liste de monstre a l'index qui est
                    // choisi au hasard selon la longueur de la liste
                    monstresEnVie.remove(Algos.ObtenirRandom(monstresEnVie.size()));
                    monstresTues++;
                }
            }



            // affichage du nombre de monstres tues et reinitialisation
            // du nombre a zero pour la prochaine manche
            System.out.println(monstresTues + " monstre(s) éliminé(s)!");
            monstresTues = 0;

            scanner.nextLine();
            System.out.println("Voici les monstres encore en vie:");
            for (Monstre monstre : monstresEnVie){
                monstre.afficherEtat();
            }

            System.out.println();
            System.out.println("Appuyer sur [ENTER] pour continuer");
            scanner.nextLine();

            hero.pointDeVie = 0;

            if (hero.pointDeVie < 1 ){
                System.out.println();
                System.out.println("Fin du jeu - Le héros est mort");
                jeuEnCours = false;
                System.exit(0);
            }
            else if (hero.munition < 1){
                System.out.println();
                System.out.println("Fin du jeu - Le héros n'a plus de munition");
                jeuEnCours = false;
                System.exit(0);
            }
            else if (monstresEnVie.size() < 1){
                System.out.println();
                System.out.println("Fin du jeu - Le héros a tué tous les monstres - Bravo!");
                jeuEnCours = false;
                System.exit(0);
            }

        } while (jeuEnCours);
    }
}
