/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tizenegyedik_feladat;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import zh.Hallgato;

/**
 *
 * @author Krisztian
 */
public class Main {

    public static double jóKépességűekÉletkoránakÁtlaga(List<Hallgató> h) {
        int db = 0;
        double sum = 0;

        for (Hallgató i : h) {
            if (i.jóKépességűE()) {
                db++;
                sum += i.getÉletkor();
            }
        }

        if (db == 0) {                   //nem volt olyan hallgató, akinek legalább 4-es átlaga lenne
            return sum;
        }

        return sum / db;
    }

    public static void main(String[] args) {
        Személy aNőAFestményről = new Személy("Mona Lisa", 20, false);

        System.out.println(aNőAFestményről);
//        
//        Scanner sc = new Scanner(System.in);
//        
//        Személy[] kétHallgatóKétOktató = new Személy[4];
//        System.out.println("Kérem a 2 hallgató és 2 oktató adatait, ebben a sorrendben: ");
//        for (int i = 0; i < 4; i++) {
//            String sor = sc.nextLine();
//            String[] adatok = sor.split(" ");
//            if (i < 2) {
//                kétHallgatóKétOktató[i] = new Hallgató(adatok[0], Integer.parseInt(adatok[1]), Boolean.parseBoolean(adatok[2]), Double.parseDouble(adatok[3]));
//            } else {
//                kétHallgatóKétOktató[i] = new Oktató(adatok[0], Integer.parseInt(adatok[1]), Boolean.parseBoolean(adatok[2]), adatok[3]);
//            }
//        }
//        
        List<Hallgató> hallgatókListája = new ArrayList<Hallgató>();

        hallgatókListája.add(new Hallgató("Marci", 23, true, 4.1));
        hallgatókListája.add(new Hallgató("Jani", 20, true, 3.0));
        hallgatókListája.add(new Hallgató("Pali", 22, true, 3.9));
        hallgatókListája.add(new Hallgató("Laci", 18, true, 2.9));
        hallgatókListája.add(new Hallgató("Mari", 21, false, 3.9));
        hallgatókListája.add(new Hallgató("Vali", 24, false, 4.9));
        hallgatókListája.add(new Hallgató("Dani", 20, true, 4.0));
        hallgatókListája.add(new Hallgató("Panni", 26, false, 5.0));

        Hallgató.setMinÁtlag(4.0);
        System.out.println("Legalább 4-es átlaggal rendelkező hallgatók átlagéletkora: " + jóKépességűekÉletkoránakÁtlaga(hallgatókListája));

        Egyetem debreceniEgyetem = new Egyetem();

        for (int i = 0; i < hallgatókListája.size(); i++) {
            debreceniEgyetem.hozzáadHallgatót(hallgatókListája.get(i));
        }
        
        debreceniEgyetem.hozzáadOktatót(new Oktató("Szigor Irma", 60, false, "IT"));
        debreceniEgyetem.hozzáadOktatót(new Oktató("Bölcs Imre", 52, true, "Bölcsészet"));
        debreceniEgyetem.hozzáadOktatót(new Oktató("Kis Péter", 32, false, "Grafika"));
        debreceniEgyetem.hozzáadOktatót(new Oktató("Vujity Tvrtko", 40, false, "Valószínűségszámítás"));
        debreceniEgyetem.hozzáadOktatót(new Oktató("Mézes B. Ödön", 38, false, "IT"));
        
        System.out.println("Legfiatalabb hallgatók: ");
        debreceniEgyetem.legfiatalabbHallgatók();
        debreceniEgyetem.itTanszékNőiOktatók();
        System.out.println("Debreceni Egyetem oktatói: (\"!\" név végén = IT tanszék) " + debreceniEgyetem.getOktatók());
    }
}
//Gabriella 23 false 3.5
//Gábor 23 true 4.2
//Péter 36 true Grafika
//Andrea 32 false Számítástudomány
