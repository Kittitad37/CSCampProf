package Pearls;

import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bush = sc.nextInt();
        sc.close();

        for (int n = 1; n <= bush; n++) {
            for (int line = 0; line < 4; line++) {
                for (int space = n + (bush - 3); space < (bush * 2) - line; space++) {
                    System.out.print(" ");
                }
                for (int star = 0; star < 1 + ((n - 1) * 2) + (line * 2); star++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        for (int body = 0; body < 3; body++) {
            for (int space = 0; space <= bush; space++) {
                System.out.print(" ");
            }
            for (int wood = 0; wood < 3; wood++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
