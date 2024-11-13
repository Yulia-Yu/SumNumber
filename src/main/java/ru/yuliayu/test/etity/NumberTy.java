package ru.yuliayu.test.etity;

public class NumberTy {
    public static String twenty(String sGender, String sCase) {
        if (sCase.equals("Им") || sCase.equals("В")) {
            return "двадцать";
        } else if (sCase.equals("Р") || sCase.equals("П") || sCase.equals("Д")) {
            return "двадцати";
        } else if (sCase.equals("Т")) return "двадцатью";
        return "";
    }

    public static String thirty(String sGender, String sCase) {
        if (sCase.equals("Им") || sCase.equals("В")) {
            return "тридцать";
        } else if (sCase.equals("Р") || sCase.equals("П") || sCase.equals("Д")) {
            return "тридцати";
        } else if (sCase.equals("Т")) return "тридцатью";
        return "";
    }

    public static String forty(String sGender, String sCase) {
        if (sCase.equals("Им") || sCase.equals("В")) {
            return "сорок";
        } else if (sCase.equals("Р") || sCase.equals("П") || sCase.equals("Д") || sCase.equals("Т")) {
            return "сорока";
        }
        return "";
    }

    public static String fifty(String sGender, String sCase) {
        if (sCase.equals("Им") || sCase.equals("В")) {
            return "пятьдесят";
        } else if (sCase.equals("Р") || sCase.equals("П") || sCase.equals("Д")) {
            return "пятидесяти";
        } else if (sCase.equals("Т")) return "пятьюдесятью";
        return "";
    }

    public static String sixty(String sGender, String sCase) {
        if (sCase.equals("Им") || sCase.equals("В")) {
            return "шестьдесят";
        } else if (sCase.equals("Р") || sCase.equals("П") || sCase.equals("Д")) {
            return "шестидесяти";
        } else if (sCase.equals("Т")) return "шестьюдесятью";
        return "";
    }

    public static String seventy(String sGender, String sCase) {
        if (sCase.equals("Им") || sCase.equals("В")) {
            return "семьдесят";
        } else if (sCase.equals("Р") || sCase.equals("П") || sCase.equals("Д")) {
            return "семидесяти";
        } else if (sCase.equals("Т")) return "семьюдесятью";
        return "";
    }

    public static String eighty(String sGender, String sCase) {
        if (sCase.equals("Им") || sCase.equals("В")) {
            return "восемьдесят";
        } else if (sCase.equals("Р") || sCase.equals("П") || sCase.equals("Д")) {
            return "восьмидесяти";
        } else if (sCase.equals("Т")) return "восьмьюдесятью";
        return "";
    }

    public static String ninety(String sGender, String sCase) {
        if (sCase.equals("Им") || sCase.equals("В")) {
            return "девяносто";
        } else if (sCase.equals("Р") || sCase.equals("П") || sCase.equals("Д") || sCase.equals("Т")) {
            return "девяноста";
        }
        return "";
    }
}
