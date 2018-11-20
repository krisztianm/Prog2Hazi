/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jegkorongmerkozesek;

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

        List<Csapat> csapatLista = new ArrayList<Csapat>();

        while (sor.length() > 0) {
            String[] adatok = sor.split(":");                                   //sorokat felosztjuk "csapat1-csapat2" és "pont1-pont2..."-re
            String[] csapatok = adatok[0].split("-");                           //"csapat1-csapat2"-t felosztjuk "csapat1"-re és "csapat2"-re
            String[] pontszamok = adatok[1].split(",");                         //"pont1-pont2,pont3-pont4,..." felosztjuk "pont1-pont2"-re és "pont3-pont4"-re és így tovább
            String[] harmadonkentPontszam;                                      //ebben tároljuk a harmadokban szerzett pontokat
            int golokCsapat1 = 0;
            int golokCsapat2 = 0;
            int pontokCsapat1 = 0;
            int pontokCsapat2 = 0;

            Csapat elsoCsapat = new Csapat(csapatok[0]);                        //csapatok[0] =>> első csapat neve
            Csapat masodikCsapat = new Csapat(csapatok[1]);                     //csapatok[1] =>> második csapat neve

            for (int i = 0; i < pontszamok.length; i++) {
                harmadonkentPontszam = pontszamok[i].split("-");                //"pont1-pont2"-t felosztjuk "pont1"-re és "pont2"-re
                golokCsapat1 += Integer.parseInt(harmadonkentPontszam[0]);      //"pont1"-et hozzáadunk az első csapat pontjaihoz
                golokCsapat2 += Integer.parseInt(harmadonkentPontszam[1]);      //"pont2"-t hozzáadunk a második csapat pontjaihoz
            }

            if (golokCsapat1 > golokCsapat2) {                                  //ha az első csapat több pontot gyűjtött a másodiknál
                if (pontszamok.length > 3) {                                    //ha volt hosszabbítás (és szétlövés):
                    pontokCsapat1 = 2;                                          //győztes csapat 2 pontot kap
                    pontokCsapat2 = 1;                                          //vesztes csapat 1 pontot kap
                } else {                                                        //ha nem volt hosszabbítás (és szétlövés)
                    pontokCsapat1 = 3;                                          //a győztes csapat 3 pontot kap
                }
            } else {                                                            //ha a második csapat több pontot gyűjtött az elsőnél (egyenlő pontszáma nem lehet a 2 csapatnak, mert valamelyik szétlövésben eldől a meccs)
                if (pontszamok.length > 3) {
                    pontokCsapat2 = 2;
                    pontokCsapat1 = 1;
                } else {
                    pontokCsapat2 = 3;
                }
            }

            elsoCsapat.setGolok(golokCsapat1);                                  //első csapat góljait és...
            elsoCsapat.setPontszam(pontokCsapat1);                              //...pontszámait beállítjuk

            masodikCsapat.setGolok(golokCsapat2);                               //második csapat góljait és...
            masodikCsapat.setPontszam(pontokCsapat2);                           //...pontszámait beállítjuk

            if (csapatLista.contains(elsoCsapat)) {                             //ha a lista tartalmazza az első csapatot, akkor csak módosítjuk ezek pontjait és góljait
                csapatLista.get(csapatLista.indexOf(elsoCsapat)).setGolok(csapatLista.get(csapatLista.indexOf(elsoCsapat)).getGolok() + golokCsapat1);
                csapatLista.get(csapatLista.indexOf(elsoCsapat)).setPontszam(csapatLista.get(csapatLista.indexOf(elsoCsapat)).getPontszam() + pontokCsapat1);
            } else {
                csapatLista.add(elsoCsapat);                                    //különben hozzáadjuk újonnan a csapatot
            }

            if (csapatLista.contains(masodikCsapat)) {                          //ha a lista tartalmazza a második csapatot, akkor csak módosítjuk ezek pontjait és góljait
                csapatLista.get(csapatLista.indexOf(masodikCsapat)).setGolok(csapatLista.get(csapatLista.indexOf(masodikCsapat)).getGolok() + golokCsapat2);
                csapatLista.get(csapatLista.indexOf(masodikCsapat)).setPontszam(csapatLista.get(csapatLista.indexOf(masodikCsapat)).getPontszam() + pontokCsapat2);
            } else {
                csapatLista.add(masodikCsapat);                                 //különben hozzáadjuk újonnan a csapatot
            }

            sor = sc.nextLine();
        }
        
        Collections.sort(csapatLista);

        for (Csapat i : csapatLista) {
            System.out.println(i);
        }

    }
}
