package com.carolinasanchez;

import java.util.ArrayList;
import java.util.List;

public class ArrayString {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(9);
        arr.add(10);

        // System.out.println(arr);

        String numbers = "";

        for (int i = arr.size() - 1; i > -1; i--) { // Remember that when you start with the final size/length and want to decrement i, you MUST use i-- instead of i++.
            numbers += arr.get(i).toString() + " ";
        }

        System.out.println(numbers); // MUST be out of the loop so that it only prints the final product, and not each addition to numbers.
    }
}
