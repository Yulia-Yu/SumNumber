package ru.yuliayu.test.util;

import ru.yuliayu.test.etity.*;

import java.util.ArrayList;
import java.util.Objects;

public class Translate {
    public static String sumProp(long num, String sGender, String sCase){
        String res = "";
        NumberComposition numberCom = new NumberComposition();
        numberCom.numberComposition(num);
        ArrayList<Long> composition = numberCom.getComposition();
        int numLen = composition.size();
        for(long i : composition){
            numLen--;
            if(numLen < 3){
                res += translate((int)i, res, sGender, sCase);
            } else if (numLen <= 5){
                res += translate((int) (i/1000), res, "Ж", sCase);
            } else if (numLen <= 8) {
                res += translate((int) (i/1000000), res, "М", sCase);
            } else if (numLen <= 11) {
                res += translate((int) (i/1000000000), res, "М", sCase);
            }
            res += i != 0 ?  " " : "";
            if(numLen == 3 && (num / 1000 % 1000) != 0) res += Thousand.thousand((int)i/1000, sCase);
            if(numLen == 6 && (num / 1000000 % 1000000) != 0) res += Million.million((int)i/1000000, sCase);
            if(numLen == 9 && (num / 1000000000 % 1000000000) != 0) res += Billion.billion((int)i/1000000000, sCase);
        }
        return res;
    }

    private static String translate(int num, String res, String sGender, String sCase){
        switch (num){
            case 0:
                res = "";
                break;
            case 1:
                res = Figures.one(sGender, sCase);
                break;
            case 2:
                res = Figures.two(sGender, sCase);
                break;
            case 3:
                res = Figures.three(sGender, sCase);
                break;
            case 4:
                res = Figures.four(sGender, sCase);
                break;
            case 5:
                res = Figures.five(sGender, sCase);
                break;
            case 6:
                res = Figures.six(sGender, sCase);
                break;
            case 7:
                res = Figures.seven(sGender, sCase);
                break;
            case 8:
                res = Figures.eight(sGender, sCase);
                break;
            case 9:
                res = Figures.nine(sGender, sCase);
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
                res = seventy(sGender, sCase);
                break;
            case 80:
                res = eighty(sGender, sCase);
                break;
            case 90:
                res = ninety(sGender, sCase);
                break;
            case 100:
                res = Hundred.oneHundred(sGender, sCase);
                break;
            case 200:
                res = Hundred.twoHundred(sGender, sCase);
                break;
            case 300:
                res = Hundred.threeHundred(sGender, sCase);
                break;
            case 400:
                res = Hundred.fourHundred(sGender, sCase);
                break;
            case 500:
                res = Hundred.fiveHundred(sGender, sCase);
                break;
            case 600:
                res = Hundred.sixHundred(sGender, sCase);
                break;
            case 700:
                res = Hundred.sevenHundred(sGender, sCase);
                break;
            case 800:
                res = Hundred.eightHundred(sGender, sCase);
                break;
            case 900:
                res = Hundred.nineHundred(sGender, sCase);
                break;
        }
        return res;
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



}
