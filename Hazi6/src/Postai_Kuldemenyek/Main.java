/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postai_Kuldemenyek;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Krisztian
 */
public class Main {
    public static void main(String[] args) {
        
        List<Iranyitoszam> iranyitoszamokListaja = new ArrayList<Iranyitoszam>();
        
        try{
            FileReader fr = new FileReader(new File("samplePostai.txt"));        //vagy args[0]
            BufferedReader buffer = new BufferedReader(fr);
            
            String sor;
            
            while ((sor = buffer.readLine()) != null) {
                
                String[] adatok = sor.split(":");
                
                Iranyitoszam i = new Iranyitoszam(Integer.parseInt(adatok[1]));
                Cimzett c = new Cimzett(adatok[0], Integer.parseInt(adatok[1]), adatok[2], adatok[3], Integer.parseInt(adatok[4]), Integer.parseInt(adatok[5]));
                
                if (iranyitoszamokListaja.contains(i)){                         //ha a lista tartalmazza az i irányítószámot
                    if (iranyitoszamokListaja.get(iranyitoszamokListaja.indexOf(i)).getCimzett().contains(c)){                      //ha a listában szereplő i irányítószám tartalmazza már a címzettet
                        iranyitoszamokListaja.get(iranyitoszamokListaja.indexOf(i)).setOsszErtek(iranyitoszamokListaja.get(iranyitoszamokListaja.indexOf(i)).getOsszErtek() + c.getCsomagErteke());         //a címzett csomagjának értékét hozzáadjuk az összértékhez
                    } else {                                                    //ha a listában szereplő i irányítószám nem tartalmazza a címzettet
                        iranyitoszamokListaja.get(iranyitoszamokListaja.indexOf(i)).setOsszErtek(iranyitoszamokListaja.get(iranyitoszamokListaja.indexOf(i)).getOsszErtek() + c.getCsomagErteke());         //a címzett csomagjának értékét hozzáadjuk az összértékhez
                        iranyitoszamokListaja.get(iranyitoszamokListaja.indexOf(i)).getCimzett().add(c);        //hozzáadjuk a listában szereplő i irányítószámhoz a címzettet
                    }
                } else {                                                        //ha nem tartalmazza i irányítószámot
                    i.getCimzett().add(c);                                      //i irányítószámhoz hozzáadjuk a címzettet
                    i.setOsszErtek(i.getOsszErtek() + c.getCsomagErteke());     //i irányítószámra érkező csomagok összértértékét növeljük az utoljára hozzáadott címzett csomagjának értékével
                    iranyitoszamokListaja.add(i);                               //hozzáadjuk i irányítószámot a listához
                }
                
            }
            
            buffer.close();
            
        } catch (IOException i) {
            System.out.println("Hibás fájl beolvasáshoz");
        }
        
        Collections.sort(iranyitoszamokListaja);
        
        for (Iranyitoszam i : iranyitoszamokListaja){
            System.out.println(i);
        }
        
    }
}
