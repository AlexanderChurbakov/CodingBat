package Warmup_1;

/* Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count. */

public class mixStart {
    public boolean mixStart(String str) {

        boolean result = false;
        if (str.length() > 2 && str.substring(1, 3).equals("ix")) {
            result = true;
        }
        return result;
    }
}
