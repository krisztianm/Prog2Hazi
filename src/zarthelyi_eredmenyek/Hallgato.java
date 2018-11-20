/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zarthelyi_eredmenyek;

/**
 *
 * @author Krisztian
 */
public class Hallgato implements Comparable<Hallgato>{
    private String nev;
    private int pont;

    public Hallgato(String nev, int pont) {
        this.nev = nev;
        this.pont = pont;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getPont() {
        return pont;
    }

    public void setPont(int pont) {
        this.pont = pont;
    }
    
    @Override
    public String toString(){
        return this.nev + ": " + this.pont + " pont";
    }
    
    public boolean equals(Object obj){
        if (obj == null || !(obj instanceof Hallgato)){
            return false;
        }
        
        Hallgato h = (Hallgato) obj;
        
        return this.nev.equals(h.getNev());
    }

    @Override
    public int compareTo(Hallgato t) {
        if (this.pont == t.getPont()){
            return this.nev.compareTo(t.getNev());
        } else{
            return -1 * (Integer.compare(this.pont, t.getPont()));
        }
    }
}
