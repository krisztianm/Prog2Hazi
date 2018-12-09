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
public class Tartos extends Termek{

    public Tartos(String nev, double ar, String egyseg) {
        super(nev, ar, egyseg);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Tartos)){
            return false;
        }
        
        Tartos e = (Tartos) obj;
        
        return this.getNev().equals(e.getNev()) && this.getAr()==(e.getAr()) && this.getEgyseg().equals(e.getEgyseg());
    }

    @Override
    public String toString() {
        return "Tartós: " + this.getNev() + " " + this.getAr() + " Ft, " + this.getDb() + " " + this.getEgyseg();
    }

    
}
