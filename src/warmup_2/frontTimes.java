package warmup_2;

/* Given a string and a non-negative int n,
we'll say that the front of the string is the first 3 chars,
or whatever is there if the string is less than length 3.
Return n copies of the front; */

public class frontTimes {

    public String frontTimes(String str, int n) {

        String result = "";

        if (str.length() > 3) {
            String my = "";
            for (int i = 0; i < n; i++) {
                my = str.substring(0, 3);
                result += my;
            }
        }

        if (str.length() <= 3) {
            for (int i = 0; i < n; i++) {
                result += str;
            }
        }
        return result;
    }
}