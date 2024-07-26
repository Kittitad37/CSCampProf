public class Lab2_2_CSPD6702 {
    public static void main(String[] args) {
        System.out.println("Min : " + findMin(19, 93, 45, 77));
        System.out.println("Max : " + findMax(19, 93, 45, 77));
        System.out.println("Divide : " + findDivide(30, 5));
        System.out.println("Divide : " + findDivide(30, 0));
    }

    static int findMin(int a, int b, int c, int d) {
        int min = a;
        int[] arr = { b, c, d };
        for (int i = 0; i < 3; i++) {
            min = Math.min(min, arr[i]);
        }
        return min;
    }

    static int findMax(int a, int b, int c, int d) {
        int max = a;
        int[] arr = { b, c, d };
        for (int i = 0; i < 3; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    static String findDivide(int a, int b) {
        // หาคำตอบ a/b โดยที่ ถ้าตรวจจับได้ว่าหารไม่ได้ ให้แสดงผลคำว่า "What The ..."
        String ans = "";
        try {
            ans = Integer.toString(a / b);
        } catch (Exception e) {
            ans = "What The ...";
        }
        return ans;
    }

    // ทำไมเขียนโค้ดแบบแยก method ตามการทำงาน
    // ตอบ : เพื่อแยกการทำงานเป็นส่วนๆทำให้โค้ดอ่านง่าย เป็นระเบียบ และง่ายต่อการแก้ไขครับ
    //
}
