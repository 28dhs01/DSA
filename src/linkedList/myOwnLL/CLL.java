package linkedList.myOwnLL;

public class CLL {

    Node head ;
    Node tail ;

    public CLL() {
        this.head = null ;
        this.tail = null ;
    }
    void insert(int val){
        Node node = new Node(val) ;
        if( head == null ){
            head = node ;
            tail = node ;
            return;
        }
        tail.next = node ;
        node.next = head ;
        tail = node ;
    }
    void display(){
        Node temp = head ;
        do{
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }while (temp != head);
        System.out.println("HEAD");
    }
    void delete ( int val ){
        if ( head == null ){
            return;
        }
        if(val == head.val){
            head = head.next ;
            tail.next = head ;
            return;
        }
       Node node = head ;
        do{
            Node n = node.next ;
            if( n.val == val ){
                node.next = n.next ;
                break;
            }
            node = node.next;
        }while (node!=head);
    }

    class Node {
        int val ;
        Node next ;

        public Node(int val) {
            this.val = val;
        }
    }
}
