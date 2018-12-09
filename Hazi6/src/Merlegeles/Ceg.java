/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Merlegeles;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Krisztian
 */
public class Ceg implements Comparable<Ceg>{
    private String cegNev;
    private String telepHely;
    private List<Integer> ev;
    private int bevetel;

    public String getCegNev() {
        return cegNev;
    }

    public void setCegNev(String cegNev) {
        this.cegNev = cegNev;
    }

    public String getTelepHely() {
        return telepHely;
    }

    public void setTelepHely(String telepHely) {
        this.telepHely = telepHely;
    }

    public List<Integer> getEv() {
        return ev;
    }

    public void setEv(List<Integer> ev) {
        this.ev = ev;
    }


    public int getBevetel() {
        return bevetel;
    }

    public void setBevetel(int bevetel) {
        this.bevetel = bevetel;
    }

    public Ceg(String cegNev, String telepHely) {
        this.cegNev = cegNev;
        this.telepHely = telepHely;
        this.ev = new ArrayList<Integer>();
        this.bevetel = 0;
    }

    @Override
    public String toString() {
        return this.getCegNev() + " (" + this.getTelepHely() + "): " + this.getBevetel();
    }
    
    @Override
    public boolean equals(Object obj){
        if (obj == null || !(obj instanceof Ceg)){
            return false;
        }
        
        Ceg c = (Ceg) obj;
        
        return this.getCegNev().equals(c.getCegNev()) && this.getTelepHely().equals(c.getTelepHely());
    }
    
    @Override
    public int compareTo(Ceg c){
        if (this.getBevetel() == c.getBevetel()){
            if (this.getEv().size() == c.getEv().size()){
                return this.getCegNev().compareTo(c.getCegNev());
            } else {
                return Integer.compare(this.getEv().size(),c.getEv().size());
            }
        } else {
            return -1 * Integer.compare(this.getBevetel(), c.getBevetel());
        }
    }
}
