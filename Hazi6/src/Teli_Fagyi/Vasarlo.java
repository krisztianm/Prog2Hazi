/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teli_Fagyi;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Krisztian
 */
public class Vasarlo {
    private String nev;
    private List<Fagylalt> fagylaltok;

    public Vasarlo(String nev) {
        this.nev = nev;
        this.fagylaltok = new ArrayList<Fagylalt>();
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public List<Fagylalt> getFagylaltok() {
        return fagylaltok;
    }

    public void setFagylaltok(List<Fagylalt> fagylaltok) {
        this.fagylaltok = fagylaltok;
    }

    @Override
    public String toString() {
        return "Vasarlo{" + "nev=" + nev + ", fagylaltok=" + fagylaltok + '}';
    }
}
