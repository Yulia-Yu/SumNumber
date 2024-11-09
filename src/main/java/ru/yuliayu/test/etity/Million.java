package ru.yuliayu.test.etity;

public class Million {
    public static String million(int num, String sCase){
        if(num % 10 == 1 && num % 100 != 11){
            switch (sCase) {
                case "Им", "В":
                    return "миллион ";
                case "Р":
                    return "миллиона ";
                case "Д":
                    return "миллиону ";
                case "Т":
                    return "миллионом ";
                case "П":
                    return "миллионе ";
            }
        } else if(num % 10 > 1 && num % 10 <= 4 && (num % 100 > 20 || num % 100 < 10)){
            switch (sCase) {
                case "Им", "В":
                    return "миллиона ";
                case "Р":
                    return "миллионов ";
                case "Д":
                    return "миллионам ";
                case "Т":
                    return "миллионами ";
                case "П":
                    return "миллионах ";
            }
        } else{
            switch (sCase) {
                case "Им", "В", "Р":
                    return "миллионов ";
                case "Д":
                    return "миллионам ";
                case "Т":
                    return "миллионами ";
                case "П":
                    return "миллионах ";
            }
        }
        return "";
    }
}
