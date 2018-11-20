package elso_feladat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Krisztian
 */
public class Gyumolcsle extends Ital{
    private Gyumolcs gy;

    public Gyumolcsle(Gyumolcs gy) {
        this.gy = gy;
    }
    
    public String mibolFacsartak(){
        return gy.getFajta();
    }
    
    public String mibolKeszult(){
        return gy.getFajta();
    }
    
    public String milyenIzu(){
        return gy.getIz();
    }

    @Override
    public String toString() {
        return this.mibolFacsartak() + "-ból készült gyümölcslé, " + this.milyenIzu() + " ízzel";
    }
    
}
