package ru.yuliayu.test.etity;

public class Hundred {
    public static String oneHundred(String sGender, String sCase) {
        if (sCase.equals("Им") || sCase.equals("В")) {
            return "сто";
        } else if (sCase.equals("Р") || sCase.equals("П") || sCase.equals("Д") || sCase.equals("Т")) {
            return "ста";
        }
        return "";
    }

    public static String twoHundred(String sGender, String sCase) {
        if (sCase.equals("Им") || sCase.equals("В")) {
            return "двести";
        } else if (sCase.equals("Р")) {
            return "двухсот";
        } else if (sCase.equals("Д")) {
            return "двумстам";
        } else if (sCase.equals("Т")) {
            return "двумястами";
        } else if (sCase.equals("П")) return "двухстах";
        return "";
    }

    public static String threeHundred(String sGender, String sCase) {
        if (sCase.equals("Им") || sCase.equals("В")) {
            return "триста";
        } else if (sCase.equals("Р")) {
            return "трёхсот";
        } else if (sCase.equals("Д")) {
            return "трёмстам";
        } else if (sCase.equals("Т")) {
            return "тремястами";
        } else if (sCase.equals("П")) return "трёхстах";
        return "";
    }

    public static String fourHundred(String sGender, String sCase) {
        if (sCase.equals("Им") || sCase.equals("В")) {
            return "четыреста";
        } else if (sCase.equals("Р")) {
            return "четырёхсот";
        } else if (sCase.equals("Д")) {
            return "четырёмстам";
        } else if (sCase.equals("Т")) {
            return "четырьмястами";
        } else if (sCase.equals("П")) return "четырёхстах";
        return "";
    }

    public static String fiveHundred(String sGender, String sCase) {
        if (sCase.equals("Им") || sCase.equals("В")) {
            return "пятьсот";
        } else if (sCase.equals("Р")) {
            return "пятисот";
        } else if (sCase.equals("Д")) {
            return "пятистам";
        } else if (sCase.equals("Т")) {
            return "пятьюстами";
        } else if (sCase.equals("П")) return "пятистах";
        return "";
    }

    public static String sixHundred(String sGender, String sCase) {
        if (sCase.equals("Им") || sCase.equals("В")) {
            return "шестьсот";
        } else if (sCase.equals("Р")) {
            return "шестисот";
        } else if (sCase.equals("Д")) {
            return "шестистам";
        } else if (sCase.equals("Т")) {
            return "шестьюстами";
        } else if (sCase.equals("П")) return "шестистах";
        return "";
    }

    public static String sevenHundred(String sGender, String sCase) {
        if (sCase.equals("Им") || sCase.equals("В")) {
            return "семьсот";
        } else if (sCase.equals("Р")) {
            return "семисот";
        } else if (sCase.equals("Д")) {
            return "семистам";
        } else if (sCase.equals("Т")) {
            return "семьюстами";
        } else if (sCase.equals("П")) return "семистах";
        return "";
    }

    public static String eightHundred(String sGender, String sCase) {
        if (sCase.equals("Им") || sCase.equals("В")) {
            return "восемьсот";
        } else if (sCase.equals("Р")) {
            return "восьмисот";
        } else if (sCase.equals("Д")) {
            return "восьмистам";
        } else if (sCase.equals("Т")) {
            return "восьмьюстами";
        } else if (sCase.equals("П")) return "восьмистах";
        return "";
    }

    public static String nineHundred(String sGender, String sCase) {
        if (sCase.equals("Им") || sCase.equals("В")) {
            return "девятьсот";
        } else if (sCase.equals("Р")) {
            return "девятисот";
        } else if (sCase.equals("Д")) {
            return "девятистам";
        } else if (sCase.equals("Т")) {
            return "девятьюстами";
        } else if (sCase.equals("П")) return "девятистах";
        return "";
    }

}
