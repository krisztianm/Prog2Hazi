/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osztalypenz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Krisztian
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sor = sc.nextLine();

        List<Diak> nevsor = new ArrayList<Diak>();

        while (sor.length() > 0) {
            String[] adatok = sor.split(";");
            
            Diak d = new Diak(adatok[0]);
            
            if (nevsor.contains(d)){
                nevsor.get(nevsor.indexOf(d)).setOsszeg(nevsor.get(nevsor.indexOf(d)).getOsszeg() + Integer.parseInt(adatok[1]));
            } else {
                d.setOsszeg(Integer.parseInt(adatok[1]));
                nevsor.add(d);
            }
            
            sor = sc.nextLine();
        }
        
        Collections.sort(nevsor);
        
        for (Diak i : nevsor){
            System.out.println(i);
        }
    }
}
