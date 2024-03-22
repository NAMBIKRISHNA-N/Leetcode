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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> s=new Stack<Integer>();
        ListNode t=head;
        while(t!=null)
        {
            s.push(t.val);
            t=t.next;
        }
        t=head;
        while(t!=null)
        {
            if(s.pop()==t.val)
            {
                  
            }
            else
            {
                return false;
            }
            t=t.next;
        }
        if(s.empty())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}