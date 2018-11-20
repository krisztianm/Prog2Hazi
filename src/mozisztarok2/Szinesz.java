/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mozisztarok2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Krisztian
 */
public class Szinesz implements Comparable<Szinesz>{
    private String nev;
    private int szuletesiEv;
    private List<String> filmek;

    public Szinesz(String nev, int szuletesiEv) {
        this.nev = nev;
        this.szuletesiEv = szuletesiEv;
        this.filmek = new ArrayList<String>();
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getSzuletesiEv() {
        return szuletesiEv;
    }

    public void setSzuletesiEv(int szuletesiEv) {
        this.szuletesiEv = szuletesiEv;
    }

    public List<String> getFilmek() {
        return filmek;
    }

    public void setFilmek(List<String> filmek) {
        this.filmek = filmek;
    }

    @Override
    public String toString() {
        return this.szuletesiEv + ": " + this.nev;
    }

    @Override
    public boolean equals(Object o){
        if (o == null ||!(o instanceof Szinesz)){
            return false;
        }
        
        Szinesz sz = (Szinesz) o;
        
        return this.nev.equals(sz.getNev());
    }
    
    @Override
    public int compareTo(Szinesz t) {
        if (this.szuletesiEv == t.getSzuletesiEv()){
            return this.nev.compareTo(t.getNev());
        } else {
            return Integer.compare(this.szuletesiEv, t.getSzuletesiEv());
        }
    }
}
