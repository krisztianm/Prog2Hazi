/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Krisztian
 */
public class LinearEquation {
    
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    
    public LinearEquation (int a, int b, int c, int d, int e, int f){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public int getA(){
        return this.a;
    }
    
    public int getB(){
        return this.b;
    }
    
    public int getC(){
        return this.c;
    }
    
    public int getD(){
        return this.d;
    }
    
    public int getE(){
        return this.e;
    }
    
    public int getF(){
        return this.f;
    }
    
    public boolean isSolvable(){
        if (getA()*getD()-getB()*getC() == 0){
            return false;
        } else {
            return true;
        }
    }
    
    public double getX(){
        double x = 0;
        if (this.isSolvable()){
            x = (this.e*this.d-this.b*this.f);
        }
        return x/(this.a*this.d-this.b*this.c);
    }
    
    public double getY(){
        double y = 0;
        if (this.isSolvable()){
            y = (this.a*this.f-this.e*this.c);
        }
        return y/(this.a*this.d-this.b*this.c);
    }
    
    
}
