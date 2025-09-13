package com.example.libtravailpratique01;
import java.util.Random;

public class Algos {
    public static String ObtenirTemperament(){
        Random random = new Random();
        int nombre = random.nextInt(2);

        return (nombre == 0) ? "Gentil" : "Méchant";
    }

}
