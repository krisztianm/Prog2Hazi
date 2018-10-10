/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iskola;

import java.util.Scanner;

/**
 *
 * @author Krisztian
 */
public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Melyik nap?");
        String nap = sc.nextLine();
        System.out.println("Órák száma?");
        int óraSzám = sc.nextInt();
        Ora[] óraTömb = new Ora[óraSzám];
        for (int i = 0; i < óraSzám; i++) {
            System.out.println("Óra kódja?");
            int kód = sc.nextInt();
            System.out.println("Óra neve?");
            String név = sc.next();
            System.out.println("Óra kezdete?");
            int kezdet = sc.nextInt();
            óraTömb[i] = new Ora(kód, név, kezdet);
        }

        Orarend órarend = new Orarend(nap);

        for (int i = 0; i < óraSzám; i++) {
            órarend.oratHozzaad(óraTömb[i]);
            System.out.println(órarend.oratHozzaad(óraTömb[i]));
        }
        System.out.println(órarend);

    }
}
