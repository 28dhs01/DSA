package linkedList.practiceQuestions.reversalOfLLPattern;

public class ReorderLL {
    public void reorderList(ListNode head) {


//         1. find mid
//         2. reverse from mid
//         3. move ahead one by one
//
        if( head == null || head.next == null ){
            return;
        }
        ListNode midNode = findMid(head);
        ListNode headSecond = reverseList(midNode);
        ListNode headFirst = head ;
        while ( headFirst != null  && headSecond != null ){
            ListNode temp = headFirst.next ;
            headFirst.next = headSecond ;
            headFirst = temp ;
            temp = headSecond.next ;
            headSecond.next = headFirst;
            headSecond = temp ;
        }
        if( headFirst != null ){
            headFirst.next = null ;
        }

    }
    public ListNode findMid(ListNode head){
        if( head == null || head.next == null ){
            return head ;
        }
        ListNode slow = head ;
        ListNode fast = head ;
        while(fast != null && fast.next != null ){
            slow = slow.next ;
            fast = fast.next.next ;
        }
        return slow ;
    }
    public ListNode reverseList(ListNode head){
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
        return head ;
    }
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
