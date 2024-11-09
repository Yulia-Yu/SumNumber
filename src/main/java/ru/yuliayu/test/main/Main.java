package ru.yuliayu.test.main;


import ru.yuliayu.test.util.Translate;



public class Main {
    public static void main(String[] arg){
        int num = 101;
        String sGender = "М";
        String sCase = "Им";
        System.out.println(Translate.sumProp(num, sGender, sCase));
    }
}
