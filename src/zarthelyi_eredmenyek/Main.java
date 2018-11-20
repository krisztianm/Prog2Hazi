/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zarthelyi_eredmenyek;

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

        List<Hallgato> hallgatok = new ArrayList<Hallgato>();

        while (sor.length() > 0) {
            String[] adatok = sor.split(";");
            Hallgato h = new Hallgato(adatok[0], Integer.parseInt(adatok[1]));

            if (hallgatok.contains(h)) {
                hallgatok.get(hallgatok.indexOf(h)).setPont(hallgatok.get(hallgatok.indexOf(h)).getPont() + h.getPont());
            } else {
                hallgatok.add(h);
            }

            sor = input.nextLine();
        }

        Collections.sort(hallgatok);

        for (Hallgato i : hallgatok) {
            System.out.println(i);
        }
    }
}
