package warmup_2;

/*
Count the number of "xx" in the given string.
We'll say that overlapping is allowed, so "xxx" contains 2 "xx". */

public class countXX {

    int countXX(String str) {

        int count = 0;

        for(int i = 0; i < str.length(); i++) {
            if (str.startsWith("xx", i)){
                count++;
            }
        }
        return count;
    }
}