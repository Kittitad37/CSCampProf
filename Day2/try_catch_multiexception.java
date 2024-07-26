public class try_catch_multiexception {
      public static void main(String[] args) {
            try {
                  int[] myNumbers = { 1, 2, 3 };
                  System.out.println(myNumbers[10]);
                  System.out.println(myNumbers[0] / 0); // Not worked
            } catch (ArithmeticException e) {
                  System.out.println("cannot divide by 0");
            } catch (IndexOutOfBoundsException e) {
                  System.out.println("Index out of bound"); // worked
            } finally {
                  System.out.println("Print Here 1"); // worked
            }
            System.out.println("Print Here 2"); // worked
      }
}