package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner in = new Scanner(new File("input.txt"));
        int n = in.nextInt();
        int k = in.nextInt();

        in.close();

        PrintWriter out = new PrintWriter("output.txt");
        out.print(minimumTime(n, k));

        out.close();

    }

    private static int minimumTime(int toasts, int capacity) {
        int result = 0;
        int left;
        int tmp;

        if (toasts == 0) return 0;

        if (toasts <= capacity) {
            return 4;
        }

        if (capacity == 1){
            return toasts * 4;
        }

        result = 2 * toasts / capacity;
        if (2 * toasts % capacity > 0) result++;
        result *= 2;

        return result;
    }


}