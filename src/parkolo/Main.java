/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkolo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Krisztian
 */
public class Main {
   
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String sor = sc.nextLine();

        List<Parkolo> pl = new ArrayList<Parkolo>();

        while (sor.length() > 0) {
            String[] adatok = sor.split(";");
            List<String> rendszamok = new ArrayList<String>();
            if (adatok.length > 3) {
                for (int i = 3; i < adatok.length; i++) {
                    rendszamok.add(adatok[i]);
                }
            }
            
            Parkolo p = new Parkolo(adatok[0], Double.parseDouble(adatok[1]), Integer.parseInt(adatok[2]), rendszamok);
            pl.add(p);
            
            sor = sc.nextLine();
        }
            
        Collections.sort(pl);
        
        for (Parkolo i : pl){
            if (i.getSzabadHelyek() > 2)
            System.out.println(i);
        }

    }
}
