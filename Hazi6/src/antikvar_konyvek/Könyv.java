/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antikvar_konyvek;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Krisztian
 */
public class Könyv implements Comparable<Könyv>{
    private String cím;
    private List<String> szerzők;
    private int év;

    public Könyv(String cím, int év) {
        this.cím = cím;
        this.év = év;
        this.szerzők = new ArrayList();     //nem adjuk át a listát a konstruktornak, itt csak egy üres listát hozunk létre
    }

    public String getCím() {
        return cím;
    }

    public List<String> getSzerzők() {
        return szerzők;
    }

    public int getÉv() {
        return év;
    }
    
    @Override
    public int hashCode() {     //egyedi id-t ad az objektumnak; a hasító tábla használja az objektum hash kódját összehasonlításra, mert így gyorsabb összehasonlítani
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.cím);
        hash = 67 * hash + Objects.hashCode(this.szerzők);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Könyv)){
            return false;
        }
        
        Könyv k = (Könyv) obj;
        
        return this.cím.equals(k.getCím()) && this.szerzők.equals(k.getSzerzők());
    }

    @Override
    public int compareTo(Könyv t) { // "Könyv t" =>>  a fejlécben a "implements Comparable<Könyv>" templatejebén "Könyv" kell legyen
        if (this.év == t.getÉv()){
            if (this.szerzők.size() == t.getSzerzők().size()){
                return this.cím.compareTo(t.getCím());
            } else {
                return -1 * (Integer.compare(this.szerzők.size(), t.getSzerzők().size()));
            }
        } else {
            return Integer.compare(this.év, t.getÉv());
        }
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (String i : this.szerzők){
            sb.append(i).append(", ");
        }
        sb.append(": ");
        sb.append(this.cím);
        sb.append(" (").append(this.év).append(")");
        
        return sb.toString();
    }
    
}
