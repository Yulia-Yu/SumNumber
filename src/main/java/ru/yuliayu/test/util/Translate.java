package ru.yuliayu.test.util;

public class Translate {
    public static String sumProp(int num, String sGender, String sCase){
        String res = "";
        switch (num){
            case 1:
                res = one(sGender, sCase);
                break;
            case 2:
                res = two(sGender, sCase);
                break;
            case 3:
                res = three(sGender, sCase);
                break;
            case 4:
                res = four(sGender, sCase);
                break;
            case 5:
                res = five(sGender, sCase);
                break;
            case 6:
                res = six(sGender, sCase);
                break;
            case 7:
                res = seven(sGender, sCase);
                break;
            case 8:
                res = eight(sGender, sCase);
                break;
            case 9:
                res = nine(sGender, sCase);
                break;
            case 10:
                res = ten(sGender, sCase);
                break;
            case 11:
                res = eleven(sGender, sCase);
                break;
            case 12:
                res = twelve(sGender, sCase);
                break;
            case 13:
                res = thirteen(sGender, sCase);
                break;
            case 14:
                res = fourteen(sGender, sCase);
                break;
            case 15:
                res = fifteen(sGender, sCase);
                break;
            case 16:
                res = sixteen(sGender, sCase);
                break;
            case 17:
                res = seventeen(sGender, sCase);
                break;
            case 18:
                res = eghteen(sGender, sCase);
                break;
            case 19:
                res = nineteen(sGender, sCase);
                break;
            case 20:
                res = twenty(sGender, sCase);
                break;
            case 30:
                res = thirty(sGender, sCase);
                break;
            case 40:
                res = forty(sGender, sCase);
                break;
            case 50:
                res = fifty(sGender, sCase);
                break;
            case 60:
                res = sixty(sGender, sCase);
                break;
            case 70:
                res = seventeen(sGender, sCase);
                break;
            case 80:
                res = eghteen(sGender, sCase);
                break;
            case 90:
                res = ninety(sGender, sCase);
                break;
            case 100:
                res = oneHundred(sGender, sCase);
                break;
            case 200:
                res = twoHundred(sGender, sCase);
                break;
            case 300:
                res = threeHundred(sGender, sCase);
                break;
        }
        return res;
    }

    private static String one(String sGender, String sCase){
        if(sGender == "M" && (sCase == "Им" || sCase == "В")){
            return "один";
        } else if (sCase == "Р" && (sGender == "С" || sGender == "M" )){
            return "одного";
        } else if (sCase == "Д" && (sGender == "С" || sGender == "M" )){
            return "одному";
        } else if (sCase == "Т" && (sGender == "С" || sGender == "M" )){
            return "одним";
        } else if (sCase == "П" && (sGender == "С" || sGender == "M" )){
            return "одном";
        } else if(sGender == "С" && (sCase == "Им" || sCase == "В")){
            return "одно";
        } else if(sGender == "Ж" && sCase == "Им"){
            return "одна";
        } else if(sGender == "Ж" && sCase == "В"){
            return "одну";
        } else if (sGender == "Ж" && (sCase == "Р" || sCase == "Д" || sCase == "Т" || sCase == "П")){
            return "одной";
        }
        return "";
    }

    private static String two(String sGender, String sCase){
        if((sGender == "M" || sGender == "C") && (sCase == "Им" || sCase == "В")){
            return "два";
        } else if (sCase == "Р" || sCase == "П"){
            return "двух";
        } else if (sCase == "Д"){
            return "двум";
        } else if (sCase == "Т"){
            return "двумя";
        } else if(sGender == "Ж" && (sCase == "Им" || sCase == "В")){
            return "две";
        }
        return "";
    }

    private static String three(String sGender, String sCase){
        if(sCase == "Им" || sCase == "В"){
            return "три";
        } else if (sCase == "Р" || sCase == "П"){
            return "трех";
        } else if (sCase == "Д"){
            return "трем";
        } else if (sCase == "Т"){
            return "тремя";
        }
        return "";
    }

    private static String four(String sGender, String sCase){
        if(sCase == "Им" || sCase == "В"){
            return "четыре";
        } else if (sCase == "Р" || sCase == "П"){
            return "четырех";
        } else if (sCase == "Д"){
            return "четырем";
        } else if (sCase == "Т"){
            return "четырьмя";
        }
        return "";
    }

    private static String five(String sGender, String sCase){
        if(sCase == "Им" || sCase == "В"){
            return "пять";
        } else if (sCase == "Р" || sCase == "П" || sCase == "Д"){
            return "пяти";
        } else if (sCase == "Т"){
            return "пятью";
        }
        return "";
    }

    private static String six(String sGender, String sCase){
        if(sCase == "Им" || sCase == "В"){
            return "шесть";
        } else if (sCase == "Р" || sCase == "П" || sCase == "Д"){
            return "шести";
        } else if (sCase == "Т"){
            return "шестью";
        }
        return "";
    }

