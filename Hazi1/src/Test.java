/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Krisztian
 */
public class Test {
    public static void main(String[] args) {
        QuadraticEquation first = new QuadraticEquation(2, 4, 2);
        QuadraticEquation second = new QuadraticEquation(1, -2, -4);
        
        System.out.println(first);
        System.out.println(second);
        
        if (first.getDiscriminant()>0){
            System.out.println("The first solution is: " + first.getRoot1());
            System.out.println("The second solution is: " + first.getRoot2());
        } else if (first.getDiscriminant()==0){
            System.out.println("The only solution is: " + first.getRoot1());
        } else {
            System.out.println("The equation has no roots.");
        }
        
        if (second.getDiscriminant()>0){
            System.out.println("The first solution is: " + second.getRoot1());
            System.out.println("The second solution is: " + second.getRoot2());
        } else if (second.getDiscriminant()==0){
            System.out.println("The only solution is: " + second.getRoot1());
        } else {
            System.out.println("The equation has no roots.");
        }
    }
}
