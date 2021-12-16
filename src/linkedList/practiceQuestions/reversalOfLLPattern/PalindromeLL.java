package linkedList.practiceQuestions.reversalOfLLPattern;

public class PalindromeLL {
    public boolean isPalindrome(ListNode head) {

//        //4 steps - 1.find the mid
//                    2.reverse from mid
//                    3.make comparisons
//                    4.rereverse
        ListNode  mid = findMid(head) ;
        ListNode reverseHead = reverse(mid);

        ListNode first = head ;
        ListNode second = reverseHead ;
        while( first != null && second != null ){
            if( first.val != second.val ){
                break;
            }
            first = first.next ;
            second = second.next ;
        }
        ListNode rereverse= reverse(mid);
        if( first == null || second == null ){
            return true ;
        }
        else{
            return false ;
        }
    }
    ListNode findMid(ListNode head){
        if( head == null || head.next == null ){
            return head ;
        }
        ListNode slow = head ;
        ListNode fast = head ;
        while ( fast != null && fast.next != null ){
            slow = slow.next ;
            fast = fast.next.next ;
        }
        return slow ;
    }
    ListNode reverse(ListNode head){
        if( head == null || head.next == null ){
            return head ;
        }
        ListNode prev = null ;
        ListNode pres = head ;
        ListNode next = pres.next ;
        while( pres != null ){
            pres.next = prev ;
            prev = pres ;
            pres = next ;
            if( next != null ){
                next = next.next ;
            }
        }
        head = prev ;
        return head;
    }
     public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
