package recursia;

import java.io.IOException;
import java.util.Scanner;

public class RecursiaStackOverflowException {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter an integer greater than one: ");
        sumReverse(scanner.nextInt());
    }

    public static void sumReverse(int x) {
        if (x > 0) {
            System.out.print((x - 1) + " ");
            sumReverse(--x);
        }
    }

//input: 5
//result: 4 3 2 1 0
}
