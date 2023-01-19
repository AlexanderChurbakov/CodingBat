package warmup_1;

/* Return true if the given string contains between 1 and 3 'e' chars.*/


public class stringE {
    public boolean stringE(String str) {
        boolean result = false;
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
           if(str.charAt(i) == 'e') count++;
        }
        if(count > 0 && count <= 3) result = true;
        return result;
    }
}