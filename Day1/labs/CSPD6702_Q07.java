import java.util.Scanner;

public class CSPD6702_Q07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstname = sc.next();
        String lastname = sc.next();
        int age = sc.nextInt();
        double height = sc.nextDouble();
        double weight = sc.nextDouble();
        sc.close();

        double bmi = weight / ((height / 100.0) * (height / 100.0));

        System.out.printf("name %s %s age %d height %.2f weight %.2f bmi %.2f\n", firstname, lastname, age, height, weight, bmi);
    }
}
