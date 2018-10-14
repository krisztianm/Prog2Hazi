/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Krisztian
 */
public class Nyilas extends Katona{
    private double lőtáv;

    public Nyilas(double támadóerő, double védőerő, double lőtáv) {
        super(támadóerő, védőerő);
        this.lőtáv = lőtáv;
    }
    
    public double getLőtáv() {
        return lőtáv;
    }
     
    @Override
    public double getTámadóerő() {
        return this.lőtáv + super.getTámadóerő();
    }

    public void setLőtáv(double lőtáv) {
        this.lőtáv = lőtáv;
    }

    @Override
    public String toString() {
        return "Nyilas: TE: " + this.getTámadóerő() + ", VE: " + this.getVédőerő();
    }
    
    @Override
    public boolean equals(Object obj){
        if (obj == null || !(obj instanceof Nyilas)){
            return false;
        }
        
        Nyilas nyil = (Nyilas) obj;
        
        return this.getTámadóerő() == nyil.getTámadóerő() && this.getVédőerő() == nyil.getVédőerő() && this.getLőtáv() == nyil.getLőtáv();
    }
    
}
