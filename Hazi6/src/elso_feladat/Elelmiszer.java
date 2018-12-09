/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elso_feladat;

/**
 *
 * @author Krisztian
 */
public class Elelmiszer extends Termek {

    private int szavatossag;

    public Elelmiszer(String nev, double ar, String egyseg, int szavatossag) {
        super(nev, ar, egyseg);
        this.szavatossag = szavatossag;
    }

    public int getSzavatossag() {
        return szavatossag;
    }

    public void setSzavatossag(int szavatossag) {
        this.szavatossag = szavatossag;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Elelmiszer)) {
            return false;
        }

        Elelmiszer e = (Elelmiszer) obj;

        return this.getNev().equals(e.getNev()) && this.getAr() == (e.getAr()) && this.getEgyseg().equals(e.getEgyseg()) && this.getSzavatossag() == (e.getSzavatossag());
    }

    @Override
    public String toString() {
        return "Élelmiszer: " + this.getNev() + " " + this.getAr() + " Ft, szavatossaga:" + this.getSzavatossag() + ", " + this.getDb() + " " + this.getEgyseg();
    }
    
//    @Override
//    public int compareTo(Elelmiszer e){
////        Elelmiszer e = (Elelmiszer) t;
//        
//        if (this.getNev().equals(e.getNev())){
//            return Integer.compare(this.getSzavatossag(), e.getSzavatossag());
//        } else {
//            return this.getNev().compareTo(e.getNev());
//        }
//    }

}
