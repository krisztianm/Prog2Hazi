/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mozisztarok2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Krisztian
 */
public class Film implements Comparable<Film> {

    private String cim;
    private List<Szinesz> szereplok;

    public Film(String cim) {
        this.cim = cim;
        this.szereplok = new ArrayList<Szinesz>();
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }


    public List<Szinesz> getSzereplok() {
        return szereplok;
    }

    public void setSzereplok(List<Szinesz> szereplok) {
        this.szereplok = szereplok;
    }

    @Override
    public String toString() {
        StringBuilder filmAdatok = new StringBuilder(this.cim + "\n");
        Collections.sort(szereplok);
        for (int i = 0; i < szereplok.size(); i++) {
            if (i == szereplok.size() - 1) {
                filmAdatok.append(szereplok.get(i));
            } else {
                filmAdatok.append(szereplok.get(i) + "\n");
            }
        }
        return filmAdatok.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || !(o instanceof Film)) {
            return false;
        }

        Film f = (Film) o;
        return this.cim.equals(f.getCim());
    }

    @Override
    public int compareTo(Film t) {
        if (this.szereplok.size() == t.getSzereplok().size()){
            return this.cim.compareTo(t.getCim());
        } else {
            return -1 * (Integer.compare(this.szereplok.size(), t.getSzereplok().size()));
        }
    }

}
