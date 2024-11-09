package ru.yuliayu.test.util;

import java.util.ArrayList;
import java.util.Arrays;

public class NumberComposition {
    private ArrayList<Integer> composition = new ArrayList<Integer>();

    public ArrayList<Integer> getComposition() {
        return composition;
    }

    public void setComposition(ArrayList<Integer> composition) {
        this.composition = composition;
    }

    public void numberComposition(int num){
        int length = String.valueOf(num).length();
        for(int i = length; i > 0; i--){
            int a = (int) (num / Math.pow(10, i - 1));
            int b = (int) (a * Math.pow(10, i - 1));
            composition.add(b);
            num = (int) (num % Math.pow(10, i - 1));
        }
    }
}
