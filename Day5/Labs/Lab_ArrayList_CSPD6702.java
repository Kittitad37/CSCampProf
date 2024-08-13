package Day5.Labs;
import java.util.Scanner;

public class Lab_ArrayList_CSPD6702 {
    public static void main(String[] args) {
        myLinkedList ll = new myLinkedList();
        Scanner sc = new Scanner(System.in);
        int odd = 0;
        int even = 0;

        while (true){
            int val = Integer.parseInt(sc.next());
            if (val != -1){
                ll.addFirst(val);
                if(myLinkedList.odd(val)){
                    odd++;
                } else {
                    even++;
                }
            } else {
                sc.close();
                break;
            }
        }
        if(odd > even){
            for (; even < odd ; even++){
                ll.addFirst(0);
            }
        } else if (odd < even){
            for (; odd < even; odd++) {
                ll.addFirst(1);
            }
        }
        
        ll.display();
        ll.adjust();
        ll.display();
    }
}
