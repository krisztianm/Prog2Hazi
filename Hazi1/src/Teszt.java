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
    
    public static void main(String[] args) {
        
        RegularPolygon firstPoly = new RegularPolygon();
        RegularPolygon secondPoly = new RegularPolygon(6, 4);
        RegularPolygon thirdPoly = new RegularPolygon(10, 4, 5.6, 7.8);
        
        System.out.println(firstPoly.getPerimeter());
        System.out.println(secondPoly.getPerimeter());
        System.out.println(thirdPoly.getPerimeter());
        
        System.out.println(firstPoly.getArea());
        System.out.println(secondPoly.getArea());
        System.out.println(thirdPoly.getArea());
        
        System.out.println(firstPoly);
        System.out.println(secondPoly);
        System.out.println(thirdPoly);
        
    }
    
}
