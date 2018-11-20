
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import jdk.nashorn.internal.ir.CatchNode;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tiba
 */
public class Main {

    public static void main(String[] args) {
        List<Színész> szl = new ArrayList();

        Scanner sc = new Scanner(System.in);
        String sor = sc.nextLine();
        while (sor.length() > 0) {
            String[] darabolt = sor.split("[():,]");
            for (int i = 3; i < darabolt.length; i++) {
                Színész sz = new Színész(darabolt[i]);

                if (szl.contains(sz)) {
                    szl.get(szl.indexOf(sz)).getFilmek().add(new Film(darabolt[0], Integer.parseInt(darabolt[1])));
                } else {
                    sz.getFilmek().add(new Film(darabolt[0], Integer.parseInt(darabolt[1])));
                    szl.add(sz);
                }

            }

            sor = sc.nextLine();

        }

        
        Collections.sort(szl);
        for(Színész i:szl)
            System.out.println(i);

    }
}
