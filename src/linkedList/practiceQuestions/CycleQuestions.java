package linkedList.practiceQuestions;

public class CycleQuestions {
    // 1. hasCycle - ltc -> https://leetcode.com/problems/linked-list-cycle/
    // 2. cycleLength - gfg -> https://practice.geeksforgeeks.org/problems/find-length-of-loop/1
    // 3. startOfCycle - ltc -> https://leetcode.com/problems/linked-list-cycle-ii/
    // 4. Happy number -> https://leetcode.com/problems/happy-number/
    // 5. mid of ll -> https://leetcode.com/problems/middle-of-the-linked-list/


    // 1. hasCycle - ltc -> https://leetcode.com/problems/linked-list-cycle/
    public boolean hasCycle(ListNode head) {
        // cycle question : blindly trust slow and fast pointer pattern

        // use of while loop
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    // 2. cycleLength - gfg -> https://practice.geeksforgeeks.org/problems/find-length-of-loop/1
    public int cycleLength(ListNode head){
        ListNode slow = head ;
        ListNode fast = head;
        while ( fast != null  && fast.next != null ){
            slow = slow.next ;
            fast = fast.next ;
            if( slow == fast ){
                int length = 0 ;
                do{
                    // can be done with temp node too
                    slow = slow.next ;
                    length++ ;
                }while( slow != fast );
                return length ;
            }
        }
        return 0 ;
    }

    // 3. startOfCycle - ltc -> https://leetcode.com/problems/linked-list-cycle-ii/
    public ListNode detectCycle(ListNode head) {
        if( head == null || head.next == null ){
            return null ;
        }
        ListNode slow = head ;
        ListNode fast = head ;
        int length = 0 ;
        while( fast != null && fast.next != null ){
            slow = slow.next ;
            fast = fast.next.next ;
            if( slow == fast ){
                do{
                    slow = slow.next ;
                    length++ ;
                }while (slow != fast);
                break;
            }
        }
        if ( length == 0 ){
            return null ;
        }
        else{
            ListNode first = head ;
            ListNode second = head ;
            for (int i = 0; i < length; i++) {
                second = second.next ;
            }
            while (first != second) {
                first =first.next ;
                second = second.next ;
            }
            return first ;
        }

    }
    // 4. Happy number -> https://leetcode.com/problems/happy-number/
    public boolean isHappy(int n) {

        int slow = n ;
        int fast = n ;
        do{
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        }while ( slow != fast ) ;
        if( slow == 1 ){
            return true ;
        }
        return false ;

    }
    int findSquare(int n ){
        int ans = 0 ;
        while ( n > 0 ){
            int rem = n%10 ;
            ans += rem*rem;
            n = n/10 ;
        }
        return ans ;
    }

    // 5. mid of ll -> https://leetcode.com/problems/middle-of-the-linked-list/
    public ListNode middleNode(ListNode head) {
        ListNode slow = head ;
        ListNode fast = head ;
        while( fast != null  && fast.next != null ){
            slow = slow.next ;
            fast = fast.next.next ;
        }
        return slow  ;
    }


    class ListNode {
        int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
    }

}
