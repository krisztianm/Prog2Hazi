/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Krisztian
 */
public class RegularPolygon {
    
    private int n = 3;
    private double side = 1;
    private double x;
    private double y;

    public RegularPolygon() {
        this.n = 3;
        this.side = 1;
        this.x = 0;
        this.y = 0;
    }
    
    public RegularPolygon(int n, double side){
        this.n = n;
        this.side = side;
        this.x = 0;
        this.y = 0;
    }    

    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }
    
    public int getN(){
        return this.n;
    }
    
    public double getSide(){
        return this.side;
    }
    
    public double getX(){
        return this.x;
    }
    
    public double getY(){
        return this.y;
    }
    
    public void setN(int n){
        this.n = n;
    }
    
    public void setSide(double side){
        this.side = side;
    }
    
    public void setX(double x){
        this.x = x;
    }
    
    public void setY(double y){
        this.y = y;
    }
    
    public double getPerimeter(){
                
        return getN()*getSide();
    }
    
    public double getArea(){
        int szog = 360/getN()/2;                                            //polygon belsejében this.n db 3szög rajzolható, melyek egyik szöge a "szog" lesz
        double magassag = getSide()/2/Math.tan(Math.toRadians(szog));       //magasságot kiszámítjuk
        
        return magassag*getPerimeter()*1/2;                                      //terület = 1/2 * magassag * kerület
    }

    @Override
    public String toString() {
        return "A poligon " +this.n + " oldalból áll, egy oldal hossza " + this.side + ", középpont koordinátái: x = " + this.x + ", y = " + this.y;
    }
    
    
}
