package warmup_1;
//https://codingbat.com/prob/p116624

public class diff21 {
    public int diff21(int n) {
        int num = 21;
        int result = 0;
        if (n > 21) {
            result = Math.abs(n - num) * 2;
        } else {
            result = Math.abs(n - num);
        }
        return result;
    }
}
