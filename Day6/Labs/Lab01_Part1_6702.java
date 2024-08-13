package Day6.Labs;
import java.util.Arrays;
import java.util.Scanner;

public class Lab01_Part1_6702 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size N : ");
        int n = sc.nextInt();
        System.out.print("Size M : ");
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0 ; i < n ; i++){
            for (int k = 0 ; k < m ; k++){
                matrix[i][k] = Integer.parseInt(sc.next());
            }
        }
        sc.close();

        int min_sum = 0;
        for (int i = 0 ; i < n ; i++){
            System.out.println(Arrays.toString(matrix[i]));
            int min = matrix[i][0];
            for (int k : matrix[i]){
                if (k < min){
                    min = k;
                }
            }
            min_sum += min;
        }
        System.out.println(min_sum);
    }
}
