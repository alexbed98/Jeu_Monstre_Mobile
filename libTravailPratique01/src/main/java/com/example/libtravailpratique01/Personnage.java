package com.example.libtravailpratique01;

public class Personnage implements Ijeu {
    int munition;
    int pointDeVie;

    public Personnage(int munition, int pointDeVie) {
        this.munition = munition;
        this.pointDeVie = pointDeVie;
    }

    @Override
    public int attaquer() {
        return 0;
    }

    @Override
    public void afficherEtat() {

    }
}