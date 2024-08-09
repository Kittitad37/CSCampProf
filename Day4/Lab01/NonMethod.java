package Lab01;

import java.util.Scanner;
import java.util.Arrays;

public class NonMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.println("Please Input number " + n + " number:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        sc.close();

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of number: " + sum);

        double average = ((double) sum / n);
        System.out.printf("Avg:", average);

        Arrays.sort(numbers);
        System.out.println("Sorted Array " +numbers);
        //ระวังโดนพี่หลอกนะ 

    }
}
//OUTPUT :
//ถ้าพี่ Input n= 3 ตามลำดับ
// 3
// Please Input number 3 number:
// 2
// 1
// 3
// Sum of number: 6
// Avg:Sorted Array [1, 2, 3]