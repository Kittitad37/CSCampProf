package Day5.Labs;

import java.util.Arrays;

public class Lab01_BigO_6702 {
    public static void main(String[] args) {
        int[][] arr = {{1,2}, {3,4}};
        homework1(arr);
    }

    public static void homework1(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}

// แบบเก่าเป็น Big-O (n^2)