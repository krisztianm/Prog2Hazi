/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elso_feladat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import jdk.jfr.events.FileWriteEvent;
import java.lang.Exception;
import java.util.Collections;

/**
 *
 * @author Krisztian
 */
public class Main {

    public static void main(String[] args) {

        List<Termek> aruKeszlet = new ArrayList<Termek>();

        try {
            FileReader fr = new FileReader("termekek");
            BufferedReader buffer = new BufferedReader(fr);

            String sor;

            while ((sor = buffer.readLine()) != null) {
                String[] adatok = sor.split(";");

                if (adatok[0].equals("E")) {
                    Elelmiszer e = new Elelmiszer(adatok[1], Double.parseDouble(adatok[2]), adatok[3], Integer.parseInt(adatok[4]));

                    if (aruKeszlet.contains(e)) {
                        aruKeszlet.get(aruKeszlet.indexOf(e)).setDb(aruKeszlet.get(aruKeszlet.indexOf(e)).getDb() + Integer.parseInt(adatok[5]));
                    } else {
                        aruKeszlet.add(e);
                        aruKeszlet.get(aruKeszlet.indexOf(e)).setDb(Integer.parseInt(adatok[5]));
                    }
                } else {
                    Tartos t = new Tartos(adatok[1], Double.parseDouble(adatok[2]), adatok[3]);

                    if (aruKeszlet.contains(t)) {
                        aruKeszlet.get(aruKeszlet.indexOf(t)).setDb(aruKeszlet.get(aruKeszlet.indexOf(t)).getDb() + Integer.parseInt(adatok[4]));
                    } else {
                        aruKeszlet.add(t);
                        aruKeszlet.get(aruKeszlet.indexOf(t)).setDb(Integer.parseInt(adatok[4]));
                    }
                }
            }

            buffer.close();
        } catch (IOException i) {
            System.out.println("Helytelen fájl beolvasáshoz");
        }

        Collections.sort(aruKeszlet);

        for (Termek t : aruKeszlet) {
            System.out.println(t);
        }

        try {

            FileWriter fw = new FileWriter(new File("kimenet"));
            BufferedWriter bufferW = new BufferedWriter(fw);

            for (Termek t : aruKeszlet) {
                bufferW.write(t.toString());
                bufferW.newLine();
            }

            bufferW.close();
        } catch (IOException i) {
            System.out.println("Helyeteln fájl kiíráshoz");
        }

        try {

            FileReader fr = new FileReader(new File("bevasarloListaPontosTermekjellemzokkel"));
            BufferedReader buffer = new BufferedReader(fr);

            String termek = buffer.readLine();

            while (termek != null) {

                String[] adatok = termek.split(";");
                Termek t;

                if (adatok.length == 5) {
                    t = new Elelmiszer(adatok[0], Double.parseDouble(adatok[1]), adatok[2], Integer.parseInt(adatok[3]));
                    t.setDb(Integer.parseInt(adatok[4]));
                } else {
                    t = new Tartos(adatok[0], Double.parseDouble(adatok[1]), adatok[2]);
                    t.setDb(Integer.parseInt(adatok[3]));
                }

                if (aruKeszlet.contains(t)) {
                    if (t.getDb() > aruKeszlet.get(aruKeszlet.indexOf(t)).getDb()) {
                        aruKeszlet.get(aruKeszlet.indexOf(t)).setDb(0);
                        throw new ArithmeticException(t.getNev());
                    } else {
                        aruKeszlet.get(aruKeszlet.indexOf(t)).setDb(aruKeszlet.get(aruKeszlet.indexOf(t)).getDb() - t.getDb());
                    }
                } else {
                    throw new NullPointerException(t.getNev());
                }

                termek = buffer.readLine();
            }

        } catch (IOException i) {
            System.out.println("Hibás fájlnév a bevásárlólistához");
        } catch (ArithmeticException a) {
            System.out.println("A kért mennyiséget nem tudjuk leszállítani ebből: " + a.getMessage());
        } catch (NullPointerException n) {
            System.out.println("Nincs ilyen termék: " + n.getMessage());
        }

        try {

            FileWriter fw = new FileWriter(new File("kimenetVasarlasUtan"));
            BufferedWriter bufferW = new BufferedWriter(fw);

            for (Termek t : aruKeszlet) {
                bufferW.write(t.toString());
                bufferW.newLine();
            }

            bufferW.close();
        } catch (IOException i) {
            System.out.println("Helyeteln fájl kiíráshoz");
        }

        try {

            FileReader fr = new FileReader(new File("bevasarloListaTermeknevekkel"));
            BufferedReader buffer = new BufferedReader(fr);

            String termek = buffer.readLine();

            while (termek != null) {

                for (Termek t : aruKeszlet) {
                    if (termek.equals(t.getNev())) {
                        if (t instanceof Elelmiszer) {
                            t.setDb(t.getDb() - 1);
                            break;
                        } else {
                            t.setDb(t.getDb() - 1);
                        }
                    }
                }

                termek = buffer.readLine();
            }

        } catch (IOException i) {
            System.out.println("Hibás fájlnév a bevásárlólistához");
        } catch (NullPointerException n) {
            System.out.println("Nincs ilyen termék: " + n.getMessage());
        }

        try {

            FileWriter fw = new FileWriter(new File("kimenetVasarlasUtan2"));
            BufferedWriter bufferW = new BufferedWriter(fw);

            for (Termek t : aruKeszlet) {
                bufferW.write(t.toString());
                bufferW.newLine();
            }

            bufferW.close();
        } catch (IOException i) {
            System.out.println("Helyeteln fájl kiíráshoz");
        }

        try {
            FileWriter fw = new FileWriter(new File("kimenetTisztitasUtan"));
            BufferedWriter buffer = new BufferedWriter(fw);

            for (int i = 0; i < aruKeszlet.size(); i++) {
                if (aruKeszlet.get(i).getDb() == 0) {
                    aruKeszlet.remove(aruKeszlet.get(i));
                }
            }

            for (Termek t : aruKeszlet) {
                buffer.write(t.toString());
                buffer.newLine();
            }

            buffer.close();
        } catch (IOException i) {
            System.out.println("Tisztítás után nem lehet kiírni a termékeket. Ellenőrizd a kimeneti fájlt");
        }

        try {
            FileReader fr = new FileReader(new File("akciosArak"));
            BufferedReader buffer = new BufferedReader(fr);
            String sor;

            while ((sor = buffer.readLine()) != null) {
                String[] adatok = sor.split(";");

                for (Termek t : aruKeszlet) {
                    if (adatok[0].equals("E") && (t instanceof Elelmiszer)) {
                        Elelmiszer e = (Elelmiszer) t;

                        if (adatok[1].equals(e.getNev()) && adatok[3].equals(e.getEgyseg()) && Integer.parseInt(adatok[4]) == e.getSzavatossag()) {
                            t.setAr(Double.parseDouble(adatok[2]));
                        }
                    } else if (adatok[0].equals("T") && (t instanceof Tartos)) {
                        Tartos tart = (Tartos) t;

                        if (adatok[1].equals(tart.getNev()) && adatok[3].equals(tart.getEgyseg())) {
                            t.setAr(Double.parseDouble(adatok[2]));
                        }
                    }
                }
            }

        } catch (IOException i) {
            System.out.println("Hiba az akciókat tartalmazó fájllal");
        }
        
        try {

            FileWriter fw = new FileWriter(new File("kimenetAkciozasUtan"));
            BufferedWriter bufferW = new BufferedWriter(fw);

            for (Termek t : aruKeszlet) {
                bufferW.write(t.toString());
                bufferW.newLine();
            }

            bufferW.close();
        } catch (IOException i) {
            System.out.println("Helyeteln fájl akciós termékek kiíráshoz");
        }
    }
}
