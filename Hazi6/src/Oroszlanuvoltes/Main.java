/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oroszlanuvoltes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Krisztian
 */
public class Main {

    public static void main(String[] args) {

        List<ArrayList<Allomas>> allomasokListaja = new ArrayList<ArrayList<Allomas>>();        //Allomas típusú Listákat tartalmazó Lista (Listák a Listában)

        try {
            FileReader fr = new FileReader(new File("sampleOroszlan.txt"));
            BufferedReader buffer = new BufferedReader(fr);

            String sor;

            while ((sor = buffer.readLine()) != null) {
                ArrayList<Allomas> allomas = new ArrayList<Allomas>();

                while (!(sor.equals("END"))) {
                    String[] adatok = sor.split(":");
                    allomas.add(new Allomas(adatok[0], adatok[1]));

                    sor = buffer.readLine();
                }

                allomasokListaja.add(allomas);
            }

            buffer.close();
        } catch (IOException i) {
            System.out.println("Hibás fájl a beolvasáshoz");
        }

        for (ArrayList<Allomas> a : allomasokListaja) {                         //bejárjuk a Listákat tartalmazó Listát
            int megfigyelesHossza = a.get(0).getMegfigyeles().length();         //a megfigyelés hossza blokkonként megyegyezik, ezért akár az első állomás megfigyelésének hossza is lehet ez az érték
            int beazonositoAllomasokSzama = 0;                                  //ez fogja megmutatni hány pillanatban érzékelte az oroszlánt az összes állomás
            
            for (int i = 0; i < megfigyelesHossza; i++) {                       //bejárunk egy megfigyelést karakterről karakterre
                int tmp = 0;                                                    //segédváltozó (megmutatja hány állomás érzékelt ugyanabban a pillanatban oroszlánt)
                for (int j = 0; j < a.size(); j++) {                            //bejárjuk az állomásokat (blokkonként)
                    if (a.get(j).getMegfigyeles().charAt(i) == 'O') {           //ha a j-edik állomás megfigyelésének i-edik karaktere O (oroszlán)
                        tmp++;                                                  //növeljük, tehát +1 állomás már érzékelt abban a pillanatban oroszlánt
                    }
                }
                if (tmp == a.size()) {                                          //ha ugyanabban a pillanatban annyi állomás észlelte az oroszlánt, ahány állomás van egy blokkban (tehát az össszes érzékelte ugyanabban az időpontban)
                    beazonositoAllomasokSzama++;                                //növeljük a pillanatok számát, amikor az összes állomás oroszlánt érzékelt
                }
            }
            System.out.println(beazonositoAllomasokSzama);
        }

//        for (ArrayList<Allomas> a : allomasokListaja){
//            System.out.println(a);
//        }
    }
}
