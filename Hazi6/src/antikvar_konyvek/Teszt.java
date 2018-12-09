/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antikvar_konyvek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Krisztian
 */
public class Teszt {
    public static void main(String[] args) {    //tömb első eleme tartalmazza a fájl nevét sample.txt
        
        List<Könyv> könyvek = new ArrayList();
        
        try{
            FileReader fr = new FileReader(new File("sample.txt"));    //megnyitjuk a fájlt olvasásra; a Filereader konstruktora egy File típúst vár paraméterül,
                                                                 //ezért létrehozunk egy új fájlt; a File konstruktora stringet vár,
                                                                 //args[0]-t ami tartalmazza a fájlunk nevét 
            BufferedReader buffer = new BufferedReader(fr);     // egy buffert használunk, hogy gyorsítsunk a beolvasáson; a buffer egy verem, amibe beolvasunk;
                                                                //ha ez megtelik akkor egyben adja tovább, nem stringenként
            String sor;
            
            while ((sor = buffer.readLine()) != null){          //ha amit beolvasunk a bufferből, nem "null"; a FileReaderrel nem tudunk sorokat beolvasni, csak szavakat
                                                            //ha a readLine() fájlvége jelet olvas, akkor "null"-t ad vissza
                String[] adatok = sor.split(";");
                Könyv k = new Könyv(adatok[adatok.length-2], Integer.parseInt(adatok[adatok.length-1]));
                
                for (int i = 0; i < adatok.length - 2; i++){
                    k.getSzerzők().add(adatok[i]);              //hozzáadjuk a szerzőket a könyvhöz
                }
                
                könyvek.add(k);                                 //hozzáadjuk a könyv listához a könyvet
            }
            
            buffer.close();         //bezárjuk a buffert
            
        } catch(IOException e){         //ha a fájl elérési útjával/nevével volt gond
            System.out.println("Fájl hiba");
        }
        
        Collections.sort(könyvek);
                
        try{
            FileWriter fw = new FileWriter(new File("ki.txt"));         //ki.txt-be fogjuk írni
            BufferedWriter bw = new BufferedWriter(fw);                 //ehhez is buffert hozunk létre
            
            List<Könyv> tmpLista = new ArrayList<Könyv>();
            
            for (int i = 0; i < könyvek.size()-1 ; i++){
                tmpLista.add(könyvek.get(i));
                for (int j = i+1; j < könyvek.size(); j++){
                    if (könyvek.get(i).equals(könyvek.get(j))){
                        könyvek.remove(j);
                    }
                }
            }
            
            tmpLista.add(könyvek.get(könyvek.size()-1));
            
            for (Könyv i : tmpLista){
                bw.write(i.toString());                                 //kiírjuk a fájlba; az i toString-jét meg kell hívni, mert nem ismeri fel a system.out-tal ellentétben
                bw.newLine();                                           //soronként tördeli, nem egy sorba írja
            }
            
            bw.close();             //bezárjuk a buffert, és kiüríti a buffer tartalmát
            
        } catch (IOException e){
                System.out.println("Hibás file");                
        }
    }
}
