package Warmup_1;
//https://codingbat.com/prob/p182873

//Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
public class makes10 {
    public boolean makes10(int a, int b) {
        boolean result = false;
        if (a == 10 || b == 10 || a + b == 10) {
            result = true;
        }
        return result;
    }
}