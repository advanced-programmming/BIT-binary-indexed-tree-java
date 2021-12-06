package com.co.pa;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        int[] values = new int[]{2, 3, 5, 3, 2, 7, 2, 9};
        Vector<Integer> vector = AddValues(values);
        BIT bit = new BITImpl(vector);
        int result = bit.query(4, 5);
        boolean update = bit.update(1, 10);
        System.out.println(result);
        System.out.println(update);
        bit.printBITArray();
        bit.printOrigin();
    }

    public static Vector<Integer> AddValues(int[] values){
        Vector<Integer> vector = new Vector<>();
        for(int i = 0; i < values.length; i++) vector.add(values[i]);
        return vector;
    }
}