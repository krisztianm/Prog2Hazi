/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alakul_a_molekula;

/**
 *
 * @author Krisztian
 */
public class Elem implements Comparable<Elem>{
    private String vegyjel;
    private String elemNév; 
    private int db;

    public Elem(String vegyjel) {
        this.vegyjel = vegyjel;
        this.db = 1;
    }

    public String getVegyjel() {
        return vegyjel;
    }

    public void setVegyjel(String vegyjel) {
        this.vegyjel = vegyjel;
    }

    public String getNév() {
        return elemNév;
    }

    public void setNév(String elemNév) {
        this.elemNév = elemNév;
    }

    public int getDb() {
        return db;
    }

    public void setDb(int db) {
        this.db = db;
    }

    public String getElemNév() {
        return elemNév;
    }

    public void setElemNév(String elemNév) {
        this.elemNév = elemNév;
    }

    @Override
    public String toString() {
        return this.db + " " + this.elemNév;
    }
    
    @Override
    public int compareTo(Elem t) {
        if (this.db == t.getDb()){
            return this.vegyjel.compareTo(t.getVegyjel());
        } else {
            return -1 * (Integer.compare(this.db, t.getDb()));
        }
    }
    
    @Override
    public boolean equals(Object o){
        if (o == null || !(o instanceof Elem)){
            return false;
        }
        
        Elem e = (Elem) o;
        
        return this.vegyjel.equals(e.getVegyjel());
    }
    
}
