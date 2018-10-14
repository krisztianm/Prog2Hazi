/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Krisztian
 */
public class TelepulesHomerseklet {
    private String város;
    private int hőmérséklet;

    public TelepulesHomerseklet(String város, int hőmérséklet) {
        this.város = város;
        this.hőmérséklet = hőmérséklet;
    }

    public String getVáros() {
        return város;
    }

    public int getHőmérséklet() {
        return hőmérséklet;
    }

    @Override
    public String toString() {
        return város + " (" + hőmérséklet + ")";
    }
    
    
}
