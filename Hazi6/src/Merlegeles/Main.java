/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Merlegeles;

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

    public static void main(String[] args) {

        List<Ceg> cegekListaja = new ArrayList<Ceg>();

        try {
            FileReader fr = new FileReader(new File("sampleMerlegeles.txt"));             /* vagy args[0] */
            BufferedReader buffer = new BufferedReader(fr);

            String sor;

            while ((sor = buffer.readLine()) != null) {
                String[] adatok = sor.split(":");

                Ceg c = new Ceg(adatok[0], adatok[1]);

                if (cegekListaja.contains(c)) {
                    cegekListaja.get(cegekListaja.indexOf(c)).setBevetel(cegekListaja.get(cegekListaja.indexOf(c)).getBevetel() + Integer.parseInt(adatok[3]));
                    cegekListaja.get(cegekListaja.indexOf(c)).getEv().add(Integer.parseInt(adatok[2]));
                } else {
                    c.setBevetel(Integer.parseInt(adatok[3]));
                    c.getEv().add(Integer.parseInt(adatok[2]));

                    cegekListaja.add(c);
                }
            }
            
            buffer.close();

        } catch (IOException i) {
            System.out.println("Hibás fájl beolvasáshoz");
        }

        Collections.sort(cegekListaja);

        for (Ceg c : cegekListaja) {
            System.out.println(c);
        }
    }
}
