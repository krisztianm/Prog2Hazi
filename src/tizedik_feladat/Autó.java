/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tizedik_feladat;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Krisztian
 */
public class Autó implements Comparable<Autó>{

    private String rendszám;
    private int teljesítmény;
    private boolean automata;
    public static int forgalombanLévőkSzáma = 0;
    private List<String> extrák = new ArrayList();

    public Autó(String rendszám, int teljesítmény, boolean automata) {
        this.rendszám = rendszám;
        this.teljesítmény = teljesítmény;
        this.automata = automata;
        this.forgalombanLévőkSzáma++;
    }

    public String getRendszám() {
        return rendszám;
    }

    public int getTeljesítmény() {
        return teljesítmény;
    }

    public boolean isAutomata() {
        return automata;
    }

    @Override
    public String toString() {
        return rendszám + " " + teljesítmény + " " + automata;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Autó)) {
            return false;
        }

        Autó a = (Autó) obj;
        return (this.getRendszám().equals(a.getRendszám()));
    }
    
    @Override
    public int compareTo(Autó a){
        return Integer.compare(this.getTeljesítmény(), a.getTeljesítmény());
    }
    
    public void extraHozzáadás(String extra){
        this.extrák.add(extra);
    }
    
    public void extraTörlés(String extra){
        this.extrák.remove(extra);
    }
    
    public List<String> getExtrák(){
        return this.extrák;
    }
}
