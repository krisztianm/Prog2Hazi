/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nyolcadik_feladat;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Krisztian
 */
public class Main {
    public static void main(String[] args) {
        List<Double> lst= new ArrayList<Double>();
        Lista l = new Lista(lst);
        l.add(10.1);
        l.add(12.3);
        l.add(14.6);
        l.add(16.9);
        l.add(18.2);
        
        System.out.println(l.get(3));
        l.delete(1);
        System.out.println(l.contains(12.3));
        System.out.println(l.getFirstOccurrence(12.3));
        System.out.println(l.getFirstOccurrence(18.2));
    }
}
