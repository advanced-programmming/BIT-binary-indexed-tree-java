package com.co.pa;

import java.util.Vector;

public class BITImpl implements BIT{

    private Vector<Integer> arr;

    public BITImpl(Vector array){
        this.arr = array;
        builder(array);
    }

    @Override
    public void builder(Vector array) {
        for(int i = 0; i < array.size(); i++)
            update((i + 1), array.get(i));
    }

    @Override
    public int lowBit(int index) {
        return (index & -index);
    }

    @Override
    public void update(int index, Object value) {
        for(int i = index; i < arr.size(); index+= lowBit(index))
            this.arr.set(i, arr.get(i) + java.lang.Integer.valueOf((int)value));
    }

    @Override
    public boolean query(int index) {
        return false;
    }

    @Override
    public boolean query(int indexX, int indexY) {
        return false;
    }
}
