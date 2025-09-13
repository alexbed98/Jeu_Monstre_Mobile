package com.example.libtravailpratique01;

public class Héros extends Personnage{
    String nom;
    char genre;

    public Héros(int munition, int pointDeVie, String nom, char genre) {
        super(munition, pointDeVie);
        this.nom = nom;
        this.genre = genre;
    }
}
