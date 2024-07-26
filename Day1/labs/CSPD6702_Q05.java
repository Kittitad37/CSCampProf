import java.util.Scanner;

public class CSPD6702_Q05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your firstname : ");
        String firstname = sc.nextLine();
        System.out.print("Enter your lastname : ");
        String lastname = sc.nextLine();
        sc.close();

        System.out.printf("%s %s", firstname, lastname);
    }
}
