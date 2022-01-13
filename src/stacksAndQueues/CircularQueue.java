package stacksAndQueues;

public class CircularQueue {
    protected int[] data ;
    private static final int DEFAULT_SIZE = 10 ;
    protected int end = 0 ;
    protected int front = 0 ;
    private int size ;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }
    public CircularQueue(int size){
        this.data = new int[size];
    }
    private boolean isEmpty() {
        return size == 0 ;
    }
    private boolean isFull() {
        return end == data.length ;
    }
    public boolean insert(int item){
        // O(1) time complexity
        if( isFull() ){
            System.out.println("Queue is full!");
            return false ;
        }
        data[end++] = item ; // this will first add item in data[end] then end++
        end = end% data.length ;
        size++;
        return true ;
    }
    public int remove() throws Exception {
        // here it will take O(1)
        if(isEmpty()){
            throw new Exception("Queue is Empty!");
        }
        int removedItem = data[front] ;
        front++ ;
        front = front% data.length ;
        size-- ;
        return removedItem ;
    }
    public int front() throws Exception {
        if(isEmpty()){
            throw new Exception("empty queue!");
        }
        return data[front] ;
    }
    public void display(){
        int i = front ;
        do{
            System.out.print(data[i] +" <- ");
            i++ ;
            i = i % data.length ;
        }while (i != end);
        System.out.println("End");
    }
}
