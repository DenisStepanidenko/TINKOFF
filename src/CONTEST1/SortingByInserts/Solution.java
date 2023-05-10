package CONTEST1.SortingByInserts;

public class Solution {
    public static void sortingByInserts(int[] a) {
        for (int i = 2; i < a.length; i++) {
            int j = i;
            while (a[j - 1] > a[j] && j > 0) {
                int temp = a[j - 1];
                a[j - 1] = a[j];
                a[j] = temp;
                j--;
            }
        }
    }

}
