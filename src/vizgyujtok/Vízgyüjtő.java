
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tiba
 */
public class Vízgyüjtő {
 
    private String név;
    private List<String> beleFolynak; // Azok a vizgyűjtők, amelyek ebbe a vízgyűjtőbe közvetlenül belefolynak

    public Vízgyüjtő(String név) {
        this.név = név;
        this.beleFolynak= new ArrayList<>();
    }

    public String getNév() {
        return név;
    }

    public List<String> getBeleFolynak() {
        return beleFolynak;
    }

   

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    
    // Szükség van rá a lista contains, indexOf metódusa miatt
    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Vízgyüjtő)) 
            return false;
        
        Vízgyüjtő vz= (Vízgyüjtő)obj;
        return this.név.equals(vz.getNév());
        
       
    }

    @Override
    public String toString() {
        return "V\u00edzgy\u00fcjt\u0151{" + "n\u00e9v=" + név + ", v=" +  this.beleFolynak.toString() + '}';
    }

    
    
    
    
}
