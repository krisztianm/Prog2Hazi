/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Krisztian
 */
public class Turista {
    private String név;
    private String útvonal;
    private int K;
    private int PSZ;

    public Turista(String név, String útvonal) {
        this.név = név;
        this.útvonal = útvonal;
    }

    public String getNév() {
        return név;
    }

    public String getÚtvonal() {
        return útvonal;
    }

    public int getK() {
        return K;
    }

    public int getPSZ() {
        return PSZ;
    }

    public void setK(int K) {
        this.K = K;
    }

    public void setPSZ(int PSZ) {
        this.PSZ = PSZ;
    }

    @Override
    public String toString() {
        return név;
    }
    
    
}
