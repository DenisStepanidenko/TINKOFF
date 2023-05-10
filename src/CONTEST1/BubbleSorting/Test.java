package CONTEST1.BubbleSorting;

import java.util.Arrays;

import static CONTEST1.BubbleSorting.Solution.bubbleSorting;

public class Test {
    public static void main(String[] args) {
        int[] a = {10,9,8,7,6,4};

        bubbleSorting(a);

        System.out.println(Arrays.toString(a));
    }
}
