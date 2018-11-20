/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hetedik_feladat;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Krisztian
 */
public class Test {

    public static List<Lakóház> tágasLakóházak(List<Lakóház> t, double térfogat) {
        List<Lakóház> l = new ArrayList();

        for (Lakóház i : t) {
            if (i.légköbméter() > térfogat) {
                l.add(i);
            }
        }

        return l;
    }

    public static void rendez(List<Lakóház> t) {        //légköbméter szerint csökkenő sorrendben
        for (int i = 0; i < t.size() - 1; i++) {
            for (int j = i + 1; j < t.size(); j++) {
                if (t.get(i).légköbméter() < t.get(j).légköbméter()) {
                    Lakóház temp = t.get(i);
                    t.set(i, t.get(j));
                    t.set(j, temp);
                }
            }
        }

        for (Lakóház i : t) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        List<Lakóház> lak = new ArrayList();

        lak.add(new Lakóház("Kis utca 3", 8, 320));
        lak.add(new Lakóház("Petőfi tér 1", 12, 330));
        lak.add(new Lakóház("Nyíl utca 22", 6, 300));
        lak.add(new Lakóház("Nyíl utca 24", 6, 320));
        lak.add(new Lakóház("Kossuth tér 10", 8, 400));
        lak.add(new Lakóház("Jánosi utca 2", 4, 250));
        lak.add(new Lakóház("Sétáló köz", 4, 280));
        lak.add(new Lakóház("Laktanya utca 23", 3, 180));
        lak.add(new Lakóház("Egyenes út 121", 16, 310));
        lak.add(new Lakóház("Nyíl utca 10", 5, 290));

        rendez(tágasLakóházak(lak, 10239));

    }
}
