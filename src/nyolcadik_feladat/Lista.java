/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nyolcadik_feladat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Krisztian
 */
public class Lista implements RealNumbers{
    public List<Double> lst;

    public Lista(List<Double> lst) {
        this.lst = lst;
    }
    
    @Override
    public void add(double num){
        this.lst.add(num);
    }
    
    @Override
    public double get(int idx){
        return this.lst.get(idx);
    }
    
    @Override
    public void delete(int idx){
        this.lst.remove(idx);
    }
    
    @Override
    public boolean contains(double num){
        return this.lst.contains(num);
    }
    
    @Override
    public int getFirstOccurrence(double num){
        return this.lst.indexOf(num);
    }
}
