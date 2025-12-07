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
    public ListNode rotateRight(ListNode head, int k) {
        int len=1;
        ListNode tail=head;
        if(head==null || head.next==null || k==0){
            return head;
        }
        while(tail.next!=null){
            tail=tail.next;
            len++;
        }
        tail.next=head;
        k=k%len;
        ListNode newtail=head;
        for(int i=1;i<len-k;i++){
            newtail=newtail.next;
        }
        ListNode newhead=newtail.next;
        newtail.next=null;
        return newhead;
    }
}