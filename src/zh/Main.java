/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zh;

import java.util.Scanner;

/**
 *
 * @author Krisztian
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int hallgatokSzama = Integer.parseInt(sc.nextLine());
        
        Hallgato[] h = new Hallgato[hallgatokSzama]; 
        
        for (int i = 0; i < hallgatokSzama; i++){
            String sor = sc.nextLine();
            String[] adat = sor.split(" ");
            h[i] = new Hallgato(Integer.parseInt(adat[0]), Boolean.parseBoolean(adat[1]));
        }
        
        for (int i = 0; i < h.length; i++){
            Dolgozat elsoDolgozat = h[i].dolgozatotIr();
            Dolgozat masodikDolgozat = h[i].dolgozatotIr();
            
            if (elsoDolgozat.megfelelt() && masodikDolgozat.megfelelt()){
                System.out.println("Megfelelt");
            } else if (elsoDolgozat.getPontszam() == -1 || masodikDolgozat.getPontszam() == -1){
                System.out.println("Nem írt");
            } else {
                System.out.println("Nem felelt meg");
            }
        }
        
    }
}
