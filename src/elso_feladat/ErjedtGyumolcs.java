package elso_feladat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Krisztian
 */
public class ErjedtGyumolcs extends Gyumolcs implements Alkoholos{
    private double alkoholTartalom;

    public ErjedtGyumolcs(String f, String i, double a) {
        super(f, i);
        this.alkoholTartalom = a;
    }
    
    @Override
    public double mennyiAlkoholtTartalmaz(){
        return alkoholTartalom;
    }

    @Override
    public String toString() {
        return alkoholTartalom + " alkoholtartalmu erjedtgyumolcs";
    }
    
}
