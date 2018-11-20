/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hetedik_feladat;

/**
 *
 * @author Krisztian
 */
public class Lakóház implements Comparable<Lakóház> {
    public final double EMELETMAGASSÁG = 3.2;
    private String cím;
    private int emeletekSzáma;
    private double alapterület;

    public Lakóház(String cím, int emeletekSzáma, double alapterület) {
        this.cím = cím;
        this.emeletekSzáma = emeletekSzáma;
        this.alapterület = alapterület;
    }

    public String getCím() {
        return cím;
    }

    public int getEmeletekSzáma() {
        return emeletekSzáma;
    }

    public double getAlapterület() {
        return alapterület;
    }
    
    public double légköbméter(){
        return this.alapterület * this.EMELETMAGASSÁG * this.emeletekSzáma;
    }

    @Override
    public String toString() {
        return "Lakóház a " + cím + " helyen, " + emeletekSzáma + " emelettel, alapterülete: " + alapterület + ", térfogata: " + légköbméter();
    }
    
    @Override
    public int compareTo(Lakóház obj){
        return Double.compare(this.légköbméter(), obj.légköbméter());
    }
}
