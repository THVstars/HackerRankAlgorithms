package com.carolinasanchez;

public class AlternatingString {
    public static void main(String[] args) {
        System.out.println(alternatingCharacters("ABBAAAB"));
    }

    public static int alternatingCharacters(String s) {
        int holder = 0;
        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
                holder++;
                //System.out.println(holder);
            }
        } return holder;
    }
}
