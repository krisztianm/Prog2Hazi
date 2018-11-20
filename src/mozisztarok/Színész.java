
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tiba
 */
public class Színész implements Comparable<Színész> {

    private String név;
    private List<Film> filmek;

    public Színész(String név) {
        this.név = név;
        this.filmek = new ArrayList<>();
    }

    public String getNév() {
        return név;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public List<Film> getFilmek() {
        return filmek;
    }

    public void setFilmek(List<Film> filmek) {
        this.filmek = filmek;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.név);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Színész)) {
            return false;
        }
        Színész sz = (Színész) obj;
        return this.név.equals(sz.getNév());
    }

    @Override
    public int compareTo(Színész o) {

        if (this.filmek.size() == o.getFilmek().size()) {
            return this.név.compareTo(o.getNév());
        } else {
            return (-1) * Integer.compare(this.filmek.size(), o.getFilmek().size());
        }

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.név).append(":\n");
        Collections.sort(filmek);
        for (int i = 0; i < filmek.size(); i++) {
            if (i == filmek.size() - 1) {
                sb.append(filmek.get(i));
            } else {
                sb.append(filmek.get(i)).append("\n");
            }
        }
        return sb.toString();
    }

}
