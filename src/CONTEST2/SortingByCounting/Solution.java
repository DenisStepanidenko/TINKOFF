package CONTEST2.SortingByCounting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void sortingByCounting(int[] a) {
        List<Integer> sortedArr = new ArrayList<>();
        int maxNumber = 0, minNumber = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > maxNumber) {
                maxNumber = a[i];
            }
            if (a[i] < minNumber) {
                minNumber = a[i];
            }
        }

        int[] allNumbers = new int[maxNumber - minNumber + 1];
        for (int i = 0; i < a.length; i++) {
            allNumbers[a[i] - minNumber]++;
        }
        int k = 0;
        for (int i = 0; i < allNumbers.length; i++) {
            for (int j = 0; j < allNumbers[i]; j++) {
                a[k] = i + minNumber;
                k++;
            }
        }

    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,9,8,7,6,5};
        sortingByCounting(a);
        System.out.println(Arrays.toString(a));
    }
}
