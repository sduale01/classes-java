import java.io.*;
import java.util.ArrayList;

public class MyClass {
    public static void main(String[] args) {
        // sum of Multiples of 3 and 5 below 1000
        int multiplesSum = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0) {
                multiplesSum += i;
            } else if (i % 5 == 0) {
                multiplesSum += i;
            }
        }
        System.out.println("the sum of multiples: " + multiplesSum);

        // Even Fibonacci numbers
        ArrayList<Integer> fibArr = new ArrayList<Integer>(100);
        fibArr.add(1);
        fibArr.add(2);

        // creates fibonacci sequence
        for (int i = 2; i < 34; i++) {
            fibArr.add(fibArr.get(i-2) + fibArr.get(i-1));
        }
    }
}