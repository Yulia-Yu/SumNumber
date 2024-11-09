package ru.yuliayu.test.main;


import ru.yuliayu.test.util.Translate;



public class Main {
    public static void main(String[] arg){
        long num = 999999999999L;
        String sGender = "М";
        String sCase = "Им";
        System.out.println(Translate.sumProp(num, sGender, sCase));
    }
}
