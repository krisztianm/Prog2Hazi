/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iskola;

import java.util.Arrays;

/**
 *
 * @author Krisztian
 */
public class Orarend {

    private String nap;
    private Ora[] órák;
    private int órákSzáma;

    public Orarend(String nap) {
        this.nap = nap;
        this.órák = new Ora[12];
        this.órákSzáma = 0;
    }

    public String getNap() {
        return nap;
    }

    public Ora[] getÓrák() {
        return órák;
    }

    public int getÓrákSzáma() {
        return órákSzáma;
    }

    public void setNap(String nap) {
        this.nap = nap;
    }

    public void setÓrák(Ora[] órák) {
        this.órák = órák;
    }

    public void setÓrákSzáma(int órákSzáma) {
        this.órákSzáma = órákSzáma;
    }

    public boolean oratHozzaad(Ora o) {
        if (this.órákSzáma >= 12) {
            return false;
        } else {

            for (int i = 0; i <= this.órákSzáma; i++) {
                if (this.órák[i] == o) {
                    return false;
                }
            }

            this.órák[this.órákSzáma] = o;
            this.órákSzáma++;

            return true;

        }
    }

    @Override
    public String toString() {
        return "Órarend: " + nap + " napon " + órákSzáma + " db óra van: " + Arrays.toString(órák);
    }

}
