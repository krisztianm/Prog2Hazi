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
public class Aszu extends Bor{
    private int puttonySzam;

    public Aszu(int p, String t, double a) {
        super("", t, "", a);
        this.puttonySzam = p;
    }

    public int hanyPuttonyos() {
        return puttonySzam;
    }

    @Override
    public String toString() {
        return puttonySzam + " puttonyos aszu " + holTermett() + " termoteruletrol";
    }
    
}
