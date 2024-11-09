package ru.yuliayu.test.etity;

public class Billion {
    public static String billion(int num, String sCase) {
        if (num % 10 == 1 && num % 100 != 11) {
            switch (sCase) {
                case "Им", "В":
                    return "миллиард ";
                case "Р":
                    return "миллиарда ";
                case "Д":
                    return "миллиарду ";
                case "Т":
                    return "миллиардом ";
                case "П":
                    return "миллиарде ";
            }
        } else if (num % 10 > 1 && num % 10 <= 4 && (num % 100 > 20 || num % 100 < 10)) {
            switch (sCase) {
                case "Им", "В":
                    return "миллиарда ";
                case "Р":
                    return "миллиардов ";
                case "Д":
                    return "миллиардам ";
                case "Т":
                    return "миллиардами ";
                case "П":
                    return "миллиардах ";
            }
        } else {
            switch (sCase) {
                case "Им", "В", "Р":
                    return "миллиардов ";
                case "Д":
                    return "миллиардам ";
                case "Т":
                    return "миллиардами ";
                case "П":
                    return "миллиардах ";
            }
        }
        return "";
    }
}
