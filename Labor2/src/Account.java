
import java.util.Date; //dátum használatához importáljuk

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hallgato
 */
public class Account {
    
    private int id;
    private double balance;
    private static double annualIR = 10; //static, osztályszintű változókat (metódusokat) 
                                        //jelölünk így; akkor is elérhetőek ha nincs 
                                        //példányosítva (nem kötődik adott példányhoz)
    private Date dateCreated;

    public static double getAnnualIR() {
        return annualIR;
    }
    
    
    
}
