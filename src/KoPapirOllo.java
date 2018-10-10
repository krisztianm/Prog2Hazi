
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
public class KoPapirOllo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = null;
        String output = new String();

        do {

            input = sc.nextLine();
            
            if(!(input.equals("ko") || input.equals("papir") || input.equals("ollo") || input.equals("vege"))){
                
                System.out.println("Hibás érték, kérem az új értéket");
                
            } else if (!(input.equals("vege"))) {
                int r = (int) (Math.random() * 3);

                switch (r) {
                    case 0:
                        output = "ko";
                        break;
                    case 1:
                        output = "papir";
                        break;
                    case 2:
                        output = "ollo";
                        break;
                }
                System.out.println("A te értéked: " + input);
                System.out.println("Az én értékem: " + output);

                if (input.equals("ko")) {
                    if (input.equals(output)) {
                        System.out.println("Döntetlen");
                    } else if (output.equals("papir")) {
                        System.out.println("Nyertem");
                    } else {
                        System.out.println("Nyertél");
                    }
                } else if (input.equals("papir")) {
                    if (input.equals(output)) {
                        System.out.println("Döntetlen");
                    } else if (output.equals("ollo")) {
                        System.out.println("Nyertem");
                    } else {
                        System.out.println("Nyertél");
                    }
                } else if (input.equals("ollo")) {
                    if (input.equals(output)) {
                        System.out.println("Döntetlen");
                    } else if (output.equals("ko")) {
                        System.out.println("Nyertem");
                    } else {
                        System.out.println("Nyertél");
                    }
                }
            } else {
                System.out.println("Vége a játéknak");
                break;
            }
        }while (!(input.equals("ko")) || !(input.equals("papir")) || !(input.equals("ollo")) || !(input.equals("vege")));
    }
}
