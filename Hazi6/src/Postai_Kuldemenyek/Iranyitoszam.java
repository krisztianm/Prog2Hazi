/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postai_Kuldemenyek;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Krisztian
 */
public class Iranyitoszam implements Comparable{
    private int iranyitoszam;
    private int osszErtek;
    private List<Cimzett> cimzett;

    public Iranyitoszam(int iranyitoszam) {
        this.iranyitoszam = iranyitoszam;
        this.osszErtek = 0;
        this.cimzett = new ArrayList<Cimzett>();
    }

    public int getIranyitoszam() {
        return iranyitoszam;
    }

    public void setIranyitoszam(int iranyitoszam) {
        this.iranyitoszam = iranyitoszam;
    }

    public int getOsszErtek() {
        return osszErtek;
    }

    public void setOsszErtek(int osszErtek) {
        this.osszErtek = osszErtek;
    }

    public List<Cimzett> getCimzett() {
        return cimzett;
    }

    public void setCimzett(List<Cimzett> cimzett) {
        this.cimzett = cimzett;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder(this.getIranyitoszam() + ": " + this.getOsszErtek() + " Ft\n");
        
        for (int i = 0; i< cimzett.size(); i++){
            if (i != cimzett.size()-1){
                sb.append(cimzett.get(i) + "\n");
            } else {
                sb.append(cimzett.get(i));
            }
        }
        
        return sb.toString();
    }
    
    @Override
    public boolean equals(Object obj){
        if (obj == null || !(obj instanceof Iranyitoszam)){
            return false;
        }
        
        Iranyitoszam i = (Iranyitoszam) obj;
        
        return this.getIranyitoszam() == i.getIranyitoszam();
    }
    
    @Override
    public int compareTo(Object obj){
        Iranyitoszam i = (Iranyitoszam) obj;
        
        return Integer.compare(this.getIranyitoszam(),i.getIranyitoszam());
    }
    
}
