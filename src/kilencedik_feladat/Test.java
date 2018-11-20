/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kilencedik_feladat;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Krisztian
 */
public class Test {

    public static void kiírMárkaSzerintLexikografikusanAzonBelülZsebekSzámaSzerintCsökkenőSorrendben(List<Hátizsák> lista) {
        for (int i = 0; i < lista.size() - 1; i++) {
            for (int j = i + 1; j < lista.size(); j++) {
                if (lista.get(i).getMárka().compareTo(lista.get(j).getMárka()) == 0) {
                    if (lista.get(i).getZsebekSzáma() < lista.get(j).getZsebekSzáma()) {
                        Hátizsák temp = lista.get(i);
                        lista.set(i, lista.get(j));
                        lista.set(j, temp);
                    }
                } else if (lista.get(i).getMárka().compareTo(lista.get(j).getMárka()) > 0) {
                    Hátizsák temp = lista.get(i);
                    lista.set(i, lista.get(j));
                    lista.set(j, temp);
                }
            }
        }
        
        for (Hátizsák i : lista){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        List<Hátizsák> hátizsákok = new ArrayList<Hátizsák>();

        hátizsákok.add(new Hátizsák("Puma", 60, 3, true));
        hátizsákok.add(new Hátizsák("Quechua", 72, 5, true));
        hátizsákok.add(new Hátizsák("Adidas", 45, 2, false));
        hátizsákok.add(new Hátizsák("Adventurer", 68, 3, false));
        hátizsákok.add(new Hátizsák("Adidas", 40, 2, false));
        hátizsákok.add(new Hátizsák("The North Face", 80, 6, true));
        hátizsákok.add(new Hátizsák("Puma", 45, 3, false));
        hátizsákok.add(new Hátizsák("Nike", 50, 3, true));
        hátizsákok.add(new Hátizsák("Quechua", 70, 4, false));
        hátizsákok.add(new Hátizsák("Quechua", 45, 2, false));
        hátizsákok.add(new Hátizsák("Adventurer", 68, 4, false));
        hátizsákok.add(new Hátizsák("Adventurer", 78, 5, true));
        
        kiírMárkaSzerintLexikografikusanAzonBelülZsebekSzámaSzerintCsökkenőSorrendben(hátizsákok);
    }
}
