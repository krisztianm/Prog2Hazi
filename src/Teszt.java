/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Krisztian
 */
public class Teszt {

    public static Kocsma[] adottItaltKínálóKocsmák(String ital, VendéglátóipariEgység[] t) {
        int n = 0;

        for (int i = 0; i < t.length; i++) {
            if (t[i] instanceof Kocsma) {
                Kocsma k = (Kocsma) t[i];
                for (int j = 0; j < k.getSörlap().length; j++) {
                    if (k.getSörlap()[j].equals(ital)) {
                        n++;
                    }
                }

            }
        }

        Kocsma[] kocsma = new Kocsma[n];
        int g = 0;
        
        for (int i = 0; i < t.length; i++) {
            if (t[i] instanceof Kocsma) {
                Kocsma k = (Kocsma) t[i];
                for (int j = 0; j < k.getSörlap().length; j++) {
                    if (k.getSörlap()[j].equals(ital)) {
                        kocsma[g] = k;
                        g++;
                    }
                }

            }
        }

        return kocsma;
    }

    public static void main(String[] args) {

        VendéglátóipariEgység[] vendEgys = new VendéglátóipariEgység[]{
            new Étterem("Czifra", 60, new String[]{"Húsleves", "Kávé", "Bor"}),
            new Étterem("Hazai", 120, new String[]{"Gulyásleves", "Töltött Káposzta", "Bor"}),
            new Étterem("Luxus 2000", 20, new String[]{"Csirkebecsinált leves", "Rántott pulykamell rizzsel"}),
            new Étterem("IttSeLakszJól", 66, new String[]{"Húsleves", "Krumplipüré rántott csirkemellel", "Bor", "Kávé"}),
            new Étterem("Tuti Pizza", 30, new String[]{"Ananászos Pizza", "Vega Pizza", "Gluténmentes Pizza", "Kóla"}),
            new Kocsma("Munkás Oázis", 30, new String[]{"Sör", "Bor", "Pálinka"}),
            new Kocsma("Szabadnap Presszó", 40, new String[]{"Tejeskávé", "Capuccino", "Sör", "Kőműves Actimel"}),
            new Kocsma("Habos Oldal", 10, new String[]{"Sör"}),
            new Kocsma("Feles-leges", 25, new String[]{"Körtepálinka", "Almapálinka", "Törkölypálinka"}),
            new Kocsma("Menedék", 40, new String[]{"Sör", "Bor", "Vodka"})
        };

        Kocsma[] kocsma = adottItaltKínálóKocsmák("Sör", vendEgys);

        for (Kocsma kma : kocsma) {
            System.out.println(kma);
        }

    }
}
