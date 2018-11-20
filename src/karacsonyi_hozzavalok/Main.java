/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karacsonyi_hozzavalok;

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

        Scanner input = new Scanner(System.in);
        String sor = input.nextLine();

        List<Hozzavalo> bevLista = new ArrayList<Hozzavalo>();

        while (sor.length() > 0) {
            String[] adatok = sor.split(";");
            Hozzavalo h = new Hozzavalo(adatok[0], Integer.parseInt(adatok[1]));

            if (bevLista.contains(h)) {
                bevLista.get(bevLista.indexOf(h)).setDb(bevLista.get(bevLista.indexOf(h)).getDb() + h.getDb());
            } else {
                bevLista.add(h);
            }

            sor = input.nextLine();
        }

        Collections.sort(bevLista);

        for (Hozzavalo i : bevLista) {
            System.out.println(i);
        }
    }
}
