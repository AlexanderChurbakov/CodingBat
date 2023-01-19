package warmup_1;

/*Given a string, return true if the string starts with "hi" and false otherwise.*/

public class startHi {
    public boolean startHi(String str) {
        boolean result = false;
        if (str.length() >= 2 && str.substring(0, 2).equals("hi")) {
            result = true;
        }
        return result;
    }
}