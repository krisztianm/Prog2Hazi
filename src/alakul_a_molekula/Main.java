/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alakul_a_molekula;

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
        Scanner sc = new Scanner(System.in);
        String sor = sc.nextLine();

        List<Molekula> molekulaLista = new ArrayList<Molekula>();               //letároljuk a molekulákat (bemenet "-"-ától kezdve)
        List<Elem> elemLista = new ArrayList<Elem>();                           //letároljuk az elemeket (bemenet "-"-ig)

        while (!(sor.equals("-"))) {
            String[] adatok = sor.split(":");
            Elem elem = new Elem(adatok[0]);                                    //létrehozzuk az elemet; adatok[0] tartalmazza a vegyjelet
            elem.setNév(adatok[1]);                                             //beállítjuk az elem nevét; adatok[1] tartalmazza a nevet

            elemLista.add(elem);

            sor = sc.nextLine();
        }

        sor = sc.nextLine();

        while (sor.length() > 0) {
            String[] adatok = sor.split(":");                                   //felosztjuk a sort "molekula"-ra és az őt alkotóelemekre
            String[] vegyjelek = adatok[1].split(",");                          //felosztjuk az alkotóelemeket vegyjelekre

            Molekula molekula = new Molekula(adatok[0]);                        //létrehozzuk a molekulát

            for (int i = 0; i < vegyjelek.length; i++) {
                if (molekula.getVegyjel().contains(new Elem(vegyjelek[i]))) {   //ha a molekula vegyjele már tartalmazza ugyanazt a vegyjelet akkor növeljük a darabszámot (pl víz:H,O,H-nál H 2x jelenik meg =>> 2db)
                    molekula.getVegyjel().get(molekula.getVegyjel().indexOf(new Elem(vegyjelek[i]))).setDb(molekula.getVegyjel().get(molekula.getVegyjel().indexOf(new Elem(vegyjelek[i]))).getDb() + 1);
                } else {                                                        //különben újonnan hozzáadjuk a vegyjelet
                    molekula.getVegyjel().add(new Elem(vegyjelek[i]));
                }
            }

            molekulaLista.add(molekula);                                        //hozzáadjuk a molekulát a listához

            for (int i = 0; i < molekulaLista.size(); i++) {                    //végigmegyünk a molekula listáján
                for (int j = 0; j < elemLista.size(); j++) {                    //végigmegyünk az elemek listáján
                    if (molekulaLista.get(i).getVegyjel().contains(elemLista.get(j))) {//ha megtaláltuk a molekula képletében az elem vegyjelet, akkor a molekulán belül kiegészítjük az alkotóelemet az elem nevével (eddig csak a vegyjelet tartalmazta)
                        molekulaLista.get(i).getVegyjel().get(molekulaLista.get(i).getVegyjel().indexOf(elemLista.get(j))).setElemNév(elemLista.get(j).getNév());
                    }
                }
            }

            sor = sc.nextLine();
        }

        Collections.sort(molekulaLista);

        for (Molekula i : molekulaLista) {
            System.out.println(i);
        }
    }
}

//H:hidrogen
//O:oxigen
//Na:natrium
//Cl:klor
//-
//viz:H,O,H
//konyhaso:Na,Cl
