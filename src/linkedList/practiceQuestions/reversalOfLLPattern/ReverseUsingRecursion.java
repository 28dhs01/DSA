package linkedList.practiceQuestions.reversalOfLLPattern;

public class ReverseUsingRecursion {
    Node head ;
    Node tail ;
    public void reverse(Node node){
        if( node == tail ){
            head = tail;
            return;
        }
        // body and calls
        reverse(node.next);
        tail.next = node ;
        tail = node ;
        tail.next = null ;
    }
    class Node {
        int val ;
        Node next ;
    }
}
