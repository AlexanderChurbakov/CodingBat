package Warmup_1;
//https://codingbat.com/prob/p191914

//Given a string, return a new string where "not " has been added to the front.
//However, if the string already begins with "not", return the string unchanged.
//Note: use .equals() to compare 2 strings.
// TODO: 02.01.2023 dodododododo
public class notString {
    public String notString(String str) {
        String result = "";
        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
            result = str;
        } else {
            result = "not " + str;
        }
        return result;
    }
}
