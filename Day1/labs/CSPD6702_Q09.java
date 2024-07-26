import java.util.Scanner;

public class CSPD6702_Q09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        sc.close();

        if (number % 5 == 0 && number % 3 == 0) {
            System.out.println("ComSci");
        } else if (number % 5 == 0) {
            System.out.println("Com");
        } else if (number % 3 == 0) {
            System.out.println("Sci");
        }
    }
}
