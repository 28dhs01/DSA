package linkedList.practiceQuestions;

import linkedList.myOwnLL.LL;

public class Merge2SortedLL {
    public static LL merge(LL first, LL second){
        LL.Node head1 = first.head ;
        LL.Node head2 = second.head ;
        LL ansLL = new LL() ;
        while(head1 != null && head2 != null ){
            if( head1.val < head2.val ){
                ansLL.insertLast(head1.val);
                head1 = head1.next ;
            }
            else{
                ansLL.insertLast(head2.val);
                head2 = head2.next ;
            }

        }
        while( head1 != null ){
            ansLL.insertLast(head1.val);
            head1 = head1.next ;
        }
        while( head2 != null ){
            ansLL.insertLast(head2.val);
            head2 = head2.next ;
        }
        return ansLL ;
    }

    public static void main(String[] args) {
        LL first = new LL() ;
        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);
        LL second  = new LL();
        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(9);
        second.insertLast(14);

        LL ans = merge(first,second);
        ans.display();



    }
}
