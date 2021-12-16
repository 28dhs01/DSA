package linkedList.myOwnLL;

public class LL {
    public Node head ;
    private Node tail ;
    int size ;

    public LL() {
        this.size = 0 ;
    }
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
    public void insert( int value , int index){
        if( index ==  0 ){
            insertFirst(value);
            return;
        }
        if( index == size ){
            insertLast(value);
            return;
        }
        Node temp = head ;
        for (int i = 1; i < index ; i++) {
            temp = temp.next ;
        }
        Node node = new Node(value);
        node.next = temp.next ;
        temp.next = node ;
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
    public void deleteFirst(){
        head = head.next ;
        if( head == null ){
            tail = null ;
        }
        size -= 1 ;
    }
    public void deleteLast(){
        Node temp = head ;
        while ( temp.next != tail ){
            temp = temp.next ;
        }
        temp.next = null ;
        tail = temp ;
        if( tail == null ){
            head = null;
        }
        size = size-1 ;
    }
    public void delete(int index){
        if( index == 0 ){
            deleteFirst();
            return;
        }
        if( index == size-1 ){
            deleteLast();
            return;
        }
        Node temp = head ;
        for (int i = 1; i <index ; i++) {
            temp = temp.next ;
        }
        temp.next = temp.next.next ;
        size-- ;
    }
    public Node find(int value){
        Node node = head ;
        while( node != null ){
            if(node.val == value ){
                return node ;
            }
            node = node.next ;
        }
        return null ;
    }
    public Node get( int index ){
        Node node = head ;
        for (int i = 0; i < index; i++) {
            node = node.next ;
        }
        return node ;
    }
    public void insertRec(int idx, int value ){
        head = insertRec(value,idx, head);

    }
    private Node insertRec( int val,int stepsLeft, Node temp ){
        // base case
        if( stepsLeft == 0 ){
            Node node = new Node(val,temp);
            size++;
            return node ;
        }
        // body and calls
            temp.next = insertRec(val, stepsLeft-1, temp.next);
            return temp;
    }

    public class Node{
        public int val ;
        public Node next ;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
