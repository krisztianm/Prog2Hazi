/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alakul_a_molekula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Krisztian
 */
public class Molekula implements Comparable<Molekula>{

    private String molekulaNév;
    private List<Elem> vegyjel;

    public Molekula(String molekulaNév) {
        this.molekulaNév = molekulaNév;
        this.vegyjel = new ArrayList<Elem>();
    }

    public String getMolekulaNév() {
        return molekulaNév;
    }

    public void setMolekulaNév(String molekulaNév) {
        this.molekulaNév = molekulaNév;
    }

    public List<Elem> getVegyjel() {
        return vegyjel;
    }

    public void setVegyjel(List<Elem> vegyjel) {
        this.vegyjel = vegyjel;
    }

    @Override
    public String toString() {
        StringBuilder osszetevok = new StringBuilder(this.molekulaNév + ":\n");
        Collections.sort(vegyjel);

        for (int i = 0; i < vegyjel.size(); i++) {
            if (i == vegyjel.size() - 1) {
                osszetevok.append(vegyjel.get(i));
            } else {
                osszetevok.append(vegyjel.get(i) + "\n");
            }
        }
        
        return osszetevok.toString();
    }
    
    public boolean equals(Object o){
        if (o == null || !(o instanceof Molekula)){
            return false;
        }
        
        Molekula m = (Molekula) o;
        return this.molekulaNév.equals(m.getMolekulaNév());
    } 

    @Override
    public int compareTo(Molekula t) {
        return this.molekulaNév.compareTo(t.getMolekulaNév());
    }

}
