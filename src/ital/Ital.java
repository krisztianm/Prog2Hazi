/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ital;

/**
 *
 * @author Krisztian
 */
public class Ital implements Comparable<Ital>{

    protected String név;
    protected String kiszerelés;
    protected int ár;

    public Ital(String név, String kiszerelés, int ár) {
        this.név = név;
        this.kiszerelés = kiszerelés;
        this.ár = ár;
    }

    public String getNév() {
        return név;
    }

    public String getKiszerelés() {
        return kiszerelés;
    }

    public int getÁr() {
        return ár;
    }

    public boolean equals(Object o) {
        if (o == null || !(o instanceof Ital)) {
            return false;
        }
        Ital i = (Ital) o;

        return this.getNév().equals(i.getNév()) && this.getKiszerelés().equals(i.getKiszerelés());

    }
    
    @Override
    public String toString(){
        return this.getNév()+ ", " + this.getKiszerelés() + ", " + this.getÁr() + " Ft";
    }
    
    @Override
    public int compareTo(Ital o){
        return Integer.compare(this.getÁr(), o.getÁr());
    }
}
