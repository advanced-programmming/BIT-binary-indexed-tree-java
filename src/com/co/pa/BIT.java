package com.co.pa;

import java.util.Vector;

public interface BIT {
    void builder(Vector collection);
    int lowBit(int index);
    boolean update(int index, Object value);
    int query(int index);
    int query(int indexX, int indexY);
    void printBITArray();
    void printOrigin();
}
