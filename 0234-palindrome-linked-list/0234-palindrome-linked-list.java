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
        ListNode slow=head, fast=head, curr=head, safety=null, prev=null;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            safety=curr.next;
            curr.next=prev;
            prev=curr;
            curr=safety;
        }
        ListNode temp1=prev;
        ListNode temp2=slow;
        if(fast!=null){
            temp2=slow.next;
        }
        while(temp1!=null && temp2!=null){
            if(temp1.val==temp2.val){
                temp1=temp1.next;
                temp2=temp2.next;
            }
            else{
                return false;
            }
        }
        return true;
    }
}