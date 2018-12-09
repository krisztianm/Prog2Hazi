/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teli_Fagyi;

/**
 *
 * @author Krisztian
 */
public class Fagylalt {
    private String iz;
    private int ar;

    public Fagylalt(String iz) {
        this.iz = iz;
    }

    public String getIz() {
        return iz;
    }

    public void setIz(String iz) {
        this.iz = iz;
    }

    public int getAr() {
        return ar;
    }

    public void setAr(int ar) {
        this.ar = ar;
    }

    @Override
    public String toString() {
        return "Fagylalt{" + "iz=" + iz + ", ar=" + ar + '}';
    }
    
    @Override
    public boolean equals(Object obj){
        if (obj == null || !(obj instanceof Fagylalt)){
            return false;
        }
        
        Fagylalt f = (Fagylalt) obj;
        
        return this.iz.equals(f.getIz());
    }
}
