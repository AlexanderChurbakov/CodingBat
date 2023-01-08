package Warmup_1;


/*We'll say that a number is "teen" if it is in the range 13..19 inclusive.
Given 3 int values, return true if 1 or more of them are teen.*/

public class hasTeen {

    public boolean hasTeen(int a, int b, int c) {
        int[] array = {a, b, c};
        boolean result = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 13 && array[i] <= 19) {
                result = true;
            }
        }
        return result;
    }
}
