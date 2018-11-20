/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harmadik_feladat;

/**
 *
 * @author Krisztian
 */
public class Tea implements Rendezheto<Tea> {

    public String nev;
    public int ar;

    public Tea(String s, int j) {
        nev = s;
        ar = j;
    }
    
    @Override
    public boolean egyenlo(Tea t){
        return Integer.compare(this.ar, t.ar) == 0;
    }
    
    @Override
    public boolean nagyobbMint(Tea t){
        return Integer.compare(this.ar, t.ar) > 0;
    }
    
    @Override
    public boolean kisebbMint(Tea t){
        return Integer.compare(this.ar, t.ar) < 0;
    }
    
}
