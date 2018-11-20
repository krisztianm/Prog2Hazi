package elso_feladat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Krisztian
 */
public class Main {

    public static Aszu[] otPuttonyos(Bor[] b) {
        int n = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i] instanceof Aszu) {
                Aszu aszu = (Aszu) b[i];
                if (aszu.hanyPuttonyos() == 5) {
                    n++;
                }
            }
        }
        Aszu[] a = new Aszu[n];
        int j = 0;

        for (int i = 0; i < b.length; i++) {
            if (b[i] instanceof Aszu) {
                Aszu aszu = (Aszu) b[i];
                if (aszu.hanyPuttonyos() == 5) {
                    a[j] = aszu;
                    j++;
                }

            }
        }
        return a;
    }

    public static void kiir(Aszu[] a) {
        for (Aszu i : a) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        Bor[] bor = {
            new Bor("Balafánt", "Pécs", "édes", 7.85),
            new Bor("Csomorika", "Kunság", "édes", 6.9),
            new Bor("Zeus", "Tokaj", "száraz", 10.2),
            new Aszu(5, "Tokaj", 6.5),
            new Bor("Zeus", "Zala", "félszáraz", 5.5),
            new Aszu(6, "Eger", 7.11),
            new Aszu(5, "Kunság", 4.9),
            new Aszu(7, "Balatonboglár", 5.05),
            new Aszu(5, "Pécs", 4.9),
            new Aszu(3, "Kunság", 6.0)
        };

        kiir(otPuttonyos(bor));
    }
}
