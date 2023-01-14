package Warmup_1;

/*
Given 2 int values, return true if they are both in the range 30..40 inclusive,
or they are both in the range 40..50 inclusive. */

public class in3050 {

    public boolean in3050(int a, int b) {

        boolean result = false;

        if ((a >= 30 && a <= 40 && b >= 30 && b <= 40) || (a >= 40 && a <= 50 && b >= 40 && b <= 50)) {
            result = true;
        }
        return result;
    }
}