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
public class Main {

    public static void rendezNevAlapjan(Ital[] t) {
        for (int i = 0; i < t.length - 1; i++) {
            for (int j = i + 1; j < t.length; j++) {
                if (t[i].getNév().compareTo(t[j].getNév()) > 0) {
                    Ital temp = t[i];
                    t[i] = t[j];
                    t[j] = temp;
                }
            }
        }
    }

    public static void rendezArAlapjan(Ital[] t) {
        for (int i = 0; i < t.length - 1; i++) {
            for (int j = i + 1; j < t.length; j++) {
                if (t[i].getÁr() > t[j].getÁr()) {
                    Ital temp = t[i];
                    t[i] = t[j];
                    t[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        Ital[] italok = {
            new SzeszesItal(77.5, "Abszint", "0.5 l", 2300),
            new Ital("Coca Cola", "0.5 l", 450),
            new SzeszesItal(9.3, "Barna Sör", "500 ml", 680),
            new SzeszesItal(4.6, "Kőbányai", "0.5 l", 200),
            new Ital("Pepsi", "1.75 l", 530),
            new SzeszesItal(33, "Stalinskaya", "0.7 l", 2100),
            new Ital("Pepsi2", "1.75 l", 530),
            new Ital("Pepsi3", "1.75 l", 530),};

        System.out.println("3 legmagasabb alk.tartalmú ital:");
        for (Ital i : Dolgozat.utos(italok)) {
            System.out.println(i);
        }

        System.out.println("\nItalok név alapján:");
        rendezNevAlapjan(italok);

        for (Ital i : italok) {
            System.out.println(i.getNév() + ": " + i);
        }

        System.out.println("\nItalok ár alapján:");
        rendezArAlapjan(italok);

        for (Ital i : italok) {
            System.out.println(i.getÁr() + "Ft: " + i);
        }
    }
}
