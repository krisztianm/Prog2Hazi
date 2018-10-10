/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Krisztian
 */
public class Test {

    public static void rendezMaxSzállíthatóTeherCsökkenőleg(Teherautó[] teher){
        for (int i=0;i<teher.length-1;i++){
            for (int j=i+1;j<teher.length;j++){
                if (teher[i].getMaxSzállíthatóTeher()<teher[j].getMaxSzállíthatóTeher()){
                    Teherautó temp = teher[i];
                    teher[i] = teher[j];
                    teher[j] = temp;
                }
            }
        }
    }
    
    public static Autó keresMaxMotorTeljesítmény(Autó[] auto){
        int maxTelj = 0;
        Autó maxTeljAutó = null;
        
        for (int i=0; i<auto.length;i++){
            if (auto[i].getMotorTeljesítmény() > maxTelj){
                maxTelj = auto[i].getMotorTeljesítmény();
                maxTeljAutó = auto[i];
            }
        }
        
        return maxTeljAutó;
    }
    
    public static void kiír(Autó[] a){
        for (int i=0; i< a.length;i++){
            System.out.println(a[i]);
        }
    }
    
    public static void main(String[] args) {

        Autó[] autó = new Autó[]{
            new Teherautó("ASD333", 350, 18000),
            new Teherautó("MMW200", 300, 14000),
            new Teherautó("NOA788", 190, 10000),
            new Teherautó("AUW002", 250, 10000),
            new Teherautó("LOO903", 650, 23000),
            new Autó("KLA018", 116),
            new Autó("VZR516", 116),
            new Autó("MNO540", 90),
            new Autó("HGB025", 140),
            new Autó("RAW103", 670),
        };

        Teherautó[] teherautó = new Teherautó[]{
            new Teherautó("DOO444", 750, 27000),
            new Teherautó("MAI870", 500, 21500),
            new Teherautó("MUU550", 450, 19950),
            new Teherautó("HEY444", 450, 17000),
            new Teherautó("NIY698", 400, 15000),
            new Teherautó("NOP012", 650, 22000),
            new Teherautó("RAA203", 500, 20000),
            new Teherautó("NIE222", 395, 13000),
            new Teherautó("LLA762", 290, 11000),
            new Teherautó("NIE300", 220, 10000),
        };
        
        rendezMaxSzállíthatóTeherCsökkenőleg(teherautó);
        
        kiír(teherautó);
        
        System.out.println(keresMaxMotorTeljesítmény(autó));
    }

}
