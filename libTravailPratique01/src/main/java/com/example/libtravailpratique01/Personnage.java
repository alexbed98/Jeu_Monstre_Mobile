package com.example.libtravailpratique01;

public abstract class Personnage implements Ijeu {
    int munition;
    int pointDeVie;

    public Personnage(int munition, int pointDeVie) {
        this.munition = munition;
        this.pointDeVie = pointDeVie;
    }
}