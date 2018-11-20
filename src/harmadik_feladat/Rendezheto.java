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
public interface Rendezheto<Tea> {
    public boolean egyenlo(Tea o);
    public boolean nagyobbMint(Tea o);
    public boolean kisebbMint(Tea o);
}
