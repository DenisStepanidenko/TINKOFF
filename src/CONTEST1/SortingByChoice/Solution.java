package CONTEST1.SortingByChoice;

public class Solution {
    public static void sortingByChoice(int[] a) {
        int k = 0;
        while (k < a.length) {
            if(k == a.length - 1){
                break;
            }
            else {
                int min = Integer.MAX_VALUE;
                int minIndex = 0;
                for (int i = k; i < a.length; i++) {
                    if(a[i] < min){
                        min = a[i];
                        minIndex = i;
                    }
                }
                int temp = a[k];
                a[k] = a[minIndex];
                a[minIndex] = temp;
                k++;
            }
        }
    }
}
