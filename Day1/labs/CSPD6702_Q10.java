import java.util.Scanner;

public class CSPD6702_Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ฐานเงินเดือน : ");
        double baseSalary = sc.nextDouble();

        System.out.print("ยอดขายของพนักงาน : ");
        double personalSales = sc.nextDouble();

        System.out.print("ยอดขายของทีม : ");
        double teamSales = sc.nextDouble();
        sc.close();

        double personalCommission = personalSales * 0.05;

        double teamCommission;
        if (teamSales < 500000) {
            teamCommission = teamSales * 0.002;
        } else if (teamSales < 1000000) {
            teamCommission = teamSales * 0.005;
        } else {
            teamCommission = teamSales * 0.01;
        }

        double totalSalary = baseSalary + personalCommission + teamCommission;
        System.out.printf("เงินเดือนรวม: %.2f บาท", totalSalary);
    }
}
