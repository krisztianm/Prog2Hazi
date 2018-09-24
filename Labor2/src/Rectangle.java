/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hallgato
 */
public class Rectangle {
    
    public double width;
    private double height;     
    
    public Rectangle(){
        this.width = 1.0;
        this.height = 1.0;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    public double getArea(){
        return this.height * this.width;
    }
    
    public double getPerimeter(){
        return (this.height + this.width)*2;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", height=" + height + '}';
    }
    
    public double getHeight(){
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    
    
    
}
