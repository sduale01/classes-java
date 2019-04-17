import java.io.*;

public class MyClass {
    public static void main(String[] args) {
        // Multiples of 3 and 5
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0) {
                System.out.println(i + " is divisible by 3");
            } else if (i % 5 == 0) {
                System.out.println(i + " is divisible by 5");
            }
        }
    }
}