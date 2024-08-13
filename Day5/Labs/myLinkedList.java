package Day5.Labs;

import java.util.Scanner;

public class myLinkedList {
    private int size;
    Node head;
    myLinkedList(){
        this.head = null;
        size = 0;
    }
    
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

    public static boolean odd(int val) {
        if(val % 2 == 0){
            return false;
        } else {
            return true;
        }
    }

    public void adjust(){
        Node p = head;
        for(int i = 0; i < size - 1 ;){
            int val1 = p.data;
            int val2 = p.next.data;
            if (odd(val1) == odd(val2)){
                this.addLast(val2);
                this.deleteAt(i+1);
            } else {
                i++;
                p = p.next;
            }
        }
    }

    public class Node {
        int data;
        Node next;
        public Node(int d){
            data = d;
        }
    }

    //check is LinkedList Empty?
    public boolean isEmpty(){
        return size == 0;
    }

    //get LinkedList size
    public int getSize(){
        return size;
    }

    //print LinkedList
    public void display(){
        Node p = head;
        while (p.next != null) {
            System.out.print(p.data+"->" );
            p = p.next;
        }
        System.out.println(p.data);
    }

    //add new Node at frist
    public void addFirst(int d){
        Node p = new Node(d);
        p.next = head;
        head = p;
        size++;
    }

    //add new Node at last
    public void addLast(int d){
        Node p = new Node(d);
        Node current = head;
        if(current == null){
            head = p;
        }else{
            while(current.next != null){
                current =  current.next;
            }
            current.next = p;
            p.next = null;
        }
        size++;
    }

    //add new Node at index
    public void insert(int idx,int d){
        if(idx == 0) {
            addFirst(d);
        } else {
            Node current = head;
            for (int i = 1; i < idx; i++) {
                current = current.next;
            }
            Node p = new Node(d);
            p.next = current.next;
            current.next = p;
            size++;
        }
    }

    //find Node by data
    public Node find(int d){
        Node p = head;
        while (p != null) {
            if(p.data == d){
                return p;
            }
            p = p.next;
        }
        return null;
    }

    //delete next Node
    public void delete(Node p){
        p.next = p.next.next;
        size--;
    }

    //delete by index
    public void deleteAt(int idx){
        Node current = head;
        if(idx > size-1){
            System.out.println("Index out of bound");
            return;
        }
        if(idx ==0){
            head = head.next;
            size--;
            return;
        }
        for (int i = 0; i < idx - 1; i++) {
            current = current.next;
        }
        current.next = current.next.next;
        size--;
    }
}

//big - O (n)

