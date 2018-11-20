/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mozisztarok2;

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

        List<Film> filmLista = new ArrayList<Film>();

        while (sor.length() > 0) {
            String[] adatok = sor.split("[():;]");

            for (int i = 3; i < adatok.length; i++) {
                Film f = new Film(adatok[i]);

                if (filmLista.contains(f)) {
                    filmLista.get(filmLista.indexOf(f)).getSzereplok().add(new Szinesz(adatok[0], Integer.parseInt(adatok[1])));
                } else {
                    f.getSzereplok().add(new Szinesz(adatok[0], Integer.parseInt(adatok[1])));
                    filmLista.add(f);
                }
            }

            sor = sc.nextLine();
        }

        Collections.sort(filmLista);

        for (Film i : filmLista) {
            System.out.println(i);
        }
    }
}

//Leonardo DiCaprio (1974):A tegla;Eredet;Kapj el, ha tudsz
//Matt Damon (1970):A tegla
//Jack Nicholson (1937):A tegla
//Mark Wahlberg (1971):A tegla;Ted
//Martin Sheen (1940):A tegla
//Ken Watanabe (1959):Eredet
//Joseph Gordon-Levitt (1981):Eredet
//Marion Cotillard (1975):Eredet
//Mila Kunis (1983):Ted
//Seth MacFarlane (1973):Ted
//Tom Hanks (1956):Kapj el, ha tudsz;Angyalok es demonok
//Christopher Walken (1943):Kapj el, ha tudsz
//Ewan McGregor (1971):Angyalok es demonok
//Ayelet Zurer (1969):Angyalok es demonok