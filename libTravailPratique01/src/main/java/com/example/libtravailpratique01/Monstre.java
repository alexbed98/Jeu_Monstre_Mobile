package com.example.libtravailpratique01;

public class Monstre extends Personnage{
    int nom;
    String race;

    public Monstre(int munition, int pointDeVie, int nom, String race) {
        super(munition, pointDeVie);
        this.nom = nom;
        this.race = race;
    }
}
