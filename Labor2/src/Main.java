/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hallgato
 */
public class Main {
    
    public static void main(String[] args) {
        
        //1. feladat Rectangle.java
        
        Rectangle defRect = new Rectangle();    //default konstruktor = nem kap parametereket
        Rectangle newRect = new Rectangle(2, 3.5);    // nem default, kap parametereket
        
        System.out.println(defRect);
        System.out.println(newRect);
        System.out.println("A teglalap terulete = " + newRect.getArea());
        System.out.println("A teglalap kerulete = " + newRect.getPerimeter());
        System.out.println(newRect.getHeight());
        newRect.setHeight(7);
        System.out.println(newRect.getHeight());       
        
        //2. feladat QEquation.java
        
        QEquation first = new QEquation(1, 2, 3);
        QEquation second = new QEquation(2, 4, 1);
        
        System.out.println(first);
        System.out.println(second);
        System.out.println("First root of first equation " + first.getRoot1());
        System.out.println("Second root of first equation " + first.getRoot2());
        System.out.println("First root of second equation " + second.getRoot1());
        System.out.println("Second root of second equation " + second.getRoot2());
        
        //3. feladat Account.java
        
        //Account ac;
        System.out.println(Account.getAnnualIR()); //osztályszintű változó, nincs példányosítva mégis létezik ez a változó
        
    }
    
}
