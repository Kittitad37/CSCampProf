import java.util.Scanner;

public class CSPD6702_Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        sc.close();

        for (int lines = 1; lines <= rows; lines++){
            for (int qty = 1 ; qty <= lines; qty++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
