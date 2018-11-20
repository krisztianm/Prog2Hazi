/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkolo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Krisztian
 */
public class Parkolo implements Comparable<Parkolo> {

    private String cim;
    private int kapacitas;
    private double terulet;
    private List<String> rendszamok = new ArrayList<String>();
    private int szabadHelyek;

    public Parkolo(String cim, double terulet, int kapacitas, List<String> rendszamok) {
        this.cim = cim;
        this.kapacitas = kapacitas;
        this.terulet = terulet;
        this.rendszamok = rendszamok;
        this.szabadHelyek = this.kapacitas - this.rendszamok.size();
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public int getKapacitas() {
        return kapacitas;
    }

    public void setKapacitas(int kapacitas) {
        this.kapacitas = kapacitas;
    }

    public double getTerulet() {
        return terulet;
    }

    public void setTerulet(double terulet) {
        this.terulet = terulet;
    }

    public List<String> getRendszamok() {
        return rendszamok;
    }

    public void setRendszamok(List<String> rendszamok) {
        this.rendszamok = rendszamok;
    }

    public int getSzabadHelyek() {
        return szabadHelyek;
    }

    public void setSzabadHelyek(int szabadHelyek) {
        this.szabadHelyek = szabadHelyek;
    }

    @Override
    public String toString() {
        return this.cim + ": " + this.szabadHelyek + " szabad hely";
    }

    @Override
    public int compareTo(Parkolo t) {
        return -1 * Integer.compare(this.szabadHelyek, t.getSzabadHelyek());
    }

}
