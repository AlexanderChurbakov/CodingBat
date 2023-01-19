package warmup_1;

/*Given a string, take the first 2 chars and return the string with the 2
chars added at both the front and back, so "kitten" yields"kikittenki".
If the string length is less than 2, use whatever chars are there.*/

public class front22 {
    public String front22(String str) {
        String myString = "";
        String result = "";
        if(str.length() >= 2) {
            myString = str.substring(0, 2);
        } else {
            myString = str;
        }
        result = myString + str + myString;
        return result;
    }
}