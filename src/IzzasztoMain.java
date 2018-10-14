
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
public class IzzasztoMain {

    public static void rendez(TelepulesHomerseklet[] t) {
        for (int i = 0; i < t.length - 1; i++) {
            for (int j = i + 1; j < t.length; j++) {
                if (t[i].getHőmérséklet() == t[j].getHőmérséklet()) {
                    if (t[i].getVáros().compareTo(t[j].getVáros()) > 0) {
                        TelepulesHomerseklet temp = t[i];
                        t[i] = t[j];
                        t[j] = temp;
                    }
                } else if (t[i].getHőmérséklet() < t[j].getHőmérséklet()) {
                    TelepulesHomerseklet temp = t[i];
                    t[i] = t[j];
                    t[j] = temp;
                }
            }
        }
    }
    
    public static void kiír(TelepulesHomerseklet[] t, String v){
        int minHőmérséklet = 0;
        for (int i=0; i<t.length; i++){
           if (t[i].getVáros().compareTo(v) == 0){
               minHőmérséklet = t[i].getHőmérséklet();
           }
        }
        for (int i=0; i<t.length; i++){            
           if (t[i].getHőmérséklet() > minHőmérséklet){
               System.out.println(t[i]);
           }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String elsőSor = sc.nextLine();
        String[] alapAdatok = elsőSor.split(" ");
        boolean vanAdat = false;

        TelepulesHomerseklet[] t = new TelepulesHomerseklet[Integer.parseInt(alapAdatok[0])];

        for (int i = 0; i < Integer.parseInt(alapAdatok[0]); i++) {
            String sor = sc.nextLine();
            String[] adatok = sor.split(":");

            if (alapAdatok[1].compareTo(adatok[0]) == 0) {
                vanAdat = true;
            }

            t[i] = new TelepulesHomerseklet(adatok[0], Integer.parseInt(adatok[1]));
        }

        if (vanAdat) {
            rendez(t);
            kiír(t, alapAdatok[1]);
        } else {
            System.out.println("Missing data\n");
        }
    }
}
//
//6 Debrecen
//Budapest:19
//Debrecen:24
//Esztergom:25
//Miskolc:26
//Szeged:20
//Szolnok:25