package linkedList.practiceQuestions;

// SortList -> https://leetcode.com/problems/sort-list/
public class MergeSort {
    ListNode head;
    public ListNode sortList(ListNode head) {

        if( head == null || head.next == null ){
            return head ;
        }

        // I want to get the mid of LL
        ListNode slow = head ;
        ListNode fast = head ;
        // here prev is used because I want to break the head from mid
        // else left side will be full ll all the time
        ListNode prev = null ;
        while( fast != null && fast.next != null ){
            prev = slow ;
            slow = slow.next ;
            fast = fast.next.next;
        }
        prev.next = null ;
        ListNode mid = slow ;
        ListNode left = sortList(head) ;
        ListNode right = sortList(mid) ;
        return merge(left,right) ;

    }
    private ListNode merge( ListNode head1 , ListNode head2 ){
        ListNode ansHead = new ListNode();
        ListNode temp = ansHead ;
        while( head1 != null && head2 != null ){
            if( head1.val < head2.val ){
                temp.next = head1 ;
                head1 = head1.next ;
                temp = temp.next ;
            }
            else{
                temp.next = head2 ;
                head2 = head2.next ;
                temp = temp.next ;
            }
        }
        while (head1 != null ){
            temp.next = head1 ;
            head1 = head1.next ;
            temp = temp.next ;
        }
        while( head2 != null ){
            temp.next = head2 ;
            head2 = head2.next ;
            temp = temp.next ;
        }
        return ansHead.next ;
    }
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
