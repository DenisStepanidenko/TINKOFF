package CONTEST1.SortingByInserts;

import java.util.Arrays;

import static CONTEST1.SortingByInserts.Solution.sortingByInserts;

public class Test {
    public static void main(String[] args) {
        int[] a = {2, 634, 123, 980, 99, 4, 3, 8, 7};
        sortingByInserts(a);

        System.out.println(Arrays.toString(a));
    }
}
