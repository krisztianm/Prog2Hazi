/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hallgato
 */
public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double getA(){
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }
    
    public double getDiscriminant(){
        return Math.pow(this.b, 2) - 4*this.a*this.c;
    }    
    
    public double getRoot1(){
        if (this.getDiscriminant()>=0){
            return (-this.b + Math.sqrt(getDiscriminant()))/(2*this.a);
        }
        else return 0;
    }
    public double getRoot2(){
        if (this.getDiscriminant()>=0){
            return (-this.b - Math.sqrt(getDiscriminant()))/(2*this.a);
        }
        else return 0;
    }

    @Override
    public String toString() {
        return "The equation is: " + a + "x^2 + " + b + "x + " + c + " = 0";
    }
    
    
    
}
