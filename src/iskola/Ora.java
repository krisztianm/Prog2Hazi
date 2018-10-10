/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iskola;

/**
 *
 * @author Krisztian
 */
public class Ora {
    private int kód;
    private String név;
    private int kezdet;

    public Ora(int kód, String név, int kezdet) {
        this.kód = kód;
        this.név = név;
        if (kezdet < 8 && kezdet > 1) {
            this.kezdet = 8;
        } else if (kezdet > 19 || kezdet < 2){
            this.kezdet = 19;
        } else {
            this.kezdet = kezdet;
        }
    }

    public int getKód() {
        return kód;
    }

    public String getNév() {
        return név;
    }

    public int getKezdet() {
        return kezdet;
    }

    public void setKód(int kód) {
        this.kód = kód;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public void setKezdet(int kezdet) {
        this.kezdet = kezdet;
    }
    
    public boolean equals(Object obj){
        if (obj == null || !(obj instanceof Ora)){
            return false;
        } 
        
        Ora o = (Ora) obj;
        
        return this.kód == o.kód && this.név.equals(o.név) && this.kezdet == o.kezdet;
        
    }

    @Override
    public String toString() {
        return "Óra neve: " + név + ", kódja: " + kód + ", kezdete:" + kezdet;
    }
    
}
