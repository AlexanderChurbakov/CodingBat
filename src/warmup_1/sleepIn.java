package warmup_1;

//https://codingbat.com/prob/p187868

public class sleepIn {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }

        return false;
    }

}
