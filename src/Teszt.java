/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Krisztian
 */
public class Teszt {
    public static Katona megkuzd(Katona elso, Katona masodik){
        Katona gyoztes = elso;
        System.out.println(elso + " és " + masodik + " küzdelméből a nyertes: ");
        if (elso.getTámadóerő() >= masodik.getVédőerő()){
            return gyoztes;
        } else if (masodik.getTámadóerő() > elso.getVédőerő()) {
            gyoztes = masodik;
        }
        return gyoztes;
    }
    
    public static void main(String[] args) {
        Nyilas vitézNyilas = new Nyilas(2.3, 4.5, 6.0);
        Nyilas pontosNyilas = new Nyilas(2.5, 3.0, 7.2);
        Landzsas batorLandzsas = new Landzsas(8.6, 8.4);
        
        System.out.println(megkuzd(megkuzd(vitézNyilas, pontosNyilas), batorLandzsas));
        
    }
}
