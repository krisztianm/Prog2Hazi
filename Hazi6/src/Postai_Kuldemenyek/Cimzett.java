/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postai_Kuldemenyek;

/**
 *
 * @author Krisztian
 */
public class Cimzett implements Comparable{
    private String nev;
    private int iranyitoszam;
    private String varos;
    private String utca;
    private int hazSzam;
    private int csomagErteke;

    public Cimzett(String nev, int iranyitoszam, String varos, String utca, int hazSzam, int csomagErteke) {
        this.nev = nev;
        this.iranyitoszam = iranyitoszam;
        this.varos = varos;
        this.utca = utca;
        this.hazSzam = hazSzam;
        this.csomagErteke = csomagErteke;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getIranyitoszam() {
        return iranyitoszam;
    }

    public void setIranyitoszam(int iranyitoszam) {
        this.iranyitoszam = iranyitoszam;
    }

    public String getVaros() {
        return varos;
    }

    public void setVaros(String varos) {
        this.varos = varos;
    }

    public String getUtca() {
        return utca;
    }

    public void setUtca(String utca) {
        this.utca = utca;
    }

    public int getHazSzam() {
        return hazSzam;
    }

    public void setHazSzam(int hazSzam) {
        this.hazSzam = hazSzam;
    }

    public int getCsomagErteke() {
        return csomagErteke;
    }

    public void setCsomagErteke(int csomagErteke) {
        this.csomagErteke = csomagErteke;
    }
    
    @Override
    public String toString(){
        return this.getVaros() + ", " + this.getUtca() + " " + this.getHazSzam() + "., " + this.getNev() + ", " + this.getCsomagErteke() + " Ft";
    }
    
    @Override
    public boolean equals(Object obj){
        if (obj == null || !(obj instanceof Cimzett)){
            return false;
        }
        
        Cimzett c = (Cimzett) obj;
        
        return this.getNev().equals(c.getNev()) && this.getIranyitoszam() == c.getIranyitoszam() && this.getVaros().equals(c.getVaros()) && this.getUtca().equals(c.getUtca()) && this.getHazSzam() == c.getHazSzam() && this.getCsomagErteke() == c.getCsomagErteke();
    }
    
    @Override
    public int compareTo(Object obj){
        Cimzett c = (Cimzett) obj;
        
        if (this.getVaros().equals(c.getVaros())){
            if (this.getUtca().equals(c.getUtca())){
                if (this.getHazSzam() == (c.getHazSzam())){
                    if (this.getNev().equals(c.getNev())){
                        return -1 * (Integer.compare(this.getCsomagErteke(),c.getCsomagErteke()));
                    } else {
                        return this.getNev().compareTo(c.getNev());
                    }
                } else {
                    return Integer.compare(this.getHazSzam(), c.getHazSzam());
                }
            } else {
                return this.getUtca().compareTo(c.getUtca());
            }
        } else {
            return this.getVaros().compareTo(c.getVaros());
        }
    }
    
}
