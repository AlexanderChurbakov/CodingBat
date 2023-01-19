package warmup_1;

/*
Given 2 int values, return whichever value is nearest to the value 10,
or return 0 in the event of a tie.
Note that Math.abs(n) returns the absolute value of a number. */

public class close10 {
    public int close10(int a, int b) {

        int result = 0;
        int nearestA = Math.abs(10 - a);
        int nearestB = Math.abs(10 - b);

        if (nearestA != nearestB) {
            if (nearestA < nearestB) {
                result = a;
            } else {
                result = b;
            }
        }
        return result;
    }
}
