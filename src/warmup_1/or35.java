package warmup_1;

/*Return true if the given non-negative number is a multiple of 3 or a multiple of 5.
 Use the % "mod" operator -- see Introduction to Mod*/

public class or35 {
    public boolean or35(int n) {
        boolean result = false;
        if (n % 3 == 0 || n % 5 == 0) {
            result = true;
        }
        return result;
    }
}