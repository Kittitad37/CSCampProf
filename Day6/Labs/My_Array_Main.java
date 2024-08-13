package Day6.Labs;

public class My_Array_Main {
    public static void main(String[] args) {
        System.out.println("-demo1--------");
        arrayBasic_demo1();
        // System.out.println("-demo2--------");
        // arrayBasic_demo2();
        // System.out.println("-demo3--------");
        // arrayBasic_demo3();
        System.out.println("-demo4--------");
        myArray_demo4();

    }
    static private void arrayBasic_demo1() 
    {
        MyArrayBasic demo = new MyArrayBasic(7,6,8,1,2,3);
        System.out.println(demo);
    }
    // static private void arrayBasic_demo2() {
    //     MyArrayBasic demo = new MyArrayBasic();
    //     demo.insert(9, 0);
    //     demo.insert(7,0);
    //     demo.insert(5,0);
    //     System.out.println(demo);
    //     System.out.println("5 is at " + demo.find(5));
    //     demo.delete(1);
    //     System.out.println(demo);
    // }
    // static private void arrayBasic_demo3(){
    //     MyArrayBasic demo = new MyArrayBasic();
    //     demo.add(3);
    //     demo.add(7);
    //     demo.add(5);
    //     demo.add(4);
    //     demo.add(6);
    //     //index out of bound due to overflow
    //     demo.add(1); 
    // }
    static private void myArray_demo4() {
        MyArrayJub demo = new MyArrayJub(5);
        demo.delete(0); // not crashed
        demo.add(3);
        demo.add(7);
        demo.add(5);
        demo.add(4);
        demo.add(6);
        demo.add(1);        // not crashed
        System.out.println(demo);
        demo.delete(2);
        System.out.println(demo);
        demo.add(7);
        demo.add(9);
        System.out.println(demo);
    }
    
}