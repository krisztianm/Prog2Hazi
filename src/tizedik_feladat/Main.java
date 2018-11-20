/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tizedik_feladat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Krisztian
 */
public class Main {

    public static boolean szabályosRendszám(Autó t) {
        if (t.getRendszám().length() != 6) {
            return false;
        }

        boolean betűk = Character.isLetter(t.getRendszám().charAt(0)) && Character.isLetter(t.getRendszám().charAt(1)) && Character.isLetter(t.getRendszám().charAt(2));
        boolean számok = Character.isDigit(t.getRendszám().charAt(3)) && Character.isDigit(t.getRendszám().charAt(4)) && Character.isDigit(t.getRendszám().charAt(5));

        return betűk && számok;
    }

    public static List<Teherautó> teherbírásTöbbMintHúsz(Autó[] t) {
        List<Teherautó> teherNagyobbHusznal = new ArrayList<Teherautó>();

        for (int i = 0; i < t.length; i++) {
            if (t[i] instanceof Teherautó) {
                Teherautó teher = (Teherautó) t[i];
                if (teher.getTeherbírás() > 20000) {
                    teherNagyobbHusznal.add(teher);
                }
            }
        }

        return teherNagyobbHusznal;
    }

    public static void legnagyobbTeljesitmenyu(List<Autó> autóLista) {
        if (autóLista.size() < 3) {
            for (Autó a : autóLista) {
                System.out.println(a);
            }
        } else {

            for (int i = 0; i < autóLista.size() - 1; i++) {
                for (int j = i + 1; j < autóLista.size(); j++) {
                    if (autóLista.get(i).getTeljesítmény() < autóLista.get(j).getTeljesítmény()) {
                        Autó temp = autóLista.get(i);
                        autóLista.set(i, autóLista.get(j));
                        autóLista.set(j, temp);
                    }
                }
            }

            for (int i = 0; i < 3; i++) {
                System.out.println(autóLista.get(i));
            }
        }
    }

    public static void main(String[] args) {

        Autó auto1 = new Autó("KLA516", 100, true);
        Autó auto2 = new Autó("KLA516", 120, false);

        System.out.println("Egyenlőek az autók?");
        System.out.println(auto1.equals(auto2));
        System.out.println("-1 ha kisebb teljesítményű, 0 ha azonos teljesítményű, 1 ha nagyobb teljesítményű");
        System.out.println(auto1.compareTo(auto2));

        System.out.println("Kérem a rendszámot:");
        Scanner sc = new Scanner(System.in);
        String rszám = sc.nextLine();

        Autó a = new Autó(rszám, 100, true);
        System.out.println(a);

        Autó[] kétAutóKétTeherautó = new Autó[4];
        System.out.println("Kérem a 2 autó és 2 teherautó adatait, ebben a sorrendben: ");
        for (int i = 0; i < 4; i++) {
            String sor = sc.nextLine();
            String[] adatok = sor.split(" ");
            if (i < 2) {
                kétAutóKétTeherautó[i] = new Autó(adatok[0], Integer.parseInt(adatok[1]), Boolean.parseBoolean(adatok[2]));
            } else {
                kétAutóKétTeherautó[i] = new Teherautó(adatok[0], Integer.parseInt(adatok[1]), Boolean.parseBoolean(adatok[2]), Integer.parseInt(adatok[3]));
            }
        }

        List<Teherautó> teherAutók20t = teherbírásTöbbMintHúsz(kétAutóKétTeherautó);

        System.out.println("\n20 tonnánál nagyobb teherbírású teherautó(k):");
        for (int i = 0; i < teherAutók20t.size(); i++) {
            System.out.println(teherAutók20t.get(i));
        }

        List<Autó> autókListája = new ArrayList<Autó>();

        autókListája.add(new Autó("KLA516", 116, false));
        autókListája.add(new Autó("SM18VZR", 110, false));
        autókListája.add(new Autó("KLM013", 210, false));
        autókListája.add(new Autó("NNW107", 130, false));
        autókListája.add(new Autó("NOP431", 530, true));
        autókListája.add(new Autó("HAH007", 90, false));

        System.out.println("Szabályos-e a rendszám? " + autókListája.get(0).getRendszám());
        System.out.println(szabályosRendszám(autókListája.get(0)));
        System.out.println("Szabályos-e a rendszám? " + autókListája.get(1).getRendszám());
        System.out.println(szabályosRendszám(autókListája.get(1)));

        System.out.println("\nLegnagyobb teljesítményű autó(k) a listából: ");
        legnagyobbTeljesitmenyu(autókListája);
        
        System.out.println("\n" + Autó.forgalombanLévőkSzáma + " forgalomban lévő autó és teherautó van");
        
        auto1.extraHozzáadás("2 zónás klíma");
        auto1.extraHozzáadás("tempomat");
        auto1.extraHozzáadás("központi zár");
        
        System.out.println(auto1 + " autó a következő extrákkal rendelkezik: " + auto1.getExtrák());
        
        auto1.extraTörlés("tempomat");
        
        System.out.println(auto1 + " autó a következő extrákkal rendelkezik: " + auto1.getExtrák());
    }
}

//ABC123 80 true
//XYZ876 55 false
//TIR666 130 true 25000
//PQR111 125 false 20000
