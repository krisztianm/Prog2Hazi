
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tiba
 */
public class Main {

    private static List<Vízgyüjtő> vz = new ArrayList(); //Ebbe  listába tároljuk a standrad inputról érkező vízgyűjtőket(az összeset)

    //Ez a metódus meghatározza, hogy egy paraméterként adott vízgyűjtőbe hány vízsgyűjtű folyik be közvetlenül és közvetetten
    // A közvetetten belefolyó vízgyűjtőket rekurzív módon(lásd prog1+adszerk) határozzuk meg
    public static int db_vizgy(Vízgyüjtő v) {
        int sum = v.getBeleFolynak().size(); // hányan folynak bele közvetlenül, ezt a saját listájában tárolja
        for (String o : v.getBeleFolynak()) { // most egyenként megnézzük azokat a folyókat, akik közvetlenül belefolynak, hogy 
                                               //beléjük hány folyó folyik be közvetlenül: ehhez kell a rekurzió
            Vízgyüjtő tmp = new Vízgyüjtő(o); //a folyó névvel létre hozok egy folyó objektumot(ennek üresek a belefolyik listája),
                                              //ez csak segéd változó, hogy kivegyem a listából az ilyen nevű folyót, mivel az indexOf csak a névlalapján veszi az egyezőséget, és keresi az elemet
            sum += db_vizgy(vz.get(vz.indexOf(tmp))); // miután kinyerem a tényleges folyót a listából, meghívom rá rekurzían ezt a függvényt
        }

        return sum;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String sor = sc.nextLine();
        while (sor.length() > 0) {

            String[] d = sor.split(";");
            if (d.length == 2) { // ha két elemű az input sor: azaz adott a vígyűjtőbe közvetlenül is belefolyó 
                Vízgyüjtő tmp = new Vízgyüjtő(d[1]);
                Vízgyüjtő tmp2 = new Vízgyüjtő(d[0]);
                if (vz.contains(tmp)) { //ha már mebbe van, akkor csak megkeresem és hozzá adom a listájához a beléje folyó vízgyűjtpt
                    vz.get(vz.indexOf(tmp)).getBeleFolynak().add(d[0]);

                } else  {// ha nincs benne, akkor, először hozzá adom a listájához a vízgyűjtőt(mint Stringet), majd elhelyezem a listába
                    tmp.getBeleFolynak().add(d[0]);
                    vz.add(tmp);

                }
                  // ha két vézgyűjtós az input, akkor a "belefolyó" vízgyűjtőt is adjuk a listánkhoz, ha az még nincs benne
                if (!vz.contains(tmp2)) {
                    vz.add(tmp2);
                }
            } else {// ha egy elems az input
                Vízgyüjtő tmp = new Vízgyüjtő(d[0]);
                if (!vz.contains(tmp)) {
                    vz.add(tmp);
                }

            }
            sor = sc.nextLine();
        }

        for (Vízgyüjtő i : vz) {
            System.out.println(i);
        }

        //A main függvény args paramétere egy String tömb: ez tratalmazza a parancssori paramétereket (mint C-ben)
        for (int i = 0; i < args.length; i++) { // minden parancsori paraméterként megadott folyóra keres a vízgyűjtők számát
            for (int j = 0; j < vz.size(); j++) { //megkeresem, hogy a nevével adott folyó, a listában van -r
                
                
                if (vz.get(j).getNév().equals(args[i])) { // ha a listában van az adott nevű folyó
                    System.out.println(vz.get(j).getNév() + ": " + db_vizgy(vz.get(j))); //kiírjuk a a nevét, és a vízgyűjtők számát
                    break; //kilépünk a belső ciklusból

                }
                //ha nem break-eltünk, végig ment  a belső for=> nem talátuk azbadott nevű folyót a listában
                if (j == vz.size() - 1) {

                    System.out.println(args[i] + ": " + 0);
                }
            }

        }

    }

}
