package ru.yuliayu.test.etity;

public class Thousand {
    public static String thousand(int num, String sCase){
        if(num % 10 == 1 && num % 100 != 11){
            switch (sCase) {
                case "Им":
                    return "тысяча ";
                case "Р":
                    return "тысячи ";
                case "Д", "П":
                    return "тысяче ";
                case "В":
                    return "тысячу ";
                case "Т":
                    return "тысячей ";
            }
        } else if(num % 10 > 1 && num % 10 <= 4 && (num % 100 > 20 || num % 100 < 10)){
            switch (sCase) {
                case "Им", "В":
                    return "тысячи ";
                case "Р":
                    return "тысяч ";
                case "Д":
                    return "тысячам ";
                case "Т":
                    return "тысячами ";
                case "П":
                    return "тысячях ";
            }
        } else{
            switch (sCase) {
                case "Им", "В", "Р":
                    return "тысяч ";
                case "Д":
                    return "тысячам ";
                case "Т":
                    return "тысячами ";
                case "П":
                    return "тысячях ";
            }
        }
        return "";
    }
}
