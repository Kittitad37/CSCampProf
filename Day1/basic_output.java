public class basic_output {
    public static void main(String[] args) {
        System.out.printf("%s", "H");
        System.out.printf("%c", 'c');
        System.out.println("Hello \t World");
        System.out.println("Hel\"lo");
        System.out.println("Hel\\lo");
        System.out.println("Hel\bo");
        System.out.println("Hello\rABC"); //ABC replace to Hel
        System.out.println("Hello\rABCDEF"); // ABC replace to Hel
    }
}