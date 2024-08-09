package Pearls;
import java.util.Scanner;
import java.util.HashMap;

public class P10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans_qty = sc.nextInt();
        String[] ans = new String[ans_qty];

        for (int i = 0; i < ans_qty ; i++){

            HashMap<Integer, Integer> hsm = new HashMap<Integer, Integer>();
            // key, amount

            int lot_qty = sc.nextInt();
            int[] val = new int[lot_qty];
            for (int k = 0; k < lot_qty; k++){
                val[k] = Integer.valueOf(sc.next());
            }

            for (int j : val){
                if (hsm.get(j) == null){
                    hsm.put(j, 1);
                } else {
                    int temp = hsm.get(j) + 1;
                    hsm.replace(j, temp);
                }
            }

            int max_key = 0;
            int max_val = 0;
            for (int a : hsm.keySet()){
                if (hsm.get(a) > max_val){
                    max_key = a;
                    max_val = hsm.get(a);
                } else if (hsm.get(a) == max_val){
                    max_key = -1;
                }
            }

            if (max_key == -1){
                ans[i] = "NO";
            } else {
                ans[i] = "YES";
            }
        }
        sc.close();
        for (String i : ans){
            System.out.println(i);
        }
    }
}
