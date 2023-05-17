package CONTEST2.MergeSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void mergeSort(int left, int right, int[] a) {
        if (left >= right) {
            return;
        }
        int middle = (left + right) / 2;
        mergeSort(left, middle, a);
        mergeSort(middle + 1, right, a);
        merge(left, right, middle, a);
    }

    private static void merge(int left, int right, int middle, int[] a) {
        int l1 = left, r1 = middle;
        int l2 = middle + 1, r2 = right;
        List<Integer> tempList = new ArrayList<>();
        while (l1 <= r1 || l2 <= r2) {
            if (l1 <= r1 && l2 <= r2) {
                if (a[l1] < a[l2]) {
                    tempList.add(a[l1]);
                    l1++;
                } else {
                    tempList.add(a[l2]);
                    l2++;
                }
            } else if (l1 <= r1) {
                tempList.add(a[l1]);
                l1++;
            } else if (l2 <= r2) {
                tempList.add(a[l2]);
                l2++;
            }
        }
        int k = 0;
        for (int i = left; i <= right; i++) {
            System.out.println(tempList);
            a[i] = tempList.get(k);
            k++;
        }
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        int x = 3 / 2;
        int[] a = {1, 2, 3, 4, 5, 9, 8, 7, 6};
        mergeSort(0, a.length - 1, a);
        System.out.println(Arrays.toString(a));
    }

}
