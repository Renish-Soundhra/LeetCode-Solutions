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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        for(int i=0;i<k;i++){
            if(temp==null){
                return head;
            }
            temp=temp.next;
        }
        int ctr=0;
        ListNode curr=head;
        ListNode prev=null;
        ListNode next=null;
        while(curr!=null && ctr<k){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            ctr++;
        }
        head.next=reverseKGroup(curr,k);
        return prev;
    }
}