/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Krisztian
 */
public class Metódusok {
    
    //1. feladat
    public static void novekvoSorrend(double a, double b, double c){
        if (a>b && a>c){
            if (b>c){
                System.out.println(c + " " + b + " " + " " + a);
            } else {
                System.out.println(b + " " + c + " " + " " + a);
            } 
        } else if (b>a && b>c){
            if (a>c){
                System.out.println(c + " " + a + " " + " " + b);
            } else {
                System.out.println(a + " " + c + " " + " " + b);
            }
        } else {
            if (b>a){
                System.out.println(a + " " + b + " " + " " + c);
            } else {
                System.out.println(b + " " + a + " " + " " + c);
            }
        }
        
    }
    
    
    
    //2. feladat
    public static void minimumMaximum(double a, double b, double c){
        double min = a;
        double max = Math.sqrt(Math.pow(a, 2));
        double absB = Math.sqrt(Math.pow(b, 2));
        double absC = Math.sqrt(Math.pow(c, 2));
        
        if (min>=b){
            min=b;
        } 
        if (min>=c){
            min=c;
        }
        
        if (max<=absB){
            max=absB;
        } 
        if (max<=absC){
            max=absC;
        }
        System.out.println("A 3 szám minimuma: " + min);
        System.out.println("A 3 szám abszolút értékének maximuma: " + max);
        
    }
    
    
    
    //3. feladat
    public static void sorrend(double a, double b, double c, double d){
        
        System.out.println(a + " " + b + " " + c + " " + d);
        
        if (d>=0){
            System.out.println(a + " " + c + " " + b + " " + d);
        } else {
            System.out.println(a + " " + b + " " + d + " " + c);
        }
    }
    
    
    
    //4. feladat
    public static boolean haromszog(double a, double b, double c){
        if (a<b+c && (b<a+c && c<a+b)){
            return true;
        } else {
            return false;
        }
    }
    
    
    
    //5. feladat
    public static int szokoev(int kezdo, int zaro){
        int szokoevSum=0;
        for(int i=kezdo;i<=zaro;i++){       //ha az első évszámot és a másodikat is az intervallumba vesszük
            if (i%4==0 && (i%100!=0 || i%400==0)){
                szokoevSum++;
            }
        }
        
        return szokoevSum;
    }
    
    
    
    //6. feladat
    public static void osztalyzat(int n){
        switch(n){
                case 1: System.out.println("Elégtelen");
                        break;
                case 2: System.out.println("Elégséges");
                        break;
                case 3: System.out.println("Közepes");
                        break;
                case 4: System.out.println("Jó");
                        break;
                case 5: System.out.println("Kiváló");
                        break;
                default: System.out.println("Érvénytelen osztályzat");
                        break;
        }
    }
    
    
    
    //7. feladat
    public static int Osztás(int a, int b){
        int hányados = 0;
        while (a>=b){
            hányados++;
            a-=b;
        }
        
        return hányados;
    }
    
    
    
    //8. feladat
    public static boolean Prím_1(int n){
        int osztók_száma = 0;
        boolean válasz;
        
        for (int osztó=1;osztó<=n;osztó++){
            if (n%osztó==0){
                osztók_száma++;
            }
        }
        
        if (osztók_száma==2){
            válasz = true;
        } else {
            válasz = false;
        }
        
        return válasz;
    }
    
    public static boolean Prím_2(int n){
        boolean válasz = true;
        for (int osztó=2;osztó<=Math.sqrt(n);osztó++){
            if (n%osztó==0){
                válasz=false;
            }
        }
        
        return válasz;
    }
    
    
    
    //9. feladat
    public static void Fibonacci(int n){
        int a=0;
        int b=1;
        int c, k;
        
        if(n==1){
            System.out.println(a);
        } else if(n==2) {
            System.out.println(a + "\n" + b);
        } else {
            c=a+b;
            System.out.println(a + "\n" + b + "\n" + c);
            k=3;
            while (k<n){
                a=b;
                b=c;
                c=a+b;
                System.out.println(c);
                k++;
            }
        }
    }
    
    public static void Fibonacci2(int n){
        int a=1;
        int b=0;
        
        for(int k=1;k<=n;k++){
            System.out.println(b);
            b+=a;
            a=b-a;
        }
    }
    
    
    
    //10. feladat
    public static int Fordított_szám(int n){
        int újszám=0;
        while (n!=0){
            újszám=újszám*10 + n%10;
            n/=10;
        }
        
        return újszám;
    }
    
    
    
    //11. feladat
    public static long faktoriális(int n){
        long fakt=1;
        while (n>0){
            fakt*=n;
            n--;
        }
        
        return fakt;
    }
    
    
    
    //12. feladat
    public static void oszthatoK(int n1, int n2, int k){
        int temp;
        
        if (n1<=n2){
            for (int i=n1; i<=n2;i++){
                if(i%k==0){
                    System.out.println(i);
                }
            }
        } else {
            temp=n2;
            n2=n1;
            n1=temp;
            for (int i=n1; i<=n2;i++){
                if(i%k==0){
                    System.out.println(i);
                }
            }
        }
    }
    
    
    
    //13. feladat
    public static int legkisebbFibo(int n){
        int a=1;
        int b=0;
        
        for(int i=1;i<Integer.MAX_VALUE;i++){
            if (b>n){
                break;
            }
            b+=a;
            a=b-a;
        }
        
        return b;
    }
    
    
    
    //14. feladat
    public static void szjegyekKobe(){
        double n;
        for (int i=999;i>=0;i--){
            n=(Math.pow(i/100, 3) + Math.pow((i/10)%10, 3) + Math.pow(i%10, 3));
            if (i==n){
                System.out.println(i);
            }
        }
    }
    
    
    
    public static void main(String[] args) {
        System.out.println("1. feladat:");
        novekvoSorrend(-5, 20, -10);
        
        System.out.println("\n2. feladat:");
        minimumMaximum(17, -19.3, 19.2);
        
        System.out.println("\n3. feladat:");
        sorrend(1,2,3,-4);
        
        System.out.println("\n4. feladat:");
        System.out.println("A háromszög szerkeszthető-e: " + haromszog(2, 2, 3) );
        
        System.out.println("\n5. feladat:");
        System.out.println("Szökőévek száma: " + szokoev(1997, 2018));
        
        System.out.println("\n6. feladat:");
        osztalyzat(5);
        
        System.out.println("\n7. feladat:");
        System.out.println("431 és 3 hányadosa: " + Osztás(431, 3));
        
        System.out.println("\n8. feladat:");
        System.out.println("A 11-es prím-e:" + Prím_1(11));
        System.out.println("A 14-es prím-e:" + Prím_2(14));
        
        System.out.println("\n9. feladat:");
        Fibonacci(12);
        Fibonacci2(11);
        
        System.out.println("\n10. feladat:");
        System.out.println("199567 fordítva a következő: " + Fordított_szám(199567));
        
        System.out.println("\n11. feladat:");
        System.out.println(faktoriális(12));
        
        System.out.println("\n12. feladat:");
        oszthatoK(16,10,3);
        
        System.out.println("\n13. feladat:");
        System.out.println(legkisebbFibo(300000));
        
        System.out.println("\n14. feladat:");
        szjegyekKobe();
    }
}
