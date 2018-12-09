/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kektura;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Krisztian
 */
public class Turazo implements Comparable{
    private String nev;
    private List<String> szakasz;

    public Turazo(String nev) {
        this.nev = nev;
        this.szakasz = new ArrayList<String>();
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public List<String> getSzakasz() {
        return szakasz;
    }

    public void setSzakasz(List<String> szakasz) {
        this.szakasz = szakasz;
    }

    @Override
    public String toString() {
        return nev;
    }
    
    @Override
    public boolean equals(Object obj){
        if (obj == null || !(obj instanceof Turazo)){
            return false;
        }
        
        Turazo t = (Turazo) obj;
        
        return this.getNev().equals(t.getNev());
    }
    
    @Override
    public int compareTo(Object obj){
        Turazo t = (Turazo) obj;
        
        return this.getNev().compareTo(t.getNev());
    }
}
