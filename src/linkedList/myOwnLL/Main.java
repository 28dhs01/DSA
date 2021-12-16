package linkedList.myOwnLL;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        // internal linked list

//        LinkedList<Integer> list  = new LinkedList<>() ;
//        list.add(2);
//        list.add(7);
//        list.add(1);
//        System.out.println(list);

        LL list = new LL() ;
//        System.out.println(list.head);
//        System.out.println(list.tail);
//        System.out.println(list.size);


//        list.insertFirst(7);
//        list.insertFirst(2);
//        list.insertFirst(8);
//        list.insertFirst(14);
//        list.insertLast(41);
//        list.display();
//        list.insert(100,2);
//        list.display();
//        list.deleteFirst();
//        list.display();
//        list.deleteLast();
//        list.display();
//        list.delete(2);
//        list.display();
//        System.out.println(list.find(100).val);
//        System.out.println(list.get(2).val);

        // for recursion
        list.insertLast(7);
        list.insertLast(14);
        list.insertLast(21);
        list.insertLast(35);
        list.display();
        list.insertRec(3,28);
        list.display();


        // Doubly LL
//
//        DLL list = new DLL() ;
//        list.insertFirst(7);
//        list.insertFirst(2);
//        list.insertFirst(8);
//        list.insertFirst(14);
//        list.insertLast(20);
//        list.display();
//        list.displayRev();
//        list.insertAfter(8,22);
//        list.display();
//        list.insertAfter(20,62);
//        list.display();


        // Circular LL

//        CLL list = new CLL() ;
//        list.insert(5);
//        list.insert(25);
//        list.insert(125);
//        //list.insert(5);
//        list.display();
//        list.delete(25);
//        list.display();


    }
}
