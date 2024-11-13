package ru.yuliayu.test.util;

import java.util.ArrayList;

public class NumberComposition {
    private ArrayList<Long> composition = new ArrayList<Long>();

    public ArrayList<Long> getComposition() {
        return composition;
    }

    public void setComposition(ArrayList<Long> composition) {
        this.composition = composition;
    }

    public void numberComposition(long num) {
        int length = (int) String.valueOf(num).length();
        while (length > 0) {
            long a = (long) (num / Math.pow(10, length - 1));
            long b = (long) (a * Math.pow(10, length - 1));
            if ((length == 8 || length == 5 || length == 2) && a == 1) {
                composition.add(0L);
                num = (long) (num % Math.pow(10, length - 1));
                a = (long) (num / Math.pow(10, length - 2));
                b += a;
                length--;
            }
            composition.add(b);
            num = (long) (num % Math.pow(10, length - 1));
            length--;
        }
    }
}
