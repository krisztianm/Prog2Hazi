/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Krisztian
 */
public class Landzsas extends Katona{

    public Landzsas(double támadóerő, double védőerő) {
        super(támadóerő, védőerő);
    }

    @Override
    public String toString() {
        return "Lándzsás: TE: " + this.getTámadóerő() + ", VE: " + this.getVédőerő();
    }
    
    
    
}
