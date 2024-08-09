package Pearls;

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int str = sc.nextInt();
        int qty = sc.nextInt();
        String[] val = new String[qty];
        
        sc.nextLine();
        
        for (int i = 0; i < qty; i++) {
            val[i] = sc.nextLine();
        }
        sc.close();

        for (int j = 0; j < qty - 1; j++) {
            int match = 0;
            char[] letter1 = val[j].toCharArray();
            char[] letter2 = val[j+1].toCharArray();
            for (int k = 0; k < str ; k++){
                if (letter1[k] == letter2[k]){
                    match++;
                }
            }
            if (match < 2){
                StringBuilder builder = new StringBuilder();

                for (Character ch : letter1) {
                    builder.append(ch);
                }

                String ans = builder.toString();
                System.out.println(ans);
                break;
            }
        }
    }
}
