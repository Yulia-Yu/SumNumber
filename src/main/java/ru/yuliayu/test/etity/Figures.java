package ru.yuliayu.test.etity;


public class Figures {
    public static String one(String sGender, String sCase) {
        if (sGender.equals("М") && (sCase.equals("Им") || sCase.equals("В"))) {
            return "один";
        } else if (sCase.equals("Р") && (sGender.equals("С") || sGender.equals("М"))) {
            return "одного";
        } else if (sCase.equals("Д") && (sGender.equals("С") || sGender.equals("М"))) {
            return "одному";
        } else if (sCase.equals("Т") && (sGender.equals("С") || sGender.equals("М"))) {
            return "одним";
        } else if (sCase.equals("П") && (sGender.equals("С") || sGender.equals("М"))) {
            return "одном";
        } else if (sGender.equals("С") && (sCase.equals("Им") || sCase.equals("В"))) {
            return "одно";
        } else if (sGender.equals("Ж") && sCase.equals("Им")) {
            return "одна";
        } else if (sGender.equals("Ж") && sCase.equals("В")) {
            return "одну";
        } else if (sGender.equals("Ж") && (sCase.equals("Р") || sCase.equals("Д") || sCase.equals("Т") || sCase.equals("П"))) {
            return "одной";
        }
        return "";
    }

    public static String two(String sGender, String sCase) {
        if ((sGender.equals("М") || sGender.equals("С")) && (sCase.equals("Им") || sCase.equals("В"))) {
            return "два";
        } else if (sCase.equals("Р") || sCase.equals("П")) {
            return "двух";
        } else if (sCase.equals("Д")) {
            return "двум";
        } else if (sCase.equals("Т")) {
            return "двумя";
        } else if (sGender.equals("Ж") && (sCase.equals("Им") || sCase.equals("В"))) return "две";
        return "";
    }

    public static String three(String sGender, String sCase) {
        if (sCase.equals("Им") || sCase.equals("В")) {
            return "три";
        } else if (sCase.equals("Р") || sCase.equals("П")) {
            return "трех";
        } else if (sCase.equals("Д")) {
            return "трем";
        } else if (sCase.equals("Т")) return "тремя";
        return "";
    }

    public static String four(String sGender, String sCase) {
        if (sCase.equals("Им") || sCase.equals("В")) {
            return "четыре";
        } else if (sCase.equals("Р") || sCase.equals("П")) {
            return "четырех";
        } else if (sCase.equals("Д")) {
            return "четырем";
        } else if (sCase.equals("Т")) return "четырьмя";
        return "";
    }

    public static String five(String sGender, String sCase) {
        if (sCase.equals("Им") || sCase.equals("В")) {
            return "пять";
        } else if (sCase.equals("Р") || sCase.equals("П") || sCase.equals("Д")) {
            return "пяти";
        } else if (sCase.equals("Т")) return "пятью";
        return "";
    }

    public static String six(String sGender, String sCase) {
        if (sCase.equals("Им") || sCase.equals("В")) {
            return "шесть";
        } else if (sCase.equals("Р") || sCase.equals("П") || sCase.equals("Д")) {
            return "шести";
        } else if (sCase.equals("Т")) return "шестью";
        return "";
    }

    public static String seven(String sGender, String sCase) {
        if (sCase.equals("Им") || sCase.equals("В")) {
            return "семь";
        } else if (sCase.equals("Р") || sCase.equals("П") || sCase.equals("Д")) {
            return "семи";
        } else if (sCase.equals("Т")) return "семью";
        return "";
    }

    public static String eight(String sGender, String sCase) {
        if (sCase.equals("Им") || sCase.equals("В")) {
            return "восемь";
        } else if (sCase.equals("Р") || sCase.equals("П") || sCase.equals("Д")) {
            return "восьми";
        } else if (sCase.equals("Т")) return "восьмью";
        return "";
    }

    public static String nine(String sGender, String sCase) {
        if (sCase.equals("Им") || sCase.equals("В")) {
            return "девять";
        } else if (sCase.equals("Р") || sCase.equals("П") || sCase.equals("Д")) {
            return "девяти";
        } else if (sCase.equals("Т")) return "девятью";
        return "";
    }
}
