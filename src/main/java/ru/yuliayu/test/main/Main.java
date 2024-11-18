package ru.yuliayu.test.main;


import ru.yuliayu.test.util.Translate;


public class Main {
    public static void main(String[] arg) {
        // Именительный падеж = "Им", в остальных случаях первая заглавная буква названия падежа. 21017211019
        long num = 21017211019L;
        String sGender = "М";
        String sCase = "Т";
        System.out.println(Translate.sumProp(num, sGender, sCase));
    }
}
