/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tiba
 */
public class Film implements Comparable<Film> {

    private String cím;
    private int megjelenésÉve;

    public Film(String cím, int megjelenésÉve) {
        this.cím = cím;
        this.megjelenésÉve = megjelenésÉve;
    }

    public String getCím() {
        return cím;
    }

    public void setCím(String cím) {
        this.cím = cím;
    }

    public int getMegjelenésÉve() {
        return megjelenésÉve;
    }

    public void setMegjelenésÉve(int megjelenésÉve) {
        this.megjelenésÉve = megjelenésÉve;
    }

    @Override
    public int compareTo(Film o) {

        if (this.megjelenésÉve == o.getMegjelenésÉve()) {
            return this.cím.compareTo(o.getCím());

        } else {
            return Integer.compare(this.megjelenésÉve, o.getMegjelenésÉve());
        }

    }

    @Override
    public String toString() {
        return this.megjelenésÉve + ": " + this.cím;
    }

}
