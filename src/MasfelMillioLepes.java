
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Krisztian
 */
public class MasfelMillioLepes {

    public static void rendez(Turista[] t) {

        for (int i = 0; i < t.length - 1; i++) {
            for (int j = i + 1; j < t.length; j++) {
                if (t[i].getK() == t[j].getK()) {
                    if (t[i].getPSZ() == t[j].getPSZ()) {
                        if (t[i].getNév().compareTo(t[j].getNév()) > 0) {
                            Turista temp = t[i];
                            t[i] = t[j];
                            t[j] = temp;
                        }
                    } else if (t[i].getPSZ() < t[j].getPSZ()) {
                        Turista temp = t[i];
                        t[i] = t[j];
                        t[j] = temp;
                    }
                } else if (t[i].getK() < t[j].getK()) {
                    Turista temp = t[i];
                    t[i] = t[j];
                    t[j] = temp;
                }
            }
        }
    }

    public static void kiír(Turista[] t) {
        for (int i = 0; i < t.length; i++) {
            System.out.println(t[i]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int db = Integer.parseInt(sc.nextLine());

        Turista[] t = new Turista[db];

        for (int i = 0; i < db; i++) {
            int sumK = 0;
            int sumPSZ = 0;
            String sor = sc.nextLine();
            String[] adatok = sor.split(";");

            t[i] = new Turista(adatok[0], adatok[1]);

            for (int j = 0; j < t[i].getÚtvonal().length(); j++) {
                if (t[i].getÚtvonal().charAt(j) == 'K') {
                    sumK++;
                } else if (t[i].getÚtvonal().charAt(j) == 'P' || t[i].getÚtvonal().charAt(j) == 'S' || t[i].getÚtvonal().charAt(j) == 'Z') {
                    sumPSZ++;
                }
            }

            t[i].setK(sumK);
            t[i].setPSZ(sumPSZ);
        }

        rendez(t);
        kiír(t);
    }
}
