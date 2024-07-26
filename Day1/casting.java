public class casting {
    public static void main(String[] args){
        //Widening Casting : smaller size to larger size
        int myInt = 2024;
        double myDouble = myInt;

        System.out.println(myInt);
        System.out.println(myDouble);

        //Narrowing Casting : larger size to smaller size
        double myDouble1 = 123.456d;

        System.out.println("myInt = " + (int)myDouble1);
    }
}
