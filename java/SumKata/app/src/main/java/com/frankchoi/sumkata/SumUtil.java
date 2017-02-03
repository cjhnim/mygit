package com.frankchoi.sumkata;

/**
 * Created by francis on 2017-02-01.
 */
public class SumUtil {
    public static String sum(String num1, String num2) {
        int convertedNum1 = 0, convertedNum2 =0;

        convertedNum1 = convertStringToInteger(num1);
        convertedNum2 = convertStringToInteger(num2);

        return Integer.toString(convertedNum1 + convertedNum2);
    }

    private static int convertStringToInteger(String number) {
        try {
            return Integer.parseInt(number);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
