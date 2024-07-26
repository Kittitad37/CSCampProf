import java.util.Scanner;

public class CSPD6702_Q08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double weight = sc.nextDouble();
        sc.close();

        String totalPrice;
        if (weight > 20) {
            totalPrice = Double.toString(weight * 15.0);
        } else if (weight > 0) {
            totalPrice = Double.toString(weight * 25.0);
        } else {
            totalPrice = ":<";
        }

        System.out.print(totalPrice);
    }
}
