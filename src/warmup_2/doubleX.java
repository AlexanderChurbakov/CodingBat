package warmup_2;

/*Given a string, return true if the first instance of "x" in the string
is immediately followed by another "x".*/

public class doubleX {

    boolean doubleX(String str) {

        int firstX = str.indexOf("x");

        boolean result = false;

        if (firstX == -1) {
            return result;
        }
        if (firstX + 1 >= str.length()) {
            result = false;
        }
        else if (str.charAt(firstX + 1) == 'x') {
            result = true;
        }

        return result;

    }
}