package warmup_1;


/*We'll say that a number is "teen" if it is in the range 13..19 inclusive.
Given 2 int values, return true if one or the other is teen, but not both.*/

public class loneTeen {

    public boolean loneTeen(int a, int b) {
        boolean result = false;
        int count = 0;
        if (a >= 13 && a <= 19) {
            count++;
        }
        if (b >= 13 && b <= 19) {
            count++;
        }
        if (count == 1) {
            result = true;
        }
        return result;
    }
}