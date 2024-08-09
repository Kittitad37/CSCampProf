package Pearls;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int line = 1; line <= n; line++) {
            if (line != n - line + 1) {
                for (int qty = 1; qty <= n; qty++) {
                    if (qty == line || qty == n - line + 1) {
                        System.out.print(" ");
                    } else {
                        System.out.print("X");
                    }
                }
                System.out.println();
            }
        }
    }
}
