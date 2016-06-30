package com.mac.codingtestarrays;

import java.util.ArrayList;
import java.util.List;

public class MergeArrays {

    private List<Integer> result = new ArrayList<Integer>();

    public List<Integer> merge(List<Integer> array1, List<Integer> array2) {
        int i = 0, j = 0;
        while (i < array1.size() || j < array2.size()) {
            if (i >= array1.size()) {
                int y = array2.get(j);
                result.add(y);
                j = getNextIndexForArray(j, y, array2);
            } else if (j >= array2.size()) {
                int x = array1.get(i);
                result.add(x);
                i = getNextIndexForArray(i, x, array1);

            } else {
                int x = array1.get(i);
                int y = array2.get(j);

                if (x < y) {
                    result.add(x);
                    i = getNextIndexForArray(i, x, array1);
                } else if (y < x) {
                    result.add(y);
                    j = getNextIndexForArray(j, y, array2);
                } else {
                    result.add(x);
                    i = getNextIndexForArray(i, x, array1);
                    j = getNextIndexForArray(j, y, array2);

                }
            }

        }
        return result;
    }

    private int getNextIndexForArray(int position, int key, List<Integer> array) {
        while (position < array.size()) {
            if (key == array.get(position)) {
                position++;
            } else {
                break;
            }
        }
        return position;
    }
}
