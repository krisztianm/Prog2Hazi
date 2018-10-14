
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
public class HullamvasutakMain {

    public static void rendez(Hullamvasutak[] h) {
        for (int i = 0; i < h.length - 1; i++) {
            for (int j = i + 1; j < h.length; j++) {
                if (h[i].getVárakozásiIdő() == h[j].getVárakozásiIdő()) {
                    if (h[i].getMinMagasság() == h[j].getMinMagasság()) {
                        if (h[i].getHullámvasútNév().compareTo(h[j].getHullámvasútNév()) > 0) {
                            Hullamvasutak temp = h[i];
                            h[i] = h[j];
                            h[j] = temp;
                        }
                    } else if (h[i].getMinMagasság() < h[j].getMinMagasság()) {
                        Hullamvasutak temp = h[i];
                        h[i] = h[j];
                        h[j] = temp;
                    }
                } else if (h[i].getVárakozásiIdő() > h[j].getVárakozásiIdő()) {
                    Hullamvasutak temp = h[i];
                    h[i] = h[j];
                    h[j] = temp;
                }
            }
        }
    }
    
    public static void kiír(Hullamvasutak[] h) {
        for (int i=0; i<h.length; i++){
            System.out.println(h[i]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int db = Integer.parseInt(sc.nextLine());
        Hullamvasutak[] hv = new Hullamvasutak[db];

        for (int i = 0; i < db; i++) {
            String sor = sc.nextLine();
            String[] hullamvTomb = sor.split(";");

            hv[i] = new Hullamvasutak(hullamvTomb[0], hullamvTomb[1], Integer.parseInt(hullamvTomb[2]), Integer.parseInt(hullamvTomb[3]));
        }

        rendez(hv);
        
        kiír(hv);
    }
}
