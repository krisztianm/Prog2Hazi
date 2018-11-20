/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tizenegyedik_feladat;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Krisztian
 */
public class Egyetem {

    private List<Hallgató> hallgatók;
    private List<Oktató> oktatók;

    public Egyetem() {
        this.hallgatók = new ArrayList<Hallgató>();
        this.oktatók = new ArrayList<Oktató>();
    }

    public List<Hallgató> getHallgatók() {
        return hallgatók;
    }

    public List<Oktató> getOktatók() {
        return oktatók;
    }
    
    public void hozzáadHallgatót(Hallgató h) {
        this.hallgatók.add(h);
    }

    public void törölHallgatót(Hallgató h) {
        this.hallgatók.remove(h);
    }

    public void hozzáadOktatót(Oktató h) {
        this.oktatók.add(h);
    }

    public void törölOktatót(Oktató h) {
        this.oktatók.remove(h);
    }

    public void legfiatalabbHallgatók() {
        if (this.hallgatók.size() < 3) {
            for (int i = 0; i < this.hallgatók.size(); i++) {
                System.out.println(this.hallgatók.get(i));
            }
        } else {
            for (int i = 0; i < this.hallgatók.size() - 1; i++) {
                for (int j = i + 1; j < this.hallgatók.size(); j++) {
                    if (this.hallgatók.get(i).getÉletkor() > this.hallgatók.get(j).getÉletkor()) {
                        Hallgató temp = this.hallgatók.get(i);
                        this.hallgatók.set(i, this.hallgatók.get(j));
                        this.hallgatók.set(j, temp);
                    }
                }
            }
        }
        System.out.println(this.hallgatók.get(0));
        System.out.println(this.hallgatók.get(1));
        System.out.println(this.hallgatók.get(2));
    }

    public void itTanszékNőiOktatók() {
        for (int i = 0; i < this.oktatók.size(); i++) {
            if (this.oktatók.get(i).getTanszék().equals("IT")) {
                this.oktatók.get(i).név = this.oktatók.get(i).getNév().concat("!");
            }
        }
    }

}