    private static String seven(String sGender, String sCase){
        if(sCase == "Им" || sCase == "В"){
            return "семь";
        } else if (sCase == "Р" || sCase == "П" || sCase == "Д"){
            return "семи";
        } else if (sCase == "Т"){
            return "семью";
        }
        return "";
    }

    private static String eight(String sGender, String sCase){
        if(sCase == "Им" || sCase == "В"){
            return "восемь";
        } else if (sCase == "Р" || sCase == "П" || sCase == "Д"){
            return "восьми";
        } else if (sCase == "Т"){
            return "восьмью";
        }
        return "";
    }

    private static String nine(String sGender, String sCase){
        if(sCase == "Им" || sCase == "В"){
            return "девять";
        } else if (sCase == "Р" || sCase == "П" || sCase == "Д"){
            return "девяти";
        } else if (sCase == "Т"){
            return "девятью";
        }
        return "";
    }

    private static String ten(String sGender, String sCase){
        if(sCase == "Им" || sCase == "В"){
            return "десять";
        } else if (sCase == "Р" || sCase == "П" || sCase == "Д"){
            return "десяти";
        } else if (sCase == "Т"){
            return "десятью";
        }
        return "";
    }

    private static String eleven(String sGender, String sCase){
        if(sCase == "Им" || sCase == "В"){
            return "одиннадцать";
        } else if (sCase == "Р" || sCase == "П" || sCase == "Д"){
            return "одиннадцати";
        } else if (sCase == "Т"){
            return "одиннадцатью";
        }
        return "";
    }

    private static String twelve(String sGender, String sCase){
        if(sCase == "Им" || sCase == "В"){
            return "двенадцать";
        } else if (sCase == "Р" || sCase == "П" || sCase == "Д"){
            return "двенадцати";
        } else if (sCase == "Т"){
            return "двенадцатью";
        }
        return "";
    }

    private static String thirteen(String sGender, String sCase){
        if(sCase == "Им" || sCase == "В"){
            return "тринадцать";
        } else if (sCase == "Р" || sCase == "П" || sCase == "Д"){
            return "тринадцати";
        } else if (sCase == "Т"){
            return "тринадцатью";
        }
        return "";
    }

    private static String fourteen(String sGender, String sCase){
        if(sCase == "Им" || sCase == "В"){
            return "четырнадцать";
        } else if (sCase == "Р" || sCase == "П" || sCase == "Д"){
            return "четырнадцати";
        } else if (sCase == "Т"){
            return "четырнадцатью";
        }
        return "";
    }

    private static String fifteen(String sGender, String sCase){
        if(sCase == "Им" || sCase == "В"){
            return "пятнадцать";
        } else if (sCase == "Р" || sCase == "П" || sCase == "Д"){
            return "пятнадцати";
        } else if (sCase == "Т"){
            return "пятнадцатью";
        }
        return "";
    }

    private static String sixteen(String sGender, String sCase){
        if(sCase == "Им" || sCase == "В"){
            return "шестнадцать";
        } else if (sCase == "Р" || sCase == "П" || sCase == "Д"){
            return "шестнадцати";
        } else if (sCase == "Т"){
            return "шестнадцатью";
        }
        return "";
    }

    private static String seventeen(String sGender, String sCase){
        if(sCase == "Им" || sCase == "В"){
            return "семнадцать";
        } else if (sCase == "Р" || sCase == "П" || sCase == "Д"){
            return "семнадцати";
        } else if (sCase == "Т"){
            return "семнадцатью";
        }
        return "";
    }

    private static String eghteen(String sGender, String sCase){
        if(sCase == "Им" || sCase == "В"){
            return "восемнадцать";
        } else if (sCase == "Р" || sCase == "П" || sCase == "Д"){
            return "восемнадцати";
        } else if (sCase == "Т"){
            return "восемнадцатью";
        }
        return "";
    }

    private static String nineteen(String sGender, String sCase){
        if(sCase == "Им" || sCase == "В"){
            return "девятнадцать";
        } else if (sCase == "Р" || sCase == "П" || sCase == "Д"){
            return "девятнадцати";
        } else if (sCase == "Т"){
            return "девятнадцатью";
        }
        return "";
    }

    private static String twenty(String sGender, String sCase){
        if(sCase == "Им" || sCase == "В"){
            return "двадцать";
        } else if (sCase == "Р" || sCase == "П" || sCase == "Д"){
            return "двадцати";
        } else if (sCase == "Т"){
            return "двадцатью";
        }
        return "";
    }

    private static String thirty(String sGender, String sCase){
        if(sCase == "Им" || sCase == "В"){
            return "тридцать";
        } else if (sCase == "Р" || sCase == "П" || sCase == "Д"){
            return "тридцати";
        } else if (sCase == "Т"){
            return "тридцатью";
        }
        return "";
    }

    private static String forty(String sGender, String sCase){
        if(sCase == "Им" || sCase == "В"){
            return "сорок";
        } else if (sCase == "Р" || sCase == "П" || sCase == "Д" || sCase == "Т"){
            return "сорока";
        }
        return "";
    }

