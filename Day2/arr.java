import java.util.Arrays;

public class arr {
    public static void main(String[] args) {
        String[] name = {"Boy", "Somchai", "Somying", "A"};
        int[] name1 = new int[5];

        int size = name1.length;
        for(int index = 0; index < size; index++){
            name1[index] = index+1;
        }
        System.out.println(Arrays.toString(name1));

        name1[0] = 80;
        System.out.println(Arrays.toString(name1));
        System.out.println(name);
    }
}