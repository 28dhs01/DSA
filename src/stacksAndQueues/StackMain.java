package stacksAndQueues;

public class StackMain {
    public static void main(String[] args) throws StackException {
//        CustomStack cs = new CustomStack(5) ;
//        cs.push(3);
//        cs.push(5);
//        cs.push(1);
//        cs.push(7);
//        cs.push(8);
//        cs.push(27); // this can't be added to stack
//        System.out.println(cs.pop());
//        System.out.println(cs.pop());
//        System.out.println(cs.pop());
//        System.out.println(cs.pop());
//        System.out.println(cs.pop());
////        System.out.println(cs.pop());

        DynamicStack ds = new DynamicStack(5) ;
        ds.push(3);
        ds.push(5);
        ds.push(1);
        ds.push(7);
        ds.push(8);
        ds.push(27);
        System.out.println(ds.pop());
        System.out.println(ds.pop());
        System.out.println(ds.pop());
        System.out.println(ds.pop());
        System.out.println(ds.pop());
        System.out.println(ds.pop());
    }
}
