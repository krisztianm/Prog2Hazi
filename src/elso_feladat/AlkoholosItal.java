package elso_feladat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Krisztian
 */
public abstract class AlkoholosItal extends Ital implements Alkoholos {

    private String iz;
    private double alkoholTartalom;

    public AlkoholosItal(String i, double a) {
        this.iz = i;
        this.alkoholTartalom = a;
    }

    @Override
    public double mennyiAlkoholtTartalmaz() {
        return alkoholTartalom;
    }

    @Override
    public String milyenIzu() {
        return iz;
    }

    @Override
    public String toString() {
        return iz + "izu, " + alkoholTartalom + " alk.tartalmú ital";
    }

}
