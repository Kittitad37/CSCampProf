import java.util.Arrays;
import java.util.Scanner;

public class Lab2_1_CSPD6702 {
    public static void main(String[] args) {
        System.out.println("zone a_1 --------");
        int[] array = create1D_Array();
        String arrayString = Arrays.toString(array);
        System.out.println(arrayString);

        System.out.println("zone a_2 --------");
        int[][] array2D = create2D_Array();
        String array2dString = Arrays.deepToString(array2D);
        System.out.println(array2dString);

        System.out.println("zone b --------");
        int[] arrayA = create1D_Array();
        int[] reversed = reverseArray(arrayA);
        String arrayReversed = Arrays.toString(reversed);
        System.out.println(arrayReversed);

        System.out.println("zone c --------");
        int[][] matrixA = create2D_Array();
        int[][] transpose = transposeArray(matrixA);
        String array2DTranspose = Arrays.deepToString(transpose);
        System.out.println(array2DTranspose);

        System.out.println("zone d --------");
        int[][] matrixB = create2D_Array();
        int[][] matrixC = create2D_Array();
        String matrixD = Arrays.deepToString(matrixAdditional(matrixB,matrixC));
        System.out.println(matrixD);

    }

    // a_1 create array 1d
    static int[] create1D_Array() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        return array;

    }

    // a_2 create array 2d
    // row = col
    static int[][] create2D_Array() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] array2D = new int[n][n];

        for (int j = 0; j < n; j++){
            for (int k = 0; k < n; k++){
                array2D[j][k] = sc.nextInt();
            }
        }
        return array2D;
    }

    // b reverse array 1d
    static int[] reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        return arr;
    }

    // c matrix transpose
    static int[][] transposeArray(int[][] a) {
        int rowA = a.length;
        int colA = a[0].length;
        int[][] answer = new int[rowA][colA];
        
        for (int i = 0; i < colA; i++){
            for (int j = 0; j < rowA; j++){
                answer[i][j] = a[j][i];
            }
        }
        return answer;
    }

    // d matrixA + matrixB = matrixC
    static int[][] matrixAdditional(int[][] a, int[][] b) {
        int row = a.length;
        int col = a[0].length;
        int[][] matrixD = new int[row][col];
        
        for (int j = 0; j < col; j++) {
            for (int k = 0; k < row; k++) {
                matrixD[j][k] = a[j][k] + b[j][k];
            }
        }
        return matrixD;
    }
}
