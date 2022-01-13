package stacksAndQueues;

public class CustomQueue {
    private int[] data ;
    private static final int DEFAULT_SIZE = 10 ;
    private int endPtr = 0 ;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size){
        this.data = new int[size];
    }
    public boolean insert(int item){
        // O(1) time complexity
        if( isFull() ){
            System.out.println("Queue is full!");
            return false ;
        }
        data[endPtr] = item ;
        endPtr++ ;
        return true ;
    }
    public int remove() throws Exception {
        // removal will take O(n) time complexity
        if(isEmpty()){
            throw new Exception("Queue is Empty!");
        }
        int removedItem = data[0] ;
        data[0] = 0 ;
        // shift all the items to the left
        for (int i = 1; i < endPtr ; i++) {
            data[i-1] = data[i] ;
        }
        endPtr-- ;
        return removedItem ;
    }
    public int front() throws Exception {
        if( isEmpty() ){
            throw new Exception("queue is empty!");
        }
        return data[0] ;
    }
    public void display(){
        for (int i = 0; i < endPtr; i++) {
            System.out.print(data[i] +" <- ");
        }
        System.out.println("End");
    }

    private boolean isEmpty() {
        return endPtr == 0 ;
    }

    private boolean isFull() {
        return endPtr == data.length ;
    }
}
