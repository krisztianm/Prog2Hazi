/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elso_feladat;

/**
 *
 * @author Krisztian
 */
public class Termek implements Comparable<Termek> {

    private String nev;
    private String egyseg;
    private double ar;
    private int db;

    public Termek(String nev, double ar, String egyseg) {
        this.nev = nev;
        this.egyseg = egyseg;
        this.ar = ar;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getEgyseg() {
        return egyseg;
    }

    public void setEgyseg(String egyseg) {
        this.egyseg = egyseg;
    }

    public double getAr() {
        return ar;
    }

    public void setAr(double ar) {
        this.ar = ar;
    }

    public int getDb() {
        return db;
    }

    public void setDb(int db) {
        this.db = db;
    }

    @Override
    public String toString() {
        return "Termek{" + "nev=" + nev + ", egyseg=" + egyseg + ", ar=" + ar + ", db=" + db + '}';
    }

    @Override
    public int compareTo(Termek t) {
        if (this instanceof Elelmiszer && !(t instanceof Tartos)) {
            Elelmiszer e1 = (Elelmiszer) this;
            Elelmiszer e2 = (Elelmiszer) t;

            if (e1.getNev().equals(e2.getNev())) {
                return Integer.compare(e1.getSzavatossag(), e2.getSzavatossag());
            } else {
                return e1.getNev().compareTo(e2.getNev());
            }
        } else {
            return this.getNev().compareTo(t.getNev());
        }
    }

}
