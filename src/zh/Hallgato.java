/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zh;

/**
 *
 * @author Krisztian
 */
public class Hallgato {

    public int mennyitKeszult;
    public boolean sokatTanul;

    public Hallgato(int mennyitKeszult, boolean sokatTanul) {
        this.mennyitKeszult = mennyitKeszult;
        this.sokatTanul = sokatTanul;
    }

    public Dolgozat dolgozatotIr() {
        double pontszam = 0;
        int esely = (int) (Math.random() * 100) + 1;
        if (esely == 1 || esely == 2) {
            return new Dolgozat(-1);
        }
        if (this.sokatTanul) {
            pontszam = this.mennyitKeszult * ((Math.random() * 4) + 4);
        } else {
            pontszam = this.mennyitKeszult * (Math.random() * 6);
        }

        return new Dolgozat(pontszam);
    }

    public String toString() {
        return mennyitKeszult + " " + sokatTanul;
    }
}
