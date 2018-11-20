/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jegkorongmerkozesek;

/**
 *
 * @author Krisztian
 */
public class Csapat implements Comparable<Csapat> {

    private String orszag;
    private int golok;
    private int pontszam;

    public Csapat(String orszag) {
        this.orszag = orszag;
    }

    public String getOrszag() {
        return orszag;
    }

    public void setOrszag(String orszag) {
        this.orszag = orszag;
    }

    public int getGolok() {
        return golok;
    }

    public void setGolok(int golok) {
        this.golok = golok;
    }

    public int getPontszam() {
        return pontszam;
    }

    public void setPontszam(int pontszam) {
        this.pontszam = pontszam;
    }

    @Override
    public String toString() {
        return orszag + ": " + pontszam + " points (" + golok + " scored goals)";
    }

    @Override
    public int compareTo(Csapat t) {
        if (this.pontszam == t.getPontszam()) {
            if (this.golok == t.getGolok()) {
                return this.orszag.compareTo(t.getOrszag());
            } else {
                return -1 * (Integer.compare(this.golok, t.getGolok()));
            }
        } else {
            return -1 * (Integer.compare(this.pontszam, t.getPontszam()));
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || !(o instanceof Csapat)) {
            return false;
        }

        Csapat cs = (Csapat) o;

        return this.orszag.equals(cs.getOrszag());
    }
}
