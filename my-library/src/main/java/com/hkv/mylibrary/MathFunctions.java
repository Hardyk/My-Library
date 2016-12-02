package com.hkv.mylibrary;

/**
 * Created by hardik on 2/12/16.
 */

public class MathFunctions {

    public static int subStract(int a, int b) {
        int result = 0;
        result = a - b;
        return result;
    }

    public static int addition(int a, int b) {
        int result = 0;
        result = a + b;
        return result;
    }

    public static int multiply(int a, int b) {
        int result = 0;
        result = a * b;
        return result;
    }

    public static int devide(int a, int b) {

        int result = 0;
        try {
            result = (int) (a / b);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            result = 0;
        }
        return result;
    }
}
