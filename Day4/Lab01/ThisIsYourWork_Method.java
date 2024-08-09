package Lab01;

import java.util.Scanner;
import java.util.Arrays;

//กรุณาใส่รหัสประจำตัว 2 หลัก สุดท้าย : 02

public class ThisIsYourWork_Method {
    public static int[] getNumbersPutToArray(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];

        System.out.println("Please Input number " + n + " number:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        sc.close();
        return numbers;
    }

    public static int caculateSum(int[] arr){
        int sum = 0;
        for (int number : arr) {
            sum += number;
        }
        return sum;
    }

    public static double caculateAverage(int sum, int arr_length){
        double average = ((double) sum / arr_length);
        return average;
    }

    public static int[] sortArray(int[] arr){
        Arrays.sort(arr);
        return arr;
    }

    public static void main(String[] args){
        int[] numbers = getNumbersPutToArray();
        int sum = caculateSum(numbers);
        System.out.println("Sum of number: " + sum);
        
        double avg = caculateAverage(sum, numbers.length);
        System.out.println("Avg: " + avg); 
        
        int[] sorted = sortArray(numbers);
        System.out.println("Sorted Array " + Arrays.toString(sorted));
    }
}
//OUTPUT :
//ถ้าพี่ Input n=3 แล้ว ใส่เลข 2 1 3 ตามลำดับ
// 3
// Please Input number 3 number:
// 2
// 1
// 3
// Sum of number: 6
// Avg:Sorted Array [1, 2, 3]
