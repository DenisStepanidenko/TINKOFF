package CONTEST1.ShopLifting;


import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long minNumber = Integer.MAX_VALUE, maxNumber = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            long x;
            x = scanner.nextInt();
            if (x > maxNumber) {
                maxNumber = x;
            }
            if (x < minNumber) {
                minNumber = x;
            }
        }
        System.out.println(maxNumber - minNumber + 1 - n);

    }
}