    private static String fifty(String sGender, String sCase){
        if(sCase == "Им" || sCase == "В"){
            return "пятьдесят";
        } else if (sCase == "Р" || sCase == "П" || sCase == "Д"){
            return "пятидесяти";
        } else if (sCase == "Т"){
            return "пятьюдесятью";
        }
        return "";
    }

    private static String sixty(String sGender, String sCase){
        if(sCase == "Им" || sCase == "В"){
            return "шестьдесят";
        } else if (sCase == "Р" || sCase == "П" || sCase == "Д"){
            return "шестидесяти";
        } else if (sCase == "Т"){
            return "шестьюдесятью";
        }
        return "";
    }

    private static String seventy(String sGender, String sCase){
        if(sCase == "Им" || sCase == "В"){
            return "семьдесят";
        } else if (sCase == "Р" || sCase == "П" || sCase == "Д"){
            return "семидесяти";
        } else if (sCase == "Т"){
            return "семьюдесятью";
        }
        return "";
    }

    private static String eighty(String sGender, String sCase){
        if(sCase == "Им" || sCase == "В"){
            return "восемьдесят";
        } else if (sCase == "Р" || sCase == "П" || sCase == "Д"){
            return "восьмидесяти";
        } else if (sCase == "Т"){
            return "восьмьюдесятью";
        }
        return "";
    }

    private static String ninety(String sGender, String sCase){
        if(sCase == "Им" || sCase == "В"){
            return "девяносто";
        } else if (sCase == "Р" || sCase == "П" || sCase == "Д" || sCase == "Т"){
            return "девяноста";
        }
        return "";
    }

    private static String oneHundred(String sGender, String sCase){
        if(sCase == "Им" || sCase == "В"){
            return "сто";
        } else if (sCase == "Р" || sCase == "П" || sCase == "Д" || sCase == "Т"){
            return "ста";
        }
        return "";
    }

    private static String twoHundred(String sGender, String sCase){
        if(sCase == "Им" || sCase == "В"){
            return "двести";
        } else if (sCase == "Р" ){
            return "двухсот";
        }else if(sCase == "Д"){
            return "двумстам";
        }else if(sCase == "Т"){
            return "двумястами";
        }else if(sCase == "П"){
            return "двухстах";
        }
        return "";
    }

    private static String threeHundred(String sGender, String sCase) {
        if (sCase == "Им" || sCase == "В") {
            return "триста";
        } else if (sCase == "Р") {
            return "трёхсот";
        } else if (sCase == "Д") {
            return "трёмстам";
        } else if (sCase == "Т") {
            return "тремястами";
        } else if (sCase == "П") {
            return "трёхстах";
        }
        return "";
    }

    private static String fourHundred(String sGender, String sCase) {
        if (sCase == "Им" || sCase == "В") {
            return "четыреста";
        } else if (sCase == "Р") {
            return "четырёхсот";
        } else if (sCase == "Д") {
            return "четырёмстам";
        } else if (sCase == "Т") {
            return "четырьмястами";
        } else if (sCase == "П") {
            return "четырёхстах";
        }
        return "";
    }

    private static String fiveHundred(String sGender, String sCase) {
        if (sCase == "Им" || sCase == "В") {
            return "пятьсот";
        } else if (sCase == "Р") {
            return "пятисот";
        } else if (sCase == "Д") {
            return "пятистам";
        } else if (sCase == "Т") {
            return "пятьюстами";
        } else if (sCase == "П") {
            return "пятистах";
        }
        return "";
    }

    private static String sixHundred(String sGender, String sCase) {
        if (sCase == "Им" || sCase == "В") {
            return "шестьсот";
        } else if (sCase == "Р") {
            return "шестисот";
        } else if (sCase == "Д") {
            return "шестистам";
        } else if (sCase == "Т") {
            return "шестьюстами";
        } else if (sCase == "П") {
            return "шестистах";
        }
        return "";
    }

    private static String sevenHundred(String sGender, String sCase) {
        if (sCase == "Им" || sCase == "В") {
            return "семьсот";
        } else if (sCase == "Р") {
            return "семисот";
        } else if (sCase == "Д") {
            return "семистам";
        } else if (sCase == "Т") {
            return "семьюстами";
        } else if (sCase == "П") {
            return "семистах";
        }
        return "";
    }

    private static String eightHundred(String sGender, String sCase) {
        if (sCase == "Им" || sCase == "В") {
            return "восемьсот";
        } else if (sCase == "Р") {
            return "восьмисот";
        } else if (sCase == "Д") {
            return "восьмистам";
        } else if (sCase == "Т") {
            return "восьмьюстами";
        } else if (sCase == "П") {
            return "восьмистах";
        }
        return "";
    }

    private static String nineHundred(String sGender, String sCase) {
        if (sCase == "Им" || sCase == "В") {
            return "девятьсот";
        } else if (sCase == "Р") {
            return "девятисот";
        } else if (sCase == "Д") {
            return "девятистам";
        } else if (sCase == "Т") {
            return "девятьюстами";
        } else if (sCase == "П") {
            return "девятистах";
        }
        return "";
    }


}
