package Warmup_1;

/*Given a string, return a new string where the first and last chars have been exchanged.*/

public class frontBack {
    public String frontBack(String str) {
        if (str.length() > 1) {
            String first = str.substring(0, 1);
            String second = str.substring(1, str.length() - 1);
            String third = str.substring(str.length() - 1);
            return third + second + first;
        }
        return str;

    }
}