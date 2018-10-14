/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Krisztian
 */
public class Katona {
    private double támadóerő;
    private double védőerő;

    public Katona() {
        this.támadóerő = 5.5;
        this.védőerő = 5.5;
    }

    public Katona(double támadóerő, double védőerő) {
        this.támadóerő = támadóerő;
        this.védőerő = védőerő;
    }

    public double getTámadóerő() {
        return támadóerő;
    }

    public double getVédőerő() {
        return védőerő;
    }

    public void setTámadóerő(double támadóerő) {
        this.támadóerő = támadóerő;
    }

    public void setVédőerő(double védőerő) {
        this.védőerő = védőerő;
    }

    @Override
    public String toString() {
        return "TE: " + támadóerő + ", VE: " + védőerő;
    }
    
    @Override
    
    public boolean equals(Object obj){
        if (obj == null || !(obj instanceof Katona)){
            return false;
        }
        
        Katona kat = (Katona) obj;
        
        return this.támadóerő == kat.támadóerő && this.védőerő == kat.védőerő;
    }
    
}
