package com.co.pa;

import java.util.Vector;

public class BITImpl implements BIT{

    private Vector<Integer> arr;
    private Vector<Integer> arrOrigin;

    public BITImpl(Vector array){
        this.arr = array;
        builder(array);
    }

    @Override
    public void builder(Vector array) {
        arrOrigin = array;
        for(int i = 0; i < array.size(); i++)
            update((i + 1), array.get(i));
    }

    @Override
    public int lowBit(int index) {
        return (index & -index);
    }

    @Override
    public boolean update(int index, Object value) {
        for(int i = index; index < arr.size(); index+= lowBit(index))
            this.arr.set(index, arr.get(index) + java.lang.Integer.valueOf((int)value));
        return true;
    }

    @Override
    public int query(int index) {
        int result = 0;
        for(int i = index; i > 0; i -= lowBit(index)) result += arr.get(index);
        return result;
    }

    @Override
    public int query(int indexX, int indexY) {
        return query(indexY) + query(indexX - 1);
    }

    @Override
    public void printBITArray(){
        System.out.println(arr.toString());
    }

    @Override
    public void printOrigin(){
        System.out.printf(arrOrigin.toString());
    }
}
