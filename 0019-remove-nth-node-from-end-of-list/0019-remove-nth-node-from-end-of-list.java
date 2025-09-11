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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int ctr=1;
        ListNode temp=head;
        while(temp.next!=null){
            ctr++;
            temp=temp.next;
        }
        if(ctr==1 && n==1){
            return head.next;
        }
        ListNode curr=head;
        ListNode prev=null;
        for(int i=0;i<ctr-n;i++){
            prev=curr;
            curr=curr.next;
        }
        if(prev==null){
            return head.next;
        }
        prev.next=curr.next;
        return head;
    }
}