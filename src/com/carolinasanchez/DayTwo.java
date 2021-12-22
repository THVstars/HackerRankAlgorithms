package com.carolinasanchez;

import java.io.*;
import java.util.*;

public class DayTwo {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        double v = scanner.nextDouble();
        String z = scanner.nextLine();
        z = scanner.nextLine(); // This makes no sense to me. Allegedly you have to do this again because the first nextLine takes the empty character from the double. Initializing the string before the int and double instead works on Intellij, but not on HackerRank for some reason.
        System.out.println(i+y);
        System.out.println(d+v);
        System.out.println(s+z);
    }
}