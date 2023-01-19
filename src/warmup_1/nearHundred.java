package warmup_1;
//https://codingbat.com/prob/p184004

//Given an int n, return true if it is within 10 of 100 or 200.
//Note: Math.abs(num) computes the absolute value of a number.
public class nearHundred {
    public boolean nearHundred(int n) {
        boolean result = false;
        if (Math.abs(100 - n) <= 10 || Math.abs(200 - n) <= 10) {
            result = true;
        }
        return result;
    }
}