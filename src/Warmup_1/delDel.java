package Warmup_1;

/*Given a string, if the string "del" appears starting at index 1,
return a string where that "del" has been deleted.
Otherwise, return the string unchanged.*/

public class delDel {

    public String delDel(String str) {

        String result = str;
        if (str.length() > 3) {
            if (str.substring(1, 4).equals("del")) {
                result = str.substring(0, 1) + str.substring(4);
            }
        }
        return result;
    }
}
