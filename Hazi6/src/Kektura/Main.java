/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kektura;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Krisztian
 */
public class Main {

    public static void osszefuggoSzakaszok(List<Turazo> t) {

        for (Turazo turazo : t) {
            int tmp = 0;
            for (String szakasz : turazo.getSzakasz()) {
                if (turazo.getSzakasz().indexOf(szakasz) == turazo.getSzakasz().lastIndexOf(szakasz)) {
                    tmp++;
                }
            }

            if (tmp == 2) {
                System.out.println(turazo);
            }
        }
    }

    public static void main(String[] args) {

        List<Turazo> turazokListaja = new ArrayList<Turazo>();

        try {

            FileReader fr = new FileReader(new File("sampleTurazo.txt"));
            BufferedReader buffer = new BufferedReader(fr);

            String sor;

            while ((sor = buffer.readLine()) != null) {
                String[] adatok = sor.split(":");

                String[] szakasz = adatok[1].split("-");

                Turazo t = new Turazo(adatok[0]);

                if (turazokListaja.contains(t)) {
                    turazokListaja.get(turazokListaja.indexOf(t)).getSzakasz().add(szakasz[0]);
                    turazokListaja.get(turazokListaja.indexOf(t)).getSzakasz().add(szakasz[1]);
                } else {
                    t.getSzakasz().add(szakasz[0]);
                    t.getSzakasz().add(szakasz[1]);
                    turazokListaja.add(t);
                }

            }

            buffer.close();

        } catch (IOException i) {
            System.out.println("Hibás fájl beolvasáshoz");
        }
        
        Collections.sort(turazokListaja);
        
        osszefuggoSzakaszok(turazokListaja);

    }
}
