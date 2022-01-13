package stacksAndQueues;

public class QueueMain {
    public static void main(String[] args) throws Exception {
//        CustomQueue queue = new CustomQueue(5);
//        queue.insert(6);
//        queue.insert(4);
//        queue.insert(7);
//        queue.insert(5);
//        queue.insert(2);
//        queue.display();
//        System.out.println(queue.remove());
//        queue.display();
//        System.out.println(queue.front());

        CircularQueue queue = new CircularQueue(5);
        queue.insert(6);
        queue.insert(4);
        queue.insert(7);
        queue.insert(5);
        queue.insert(2);
        queue.display();
        System.out.println(queue.remove());
        queue.display();
        System.out.println(queue.front());
        queue.insert(55);
        queue.display();
        queue.remove();
        queue.remove();
        queue.insert(10);
        queue.display();
    }
}
