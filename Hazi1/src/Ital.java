
import java.util.Date;
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Krisztian
 */
public class Ital {
    protected String név;
    protected String kiszerelés;
    private static int ár = 10;
    protected Date gyártásiDátum;

    public Ital(String név, String kiszerelés) {
        this.név = név;
        this.kiszerelés = kiszerelés;
        this.gyártásiDátum = new Date();
    }

    public String getNév() {
        return this.név;
    }

    public String getKiszerelés() {
        return this.kiszerelés;
    }

    public static int getÁr() {
        return ár;
    }

    public Date getGyártásiDátum() {
        return this.gyártásiDátum;
    }

    public static void setÁr(int ár) {
        Ital.ár = ár;
    }
    
    public static double getÁrEuróban(){
        return ár*0.00308;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Ital))
        {
            return false;
        }
        
        Ital i = (Ital) obj;
        
        return this.név.equals(i.getNév()) && this.kiszerelés.equals(i.getKiszerelés()) && ár == i.ár;
    }

    @Override
    public String toString() {
        return this.név + ", " + this.kiszerelés + ", " + ár + " Ft";
    }
        
}
