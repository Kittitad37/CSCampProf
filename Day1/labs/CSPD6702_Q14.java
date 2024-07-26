import java.util.Scanner;

public class CSPD6702_Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        sc.close();

        for (int lines = rows; lines > 0; lines--) {
            for (int qty = 1; qty <= lines; qty++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}