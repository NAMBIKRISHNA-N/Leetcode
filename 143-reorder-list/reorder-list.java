/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        Deque<ListNode> de=new ArrayDeque<>();
        ListNode temp=head;
        while(temp!=null)
        {
            de.addLast(temp);
            temp=temp.next;
        } 
        temp=head;
        ListNode temp1=head;
        de.removeFirst();
        while(!de.isEmpty())
        {
            temp.next=de.removeLast();
            temp=temp.next;
            if(!de.isEmpty())
            {
            temp.next=de.removeFirst();
            temp=temp.next;
            }
        }
        temp.next=null;
        head=temp1;
    }
}