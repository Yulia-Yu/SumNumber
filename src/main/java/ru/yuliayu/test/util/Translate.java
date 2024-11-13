package ru.yuliayu.test.util;

import ru.yuliayu.test.etity.*;

import java.util.ArrayList;

public class Translate {
    public static String sumProp(long num, String sGender, String sCase) {
        String res = "";
        NumberComposition numberCom = new NumberComposition();
        numberCom.numberComposition(num);
        ArrayList<Long> composition = numberCom.getComposition();
        int numLen = composition.size();
        for (long i : composition) {
            numLen--;
            if (numLen < 3) {
                res += translate((int) i, res, sGender, sCase);
            } else if (numLen <= 5) {
                res += translate((int) (i / 1000), res, "Ж", sCase);
            } else if (numLen <= 8) {
                res += translate((int) (i / 1000000), res, "М", sCase);
            } else if (numLen <= 11) {
                res += translate((int) (i / 1000000000), res, "М", sCase);
            }
            res += i != 0 ? " " : "";
            if (numLen == 3 && (num / 1000 % 1000) != 0) res += Thousand.thousand((int) i / 1000, sCase);
            if (numLen == 6 && (num / 1000000 % 1000000) != 0) res += Million.million((int) i / 1000000, sCase);
            if (numLen == 9 && (num / 1000000000 % 1000000000) != 0)
                res += Billion.billion((int) i / 1000000000, sCase);
        }
        return res;
    }

    private static String translate(int num, String res, String sGender, String sCase) {
        switch (num) {
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
                res = NumberTeen.ten(sGender, sCase);
                break;
            case 11:
                res = NumberTeen.eleven(sGender, sCase);
                break;
            case 12:
                res = NumberTeen.twelve(sGender, sCase);
                break;
            case 13:
                res = NumberTeen.thirteen(sGender, sCase);
                break;
            case 14:
                res = NumberTeen.fourteen(sGender, sCase);
                break;
            case 15:
                res = NumberTeen.fifteen(sGender, sCase);
                break;
            case 16:
                res = NumberTeen.sixteen(sGender, sCase);
                break;
            case 17:
                res = NumberTeen.seventeen(sGender, sCase);
                break;
            case 18:
                res = NumberTeen.eghteen(sGender, sCase);
                break;
            case 19:
                res = NumberTeen.nineteen(sGender, sCase);
                break;
            case 20:
                res = NumberTy.twenty(sGender, sCase);
                break;
            case 30:
                res = NumberTy.thirty(sGender, sCase);
                break;
            case 40:
                res = NumberTy.forty(sGender, sCase);
                break;
            case 50:
                res = NumberTy.fifty(sGender, sCase);
                break;
            case 60:
                res = NumberTy.sixty(sGender, sCase);
                break;
            case 70:
                res = NumberTy.seventy(sGender, sCase);
                break;
            case 80:
                res = NumberTy.eighty(sGender, sCase);
                break;
            case 90:
                res = NumberTy.ninety(sGender, sCase);
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

}
