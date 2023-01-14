package Warmup_1;

/*
Given a string, return a string made of the first 2 chars (if present),
however include first char only if it is 'o' and include the second only if it is 'z',
so "ozymandias" yields "oz". */

public class startOz {

    public String startOz(String str) {

        String result = "";

        if (str.length() >= 1) {

            if (str.startsWith("o")) {
                result += "o";
            }
            if (str.length() >= 2) {
                if (str.charAt(1) == 'z') {
                    result += "z";
                }
            }
        }
        return result;
    }
}
