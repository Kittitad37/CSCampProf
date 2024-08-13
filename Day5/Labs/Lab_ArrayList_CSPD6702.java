package Day5.Labs;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab_ArrayList_CSPD6702 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrl_int = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        while (true) {
            int val_int = Integer.parseInt(sc.next());
            if (val_int != -1) {
                arrl_int.add(val_int);
            } else {
                break;
            }
        }

        for (int i = 0; i < arrl_int.size(); i++) {
            String val_str = sc.next();
            if (arrl_int.get(i) == 0) {
                sb.append(" ");
            } else {
                sb.append(val_str.repeat(arrl_int.get(i)));
            }
        }
        sc.close();

        System.out.println(sb.toString());

    }
}

//big - O (n)
