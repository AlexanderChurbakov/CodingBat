package Warmup_1;
//https://codingbat.com/prob/p154485

public class sumDouble {
    public int sumDouble(int a, int b) {
        int result = 0;
        if (a == b) {
            result = (a + b) * 2;
        } else {
            result = a + b;
        }
        return result;
    }
}
