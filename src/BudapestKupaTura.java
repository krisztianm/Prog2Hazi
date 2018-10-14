/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Krisztian
 */
public class BudapestKupaTura {
    private int év;
    private int hónap;
    private int nap;
    private String név;
    private int táv;

    public BudapestKupaTura(int év, int hónap, int nap, String név, int táv) {
        this.év = év;
        this.hónap = hónap;
        this.nap = nap;
        this.név = név;
        this.táv = táv;
    }

    
    
    public int getÉv() {
        return év;
    }

    public int getHónap() {
        return hónap;
    }

    public int getNap() {
        return nap;
    }

    public String getNév() {
        return név;
    }

    public int getTáv() {
        return táv;
    }

    @Override
    public String toString() {
        return év + ";" + String.format("%02d", hónap) + ";" + String.format("%02d", nap) + ";" + név;
    }
    
    
    
}
