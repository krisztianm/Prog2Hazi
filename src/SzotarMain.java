
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
public class SzotarMain {

    public static void rendez(Szotar[] s) {
        for (int i = 0; i < s.length - 1; i++) {
            for (int j = i + 1; j < s.length; j++) {
                if (s[i].getAngol().compareTo(s[j].getAngol()) == 0) {
                    if (s[i].getMagyar().compareTo(s[j].getMagyar()) > 0) {
                        Szotar temp = s[i];
                        s[i] = s[j];
                        s[j] = temp;
                    }
                } else if(s[i].getAngol().compareTo(s[j].getAngol()) > 0){
                    Szotar temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }
    }
    
    public static void kiír(Szotar[] s){
        for (int i=0; i<s.length; i++){
            System.out.println(s[i]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int db = Integer.parseInt(sc.nextLine());
        Szotar[] szótár = new Szotar[db];

        for (int i = 0; i < db; i++) {
            String sor = sc.nextLine();
            String[] szavak = sor.split(":");

            szótár[i] = new Szotar(szavak[0], szavak[1]);
        }

        rendez(szótár);

        kiír(szótár);
    }
}