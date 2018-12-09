/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kemia;

/**
 *
 * @author Krisztian
 */
public class KemiaiElem implements ReakcioKepes {

    private String vegyjel;
    private String rendszam;
    private int focsoport;

    public KemiaiElem(String vegyjel, String rendszam, int focsoport) {
        this.vegyjel = vegyjel;
        this.rendszam = rendszam;
        this.focsoport = focsoport;
    }

    public String getVegyjel() {
        return vegyjel;
    }

    public void setVegyjel(String vegyjel) {
        this.vegyjel = vegyjel;
    }

    public String getRendszam() {
        return rendszam;
    }

    public void setRendszam(String rendszam) {
        this.rendszam = rendszam;
    }

    public int getFocsoport() {
        return focsoport;
    }

    public void setFocsoport(int focsoport) {
        this.focsoport = focsoport;
    }

    @Override
    public boolean reakciobaLephet() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean reakciobaLephet(ReakcioKepes o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
