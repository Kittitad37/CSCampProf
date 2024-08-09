package Pearls;
import java.util.Scanner;

public class P9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String val = sc.nextLine();
        sc.close();
        int qty = 0;
        for (char i : val.toCharArray()){
            char str =  Character.toLowerCase(i);
            if (str == 'a' || str == 'e' || str == 'i' || str == 'o' || str == 'u'){
                qty++;
            }
        }
        if (qty == 0){
            System.out.println("/_/\"");
        } else {
            System.out.println(qty);
        }
    }
}
