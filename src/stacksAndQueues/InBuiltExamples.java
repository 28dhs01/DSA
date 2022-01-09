package stacksAndQueues;

import java.util.*;

public class InBuiltExamples {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>() ;
//        stack.push(32);
//        stack.push(2);
//        stack.push(87);
//        stack.push(29);
//        stack.push(58);
//        System.out.println(stack.peek());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
        // pop() won't work for empty stack - throws exception
//        System.out.println(stack.pop());

//        Queue<Integer> queue = new LinkedList<>() ;
//        queue.add(10);
//        queue.add(19);
//        queue.add(0);
//        queue.add(7);
//        queue.add(3);
////        System.out.println(queue.peek());
//        // poll() removes the head of the queue , works same as that of remove() but in remove() throws null exception which here doesn't
//        System.out.println(queue.poll());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.poll());
//        System.out.println(queue.peek());

        Deque<Integer> deque = new ArrayDeque<>() ;
        // ArrayDeque class is faster than LL. Hence used over here
        deque.add(10);
        deque.addLast(99);
        deque.removeFirst();

    }
}
