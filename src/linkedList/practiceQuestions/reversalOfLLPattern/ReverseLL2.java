package linkedList.practiceQuestions.reversalOfLLPattern;

// ReverseLL2 -> https://leetcode.com/problems/reverse-linked-list-ii/
public class ReverseLL2 {

    public ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode prev = null ;
        ListNode pres = head ;

        // reach till 1 less than left
        for (int i = 0; pres != null && i < left - 1; i++) {
            prev = pres ;
            pres = pres.next ;
        }
        ListNode last = prev ;
        ListNode newEnd = pres ;
        ListNode next = pres.next ;

        // reverse LL
        for (int i = 0; pres != null && i < right - left + 1; i++) {
            pres.next = prev ;
            prev = pres ;
            pres = next ;
            if( next != null ){
                next = next.next ;
            }
        }
        if( last != null ){
            last.next = prev ;
        }
        else{
            head = prev ;
        }

        newEnd.next = pres ;

        return head ;


    }
    class ListNode{
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
