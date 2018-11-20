/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tizenegyedik_feladat;

/**
 *
 * @author Krisztian
 */
public class Hallgató extends Személy {

    protected double átlag;
    private static double minÁtlag;

    public Hallgató(String név, int életkor, boolean férfi, double átlag) {
        super(név, életkor, férfi);
        this.átlag = átlag;
    }

    public double getÁtlag() {
        return átlag;
    }

    public String getNév() {
        return név;
    }

    public int getÉletkor() {
        return életkor;
    }
    
    public boolean jóKépességűE(){
        return átlag >= this.minÁtlag;
    }
    
    public static void setMinÁtlag(double n){
        minÁtlag = n;
    }
    
    @Override
    public String toString() {
        return super.getNév() + "\n" + super.getÉletkor() + "\n" + super.isFérfi() + "\n" + átlag;
    }

}
