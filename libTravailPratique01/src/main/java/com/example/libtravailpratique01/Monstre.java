package com.example.libtravailpratique01;

public class Monstre extends Personnage{
    int nom;
    String race;
    String temperament;

    public Monstre(int munition, int pointDeVie, int nom, String race) {
        super(munition, pointDeVie);
        this.nom = nom;
        this.race = race;
        this.temperament = Algos.ObtenirTemperament();
    }

    @Override
    public int attaquer() {
        return 0;
    }

    @Override
    public void afficherEtat() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Monstre " + nom +
                " (est " + temperament +
                " ) de race " + race +
                " a " + munition +
                " munition et une santé de " +
                pointDeVie + "/1";
    }
}
