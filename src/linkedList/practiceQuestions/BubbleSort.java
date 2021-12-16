package linkedList.practiceQuestions;


import linkedList.myOwnLL.LL;

public class BubbleSort {
    public Node head ;
    private Node tail ;
    int size ;
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
    public Node get(int index ){
        Node node = head ;
        for (int i = 0; i < index; i++) {
            node = node.next ;
        }
        return node ;
    }

    public void bubbleSort(){
        bubbleSort(size-1,0);
    }
    private void bubbleSort(int row, int col){
        if( row == 0 ){
            return;
        }
        if ( col < row ){
            Node first = get(col);
            Node second = get( col + 1 );
            if( first == head ){
                first.next = second.next ;
                second.next = first ;
                head = second;
            }
            else if( second == tail ){
                Node prev = get(col-1) ;
                prev.next = second ;
                second.next = first ;
                tail = first ;
                first.next = null ;
            }
            else{
                Node prev= get(col-1);
                prev.next = second ;
                first.next = second.next ;
                second.next = first ;
            }

            bubbleSort(row,col+1);
        }
        else {
            bubbleSort(row-1,0);
        }
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
    public static void main(String[] args) {

        BubbleSort list = new BubbleSort() ;
        list.insertLast(5);
        list.insertLast(4);
        list.insertLast(3);
        list.insertLast(2);
        list.insertLast(1);
        list.display();
        list.bubbleSort();
        list.display();
    }
}
