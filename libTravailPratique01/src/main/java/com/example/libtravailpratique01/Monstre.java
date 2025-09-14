// Alex Bedard
// TP1 Programmation d'applications mobiles

package com.example.libtravailpratique01;

import java.util.Objects;

public class Monstre extends Personnage{
    int nom;
    String race;
    String temperament;
    final int chance = 50;

    public Monstre(int munition, int pointDeVie, int nom, String race) {
        super(munition, pointDeVie);
        this.nom = nom;
        this.race = race;
        this.temperament = Algos.ObtenirTemperament();
    }

    @Override
    public int attaquer(int munitionUtilise) {
        int dommageSurHero = 0;

        if (munition > 0 &&
                Objects.equals(temperament, "Méchant") &&
                Algos.EstReussi(chance)){
                    dommageSurHero++;
                    munition--;
        }

        return dommageSurHero;
    }

    @Override
    public void afficherEtat() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Monstre " + nom +
                " (est " + temperament +
                ") de race " + race +
                " a " + munition +
                " munition et une santé de " +
                pointDeVie + "/1";
    }
}
