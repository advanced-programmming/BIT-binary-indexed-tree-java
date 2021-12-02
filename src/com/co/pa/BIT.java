package com.co.pa;

import java.util.Vector;

public interface BIT {
    void builder(Vector collection);
    int lowBit(int index);
    void update(int index, Object value);
    boolean query(int index);
    boolean query(int indexX, int indexY);
}
