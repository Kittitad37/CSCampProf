public class try_catch {

    public static void main(String[] args) {
        try {
            int[] myNumbers = { 1, 2, 3 };
            System.out.println(myNumbers[10]); // Immediately go to catch when found error
            System.out.println("Print Here 1"); // not worked
        } catch (Exception e) {
            System.out.println("error because size of array = 3");
            System.out.println("Print Here 2"); // worked
        }
    }
}
