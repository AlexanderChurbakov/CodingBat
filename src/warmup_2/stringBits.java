package warmup_2;

/*Given a string, return a new string made of every other char starting with
the first, so "Hello" yields "Hlo".*/

public class stringBits {

    public String stringBits(String str) {

        StringBuilder result = new StringBuilder();
        for (int i=0; i<str.length(); i+=2) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }
}