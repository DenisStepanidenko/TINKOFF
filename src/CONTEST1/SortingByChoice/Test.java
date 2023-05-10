package CONTEST1.SortingByChoice;

import java.util.Arrays;

import static CONTEST1.SortingByChoice.Solution.sortingByChoice;

public class Test {
    public static void main(String[] args) {
        int[] test = {53,24,1,3223,978,43,242,899,0,421,-43,865};
        sortingByChoice(test);
        System.out.println(Arrays.toString(test));
    }
}
