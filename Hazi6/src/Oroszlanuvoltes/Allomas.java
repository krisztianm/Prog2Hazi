/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oroszlanuvoltes;

/**
 *
 * @author Krisztian
 */
public class Allomas {
    private String azonosito;
    private String megfigyeles;

    public Allomas(String azonosito, String megfigyeles) {
        this.azonosito = azonosito;
        this.megfigyeles = megfigyeles;
    }

    public String getAzonosito() {
        return azonosito;
    }

    public void setAzonosito(String azonosito) {
        this.azonosito = azonosito;
    }

    public String getMegfigyeles() {
        return megfigyeles;
    }

    public void setMegfigyeles(String megfigyeles) {
        this.megfigyeles = megfigyeles;
    }

    @Override
    public String toString() {
        return this.azonosito + " állomás a következőt érzékelte: " + this.megfigyeles;
    }
}
