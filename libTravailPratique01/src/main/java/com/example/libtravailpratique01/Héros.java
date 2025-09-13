package com.example.libtravailpratique01;

public class Héros extends Personnage{
    String nom;
    int genre;

    public Héros(int munition, int pointDeVie, String nom, int genre) {
        super(munition, pointDeVie);
        this.nom = nom;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Héros " + nom +
                " (" + ObtenirGenre() +
                ") " + "a " + munition +
                " munition(s)" +
                " et une santé de " +
                pointDeVie + "/4";
    }

    private String ObtenirGenre() {
        switch (genre) {
            case 1:
                return "homme";
            case 2:
                return "femme";
            default:
                return "non spécifié";
        }
    }
}
