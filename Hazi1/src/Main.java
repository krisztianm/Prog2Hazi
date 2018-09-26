/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Krisztian
 */
public class Main {
    
    public static void main(String[] args) {
        
        // 1. feladat
        System.out.println("1. feladat");
        Pont elso = new Pont(2.1, 5.3);
        Pont masodik = new Pont(0.8, 1.5);
        Pont harmadik = new Pont(3.3, 3.0);
        Pont negyedik = new Pont(2.0, 4.6);
        
        elso.setY(elso.getY()+5);
        masodik.setY(masodik.getY()+5);
        
        harmadik.setX(harmadik.getX()-3.4);
        negyedik.setX(negyedik.getX()-3.4);
        
        System.out.println("Az első pont koordinátái: x = " + elso.getX() + " y = " + elso.getY());
        System.out.println("A második pont koordinátái: x = " + masodik.getX() + " y = " + masodik.getY());
        System.out.println("A harmadik pont koordinátái: x = " + harmadik.getX() + " y = " + harmadik.getY());
        System.out.println("A negyedik pont koordinátái: x = " + negyedik.getX() + " y = " + negyedik.getY());
        
        //2. feladat -> Teszt.java
        
        //3. feladat
        System.out.println("\n3. feladat");
        Rectangle firstRect = new Rectangle(4, 40);
        Rectangle secondRect = new Rectangle(3.5, 35.9);
        
        System.out.println(firstRect.width);
        System.out.println(firstRect.height);
        System.out.println(firstRect.getArea());
        System.out.println(firstRect.getPerimeter());
        System.out.println(secondRect.width);
        System.out.println(secondRect.height);
        System.out.println(secondRect.getArea());
        System.out.println(secondRect.getPerimeter());
        
        //4. feladat
        System.out.println("\n4. feladat");
        Ital firstItal = new Ital("Canada Dry", "500 ml");
        Ital secondItal = new Ital("Fanta Málna", "1.75L");
        Ital thirdItal = new Ital("Canada Dry", "500 ml");
        
        System.out.println(firstItal);
        System.out.println("Gyártási dátum: " + firstItal.getGyártásiDátum());
        System.out.println(secondItal);
        System.out.println("Gyártási dátum: " + secondItal.getGyártásiDátum());
        System.out.println(thirdItal);
        System.out.println("Gyártási dátum: " + thirdItal.getGyártásiDátum());
        
        Ital.setÁr(1000);
        
        System.out.println("Ár Euróban: " + Ital.getÁrEuróban());
        
        System.out.println(firstItal.equals(thirdItal));
        System.out.println(firstItal.equals(secondItal));
        System.out.println(secondItal.equals(thirdItal));
        
        //5. feladat -> Test.java
        
        //6. feladat
        System.out.println("\n6. feladat");
        LinearEquation firstEq = new LinearEquation(3, 4, 1, -2, 20, 5);
        LinearEquation secondEq = new LinearEquation(0, 2, 0, 1, 3, 3);
        LinearEquation thirdEq = new LinearEquation(5, 2, 3, 3, 14, 16);
        
        System.out.println(firstEq.getX());
        System.out.println(firstEq.getY());
        System.out.println(secondEq.getX());
        System.out.println(secondEq.getY());
        System.out.println(thirdEq.getX());
        System.out.println(thirdEq.getY());
        
        if(!firstEq.isSolvable()){
            System.out.println("The equation has no solution.");
        }
        if(!secondEq.isSolvable()){
            System.out.println("The equation has no solution.");
        }
        if(!thirdEq.isSolvable()){
            System.out.println("The equation has no solution.");
        }
        
    }
    
}
