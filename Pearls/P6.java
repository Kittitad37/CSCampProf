package Pearls;
import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qty = sc.nextInt();
        int single_price = sc.nextInt();
        int double_price = sc.nextInt();
        sc.close();

        if (qty < 2){
            System.out.println("NO");
        } else {
            int first_choice = ((qty / 2) * double_price) + ((qty % 2) * single_price);
            int second_choice = (qty * single_price);
            if(first_choice > second_choice){
                System.out.println(second_choice);
            } else {
                System.out.println(first_choice);
            }
        }
    }
}
