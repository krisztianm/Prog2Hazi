package elso_feladat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Krisztian
 */
public class Gyumolcs {
    private String fajta;
    private String iz;

    public Gyumolcs(String f, String i) {
        this.fajta = f;
        this.iz = i;
    }

    public String milyenFajtaju() {
        return fajta;
    }

    public String milyenIzu() {
        return iz;
    }

    public String getFajta() {
        return fajta;
    }

    public String getIz() {
        return iz;
    }
    
    

    @Override
    public String toString() {
        return fajta + " gyumolcs, " + iz + " izzel";
    }
    
    
}
