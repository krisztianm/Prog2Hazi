
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Krisztian
 */
public class Autó {

    private String rendszám;
    private int motorTeljesítmény;
    private Date gyártásDátuma;

    public Autó(String rendszám, int motorTeljesítmény) {
        this.rendszám = rendszám;
        this.motorTeljesítmény = motorTeljesítmény;
        this.gyártásDátuma = new Date();
    }

    public String getRendszám() {
        return rendszám;
    }

    public int getMotorTeljesítmény() {
        return motorTeljesítmény;
    }

    public Date getGyártásDátuma() {
        return gyártásDátuma;
    }

    public void setRendszám(String rendszám) {
        this.rendszám = rendszám;
    }

    @Override
    public String toString() {
        return "Autó: " + "rendszám=" + rendszám + "\tmotorTeljesítmény: " + motorTeljesítmény + "\tgyártásDátuma: " + gyártásDátuma;
    }

    public boolean equals(Object obj) {
        if (obj==null || !(obj instanceof Autó)){
            return false;
        }
        
        Autó a = (Autó) obj;
        
        return this.rendszám.equals(a.rendszám) && this.motorTeljesítmény == a.motorTeljesítmény && this.gyártásDátuma == a.gyártásDátuma;
        
    }

}
