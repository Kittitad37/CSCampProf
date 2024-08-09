package Pearls;
import java.util.Scanner;

public class P2 {

public static double[] reverse(double[] arr, int n) {
    double[] reversed = new double[n];
    for (int i = 0; i < n; i++){
        reversed[i] = arr[n - 1 - i];
    }
    return reversed;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    double[] array = new double[n];
    for (int i = 0; i < n; i++) {
        array[i] = sc.nextDouble();
    }
    for (double numInArray : reverse(array, n)) {
        System.out.println(numInArray);
    }
    sc.close();
}
}