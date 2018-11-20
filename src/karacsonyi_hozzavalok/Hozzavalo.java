/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karacsonyi_hozzavalok;

/**
 *
 * @author Krisztian
 */
public class Hozzavalo implements Comparable<Hozzavalo> {

    private String nev;
    private int db;

    public Hozzavalo(String nev, int db) {
        this.nev = nev;
        this.db = db;
    }

    public String getNev() {
        return nev;
    }

    public int getDb() {
        return db;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setDb(int db) {
        this.db = db;
    }

    @Override
    public String toString() {
        return this.nev + ";" + this.db;
    }

    @Override
    public int compareTo(Hozzavalo t) {
        if (Integer.compare(this.getDb(), t.getDb()) == 0){
            return this.getNev().compareTo(t.getNev());
        }
        return -1 * (Integer.compare(this.getDb(), t.getDb()));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Hozzavalo)) {
            return false;
        }

        Hozzavalo h = (Hozzavalo) obj;

        return this.nev.equals(h.getNev());
    }

}
