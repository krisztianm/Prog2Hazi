
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
public class BudapestKupa {

    public static void túraRendezés(BudapestKupaTura[] t) {
        for (int i = 0; i < t.length - 1; i++) {
            for (int j = i + 1; j < t.length; j++) {
                if (t[i].getTáv() == t[j].getTáv()) {
                    if (t[i].getNév().compareTo(t[j].getNév()) >= 0) {
                        BudapestKupaTura temp = t[i];
                        t[i] = t[j];
                        t[j] = temp;
                    }
                } else if (t[i].getTáv() < t[j].getTáv()) {
                    BudapestKupaTura temp = t[i];
                    t[i] = t[j];
                    t[j] = temp;
                }
            }
        }
    }

    public static void kiír(BudapestKupaTura[] t) {
        int maxTáv = t[0].getTáv();
        System.out.println(t[0]);
        for (int i = 1; i < t.length; i++) {
            if (t[i].getTáv() == maxTáv){
                System.out.println(t[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int túraSzám = Integer.parseInt(sc.nextLine());
        BudapestKupaTura[] túrák = new BudapestKupaTura[túraSzám];

        for (int i = 0; i < túraSzám; i++) {
            String sor = sc.nextLine();
            String[] f = sor.split(";");
            int résztávSum = 0;

            for (int j = 4; j < f.length; j++) {
                résztávSum += Integer.parseInt(f[j]);
            }
            túrák[i] = new BudapestKupaTura(Integer.parseInt(f[0]), Integer.parseInt(f[1]), Integer.parseInt(f[2]), f[3], résztávSum);

        }
        
        túraRendezés(túrák);

        kiír(túrák);

    }
}
