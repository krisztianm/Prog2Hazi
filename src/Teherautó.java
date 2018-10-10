/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Krisztian
 */
public class Teherautó extends Autó{
    private int maxSzállíthatóTeher;

    public Teherautó(String rendszám, int motorTeljesítmény, int maxSzállíthatóTeher) {
        super(rendszám, motorTeljesítmény);
        this.maxSzállíthatóTeher = maxSzállíthatóTeher;
    }

    public int getMaxSzállíthatóTeher() {
        return maxSzállíthatóTeher;
    }

    @Override
    public String toString() {
        return "Teherautó: " + "forgalmi rendszám: " + this.getRendszám() + "\tmaxSzállíthatóTeher=" + maxSzállíthatóTeher;
    }
    
    public boolean equals(Object obj){
        if (obj==null || !(obj instanceof Teherautó)){
            return false;
        }
        
        Teherautó ta = (Teherautó) obj;
        
        return this.getRendszám().equals(ta.getRendszám()) && this.getMotorTeljesítmény() == ta.getMotorTeljesítmény() && this.maxSzállíthatóTeher == ta.maxSzállíthatóTeher;
        
    }
}
