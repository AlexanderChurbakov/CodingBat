package Warmup_1;

/*
Given three int values, a b c, return the largest. */

public class intMax {

    public int intMax(int a, int b, int c) {

        int largest = c;
        if(a > b && a > c) {
            largest = a;
        }
        if(b > a && b > c) {
            largest = b;
        }
        return largest;
    }
}
