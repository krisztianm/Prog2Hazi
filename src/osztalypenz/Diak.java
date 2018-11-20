/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osztalypenz;

import java.util.Objects;

/**
 *
 * @author Krisztian
 */
public class Diak implements Comparable<Diak> {

    private String nev;
    private int osszeg;

    public Diak(String nev) {
        this.nev = nev;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getOsszeg() {
        return osszeg;
    }

    public void setOsszeg(int osszeg) {
        this.osszeg = osszeg;
    }

    @Override
    public String toString() {
        return nev + ";" + osszeg;
    }

    @Override
    public int compareTo(Diak t) {
        if (Integer.compare(this.getOsszeg(), t.getOsszeg()) == 0) {
            return (this.getNev().compareTo(t.getNev()));
        } else {
            return -1 * (Integer.compare(this.getOsszeg(), t.getOsszeg()));
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Diak)) {
            return false;
        }

        Diak d = (Diak) obj;

        return this.getNev().equals(d.getNev());
    }

}
