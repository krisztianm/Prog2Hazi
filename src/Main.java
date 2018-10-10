/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Krisztian
 */
public class Main {

    public static boolean isConsecutiveFour(int[] values) {
        boolean is4Cons = false;
        if (values.length < 4) {
            return is4Cons;
        }

        for (int i = 0; i < values.length - 3; i++) {
            if (values[i] == values[i + 1] && values[i] == values[i + 2] && values[i] == values[i + 3]) {
                is4Cons = true;
            }
        }
        
        return is4Cons;
    }

    public static void main(String[] args) {
        int[] v = {1, 1, 2, 2, 9, 9, 9, 7, 7, 7, 7, 0, 0, 3,};
        int[] v2 = {7, 7, 7, 7, 0};
        int[] w = {1};
        int[] x = {1, 1};
        int[] y = {1, 1, 1};
        int[] z = {1, 1, 1, 0};
        int[] z2 = {0, 0, 1, 1, 1, 1};

        System.out.println("Is there 4 consecutive values in the array? " + isConsecutiveFour(v));
        System.out.println("Is there 4 consecutive values in the array? " + isConsecutiveFour(v2));
        System.out.println("Is there 4 consecutive values in the array? " + isConsecutiveFour(w));
        System.out.println("Is there 4 consecutive values in the array? " + isConsecutiveFour(x));
        System.out.println("Is there 4 consecutive values in the array? " + isConsecutiveFour(y));
        System.out.println("Is there 4 consecutive values in the array? " + isConsecutiveFour(z));
        System.out.println("Is there 4 consecutive values in the array? " + isConsecutiveFour(z2));

    }
}
