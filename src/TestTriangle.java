/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Krisztian
 */
public class TestTriangle {
    public static void main(String[] args) {
        
        Triangle triangle = new Triangle(1, 1.5, 1);
        triangle.setFilled(true);
        triangle.setColor("yellow");
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getColor());
        System.out.println(triangle.isFilled());
        
    }
}
