package ru.yuliayu.test.main;


import ru.yuliayu.test.util.Translate;



public class Main {
    public static void main(String[] arg){
        int num = 1;
        String sGender = "Ж";
        String sCase = "Р";

        System.out.println(Translate.sumProp(num, sGender, sCase));
    }
}
