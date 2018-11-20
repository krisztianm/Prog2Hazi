/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kilencedik_feladat;

/**
 *
 * @author Krisztian
 */
public class Hátizsák implements Comparable<Hátizsák>{
    private String márka;
    private double űrtartalom;
    private int zsebekSzáma;
    private boolean vízhatlan;

    public Hátizsák(String márka, double űrtartalom, int zsebekSzáma, boolean vízhatlan) {
        this.márka = márka;
        this.űrtartalom = űrtartalom;
        this.zsebekSzáma = zsebekSzáma;
        this.vízhatlan = vízhatlan;
    }

    public String getMárka() {
        return márka;
    }

    public double getŰrtartalom() {
        return űrtartalom;
    }

    public int getZsebekSzáma() {
        return zsebekSzáma;
    }

    public boolean isVízhatlan() {
        return vízhatlan;
    }

    @Override
    public String toString() {
        return márka + " márkájú hátizsák, " + zsebekSzáma + " zsebbel, hátizsák űrtartalma: " + űrtartalom + "; vízhatlan: " + vízhatlan;
    }
    
    @Override
    public int compareTo(Hátizsák t){
        return Integer.compare(this.zsebekSzáma, t.zsebekSzáma);
    }
}
