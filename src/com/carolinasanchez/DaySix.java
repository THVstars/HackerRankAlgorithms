package com.carolinasanchez;

import java.util.Scanner;

public class DaySix {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        daySix();
    }

    public static void daySix() {
        int t = scanner.nextInt();
        scanner.nextLine();
        String input = "";
        String evenLetters = "";
        String oddLetters = "";

        while (t > 0) {
            input = scanner.nextLine();
            for (int i = 0; i < input.length(); i+=2) {
                evenLetters += input.charAt(i);
            }
            for (int i = 1; i < input.length(); i+=2) {
                oddLetters += input.charAt(i);
            }
            System.out.println(evenLetters + " " + oddLetters);

            evenLetters = "";
            oddLetters = "";
            t -= 1;
        }
    }
}
