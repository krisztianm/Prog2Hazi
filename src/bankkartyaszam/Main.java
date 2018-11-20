/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankkartyaszam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Krisztian
 */
public class Main {

    public static boolean luhn(double n) {
        int sum = 0;

        if (n / Math.pow(10, 15) < 1 || n / Math.pow(10, 15) > 9) {
            return false;
        }
        for (int i = 2; i <= 16; i += 2) {
            int ptlanSzjegy = (int) (n % Math.pow(10, i) / Math.pow(10, i - 1));
            sum += (int) (n % Math.pow(10, i - 1) / Math.pow(10, i - 2));

            if (ptlanSzjegy * 2 > 9) {
                sum += (ptlanSzjegy * 2 - 9);
            } else {
                sum += ptlanSzjegy * 2;
            }
        }

        if (sum % 10 != 0) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        List<String> kartyaSzam = new ArrayList<String>();

        Scanner sc = new Scanner(System.in);
        String sor = sc.nextLine();

        while (sor.length() > 0) {
            kartyaSzam.add(sor);
            sor = sc.nextLine();
        }

        for (String i : kartyaSzam) {
            if (luhn(Double.parseDouble(i))) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
