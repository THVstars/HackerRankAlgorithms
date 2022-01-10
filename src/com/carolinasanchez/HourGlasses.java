package com.carolinasanchez;

import java.util.ArrayList;
import java.util.List;

public class HourGlasses {
    public static void main(String[] args) {
    }
    public static int hourglassSum(List<List<Integer>> arr) {
        int sum = -63;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int solution = (arr.get(i).get(j) + arr.get(i).get(j+1) + arr.get(i).get(j+2) + arr.get(i+1).get(j+1) + arr.get(i+2).get(j) + arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2));
                System.out.println(solution);
                if (sum < solution) {
                    sum = solution;
                }
            }
        } return sum;
    }
}
