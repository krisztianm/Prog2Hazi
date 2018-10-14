
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
public class Fejesek {

    public static void rendez(Diák[] diákok) {
        for (int i = 0; i < diákok.length - 1; i++) {
            for (int j = i + 1; j < diákok.length; j++) {
                if (diákok[j].getElőzőnév().equals(diákok[i].getNév()) && j > i + 1) {
                    Diák temp = diákok[i + 1];
                    diákok[i + 1] = diákok[j];
                    diákok[j] = temp;
                }
            }
        }
    }

    public static void sapkaSum(Diák[] diákok, String adottDiák) {
        int pirosSapka = 0;
        int kékSapka = 0;
        for (int i = 0; i < diákok.length; i++) {
            if (diákok[i].getNév().equals(adottDiák)) {
                System.out.println(pirosSapka + " " + kékSapka);
                break;
            } else if (i % 2 == 0) {
                pirosSapka++;
            } else {
                kékSapka++;
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String[] alapAdatok = a.split(";");
        int db = Integer.parseInt(alapAdatok[0]);
        
        Diák[] diákok = new Diák[db];
        diákok[0] = new Diák(alapAdatok[1], "");
        
        for (int i = 1; i<db; i++){
            String sor = sc.nextLine();
            String[] d = sor.split(";");
            
            diákok[i] = new Diák(d[0], d[1]);
        }
        
        rendez(diákok);
        
        sapkaSum(diákok, alapAdatok[2]);
    }

}
