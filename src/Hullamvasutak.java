/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Krisztian
 */
public class Hullamvasutak {
    private String hullámvasútNév;
    private String világ;
    private int minMagasság;
    private int várakozásiIdő;

    public Hullamvasutak(String hullámvasút, String világ, int magasság, int várakozás) {
        this.hullámvasútNév = hullámvasút;
        this.világ = világ;
        this.minMagasság = magasság;
        this.várakozásiIdő = várakozás;
    }

    public String getHullámvasútNév() {
        return hullámvasútNév;
    }

    public String getVilág() {
        return világ;
    }

    public int getMinMagasság() {
        return minMagasság;
    }

    public int getVárakozásiIdő() {
        return várakozásiIdő;
    }

    @Override
    public String toString() {
        return hullámvasútNév + " (" + világ + "): " + várakozásiIdő;
    }
    
    
}
