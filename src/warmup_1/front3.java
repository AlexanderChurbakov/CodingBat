package warmup_1;

/*Given a string, we'll say that the front is the first 3 chars of the string.
If the string length is less than 3, the front is whatever is there.
Return a new string which is 3 copies of the front.*/

public class front3 {
    public String front3(String str) {
        String result = "";
        if (str.length() >= 3) {
            String front = str.substring(0, 3);
            for (int i = 0; i < 3; i++) {
                result += front;
            }
            result = front + front + front;
        } else {
            result = str + str + str;
        }
        return result;
    }
}