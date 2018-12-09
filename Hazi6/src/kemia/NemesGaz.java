/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kemia;

/**
 *
 * @author Krisztian
 */
public class NemesGaz extends KemiaiElem{
    
    public NemesGaz(String vegyjel, String rendszam, int focsoport) throws Exception{
        super(vegyjel, rendszam, focsoport);
        if (focsoport != 8) throw new Exception("Főcsoport nem egyenlő 8-cal");
    }
    
}
