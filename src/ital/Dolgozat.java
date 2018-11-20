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
public class Dolgozat {

    public static SzeszesItal[] utos(Ital[] italok) {
        int db = 0;
        for (int i = 0; i < italok.length; i++) {
            if (italok[i] instanceof SzeszesItal) {
                Ital temp = italok[db];
                italok[db] = italok[i];
                italok[i] = temp;
                db++;
            }
        }

        if (db < 3) {
            return null;
        }
        
        SzeszesItal[] szesz = new SzeszesItal[db];
        for (int i = 0; i < db; i++) {
            szesz[i] = (SzeszesItal) italok[i];
        }
        for (int i = 0; i < db - 1; i++) {
            for (int j = i + 1; j < db; j++) {
                if (szesz[i].getAlkoholTartalom() < szesz[j].getAlkoholTartalom()) {
                    SzeszesItal temp = szesz[i];
                    szesz[i] = szesz[j];
                    szesz[j] = temp;
                }
            }
        }
        
        SzeszesItal[] top3szesz = {szesz[0], szesz[1], szesz[2]};
        
        return top3szesz;

    }
}
