// Alex Bedard
// TP1 Programmation d'applications mobiles

package com.example.libtravailpratique01;
import java.util.Random;

public class Algos {
    public static String ObtenirTemperament(){
        // passe 2 en parametre a Obtenir random pour obtenir 0 ou 1
        // et donc decider aleatoirement entre les deux options
        return (ObtenirRandom(2) == 0) ? "Gentil" : "Méchant";
    }

    public static boolean EstReussi(){
        // meme principe que pour obtenirTemperament
        return (ObtenirRandom(2) == 0) ? true : false;
    }

    public static int ObtenirRandom(int nombre){
        Random random = new Random();
        return random.nextInt(nombre);
    }
}
