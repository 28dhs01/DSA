package linkedList.myOwnLL;

public class DLL {
    Node head ;
    Node tail ;

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head ;
        node.prev = null ;
        if (head != null){
            head.prev = node ;
        }
        head = node ;
    }
    public void display(){
        Node node = head ;
        while ( node != null ){
            System.out.print(node.val +" -> ");
            node = node.next ;
        }
        System.out.println("END");
    }
    public void displayRev(){
        Node node  = head ;
        while( node.next != null ){
            node = node.next ;
        }
        while( node != null ){
            System.out.print(node.val +" -> ");
            node = node.prev ;
        }
        System.out.println("START");
    }
    public void insertLast( int value ){
        Node node = new Node(value) ;
        if( head == null ){
            head = node ;
            node.next = null ;
            node.prev = null ;
            return;
        }
        Node temp = head ;
        while (temp.next != null ){
            temp = temp.next ;
        }
        temp.next = node ;
        node.prev = temp ;
        node.next = null ;
    }
    public void insertAfter( int after, int value ){
        // I have created better version of this in practice one
        Node node = new Node(value);
        Node temp = head ;
        while( temp.val != after ){
            temp = temp.next ;
        }
        if( temp == null ){
            System.out.println("Not possible");
            return;
        }
        node.next = temp.next ;
        temp.next = node ;
        node.prev = temp ;
        if( node.next != null){
            node.next.prev = node ;
        }

    }

    private class Node{
        int val ;
        Node next ;
        Node prev ;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
