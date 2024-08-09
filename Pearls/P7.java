package Pearls;
import java.util.Scanner;
import java.util.HashMap;
public class P7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String val = sc.nextLine();
        sc.close();
        int m = Integer.parseInt(val.split(" ")[0]);
        int k = Integer.parseInt(val.split(" ")[1]);
        
        HashMap<Integer, Integer> hsm = new HashMap<Integer, Integer>();

        for (int i = 0; i < m ; i++){
            hsm.put(m - i, 1 + (i * 2));
        }

        System.out.println(hsm.get(k));
    }
}
