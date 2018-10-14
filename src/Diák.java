/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Krisztian
 */
public class Diák {
    private String név;
    private String előzőnév;

    public Diák(String név, String előzőnév) {
        this.név = név;
        this.előzőnév = előzőnév;
    }

    public String getNév() {
        return név;
    }

    public String getElőzőnév() {
        return előzőnév;
    }

    @Override
    public String toString() {
        return "Diák: " + "neve: " + név + ", előző diák neve: " + előzőnév;
    }
    
    
}
