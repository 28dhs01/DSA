package linkedList.practiceQuestions;

import linkedList.myOwnLL.LL;

public class Duplicates {
    Node head ;
    Node tail ;
    int size ;
    public void insertFirst(int value){
        Node node  = new Node(value) ;
        node.next = head ;
        head = node ;
        // I don't have any idea how to manage tail
        if( tail == null ){
            tail = head ;
        }
        size = size+1 ;
    }
    public void insertLast(int value){
        Node node  = new Node(value);
        if( tail == null ){
            insertFirst(value);
            return;
        }
        tail.next = node ;
        tail = node ;
        size += 1 ;
    }
    public void display(){
        Node temp = head ;
        while (temp != null){
            System.out.print(temp.val +" -> ");
            temp = temp.next ;
        }
        System.out.println("END");

    }
    public void removeDuplicates(){
        Node node = head;
        while ( node.next != null ){
            if( node.next.val == node.val ){
                node.next = node.next.next ;
            }
            else{
                node = node.next ;
            }
        }
    }
    class Node {
        int val ;
        Node next ;

        public Node(int val) {
            this.val = val;
        }
    }
    public static void main(String[] args) {

        Duplicates list = new Duplicates();
        list.insertLast(1);
        list.insertLast(1);
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(4);
        list.insertLast(4);
        list.display();
        list.removeDuplicates();
        list.display();
    }
}
