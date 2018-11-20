/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zh;

import egyetem.Pontozhato;

/**
 *
 * @author Krisztian
 */
public class Dolgozat implements Pontozhato{
    private double pontszam;

    public Dolgozat(double pontszam) {
        this.pontszam = pontszam;
    }
    
    @Override
    public boolean megfelelt(){
        if (this.getPontszam() == -1){
            System.out.println("Nem írt");
            return false;
        } else if (this.getPontszam() != -1 && this.getPontszam() <= 15){
            return false;
        } else {
            return true;
        }
    }

    public double getPontszam() {
        return pontszam;
    }

    public void setPontszam(double pontszam) {
        this.pontszam = pontszam;
    }

    @Override
    public String toString() {
        return "Dolgozat pontszáma: " + pontszam;
    }
    
}
