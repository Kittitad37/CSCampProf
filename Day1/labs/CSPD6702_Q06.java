import java.util.Scanner;

public class CSPD6702_Q06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int firstVal = sc.nextInt();
        System.out.print("Enter the last number : ");
        int lastVal = sc.nextInt();
        sc.close();

        System.out.printf("Sum of them is %d", firstVal + lastVal);
    }
}
