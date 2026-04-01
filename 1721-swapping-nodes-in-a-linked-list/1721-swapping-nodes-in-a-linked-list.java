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
    public ListNode swapNodes(ListNode head, int k) {
        List<Integer> list=new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head=head.next;
        }
        int n=list.size();
        int num=list.get(k-1);
        list.set(k-1,list.get(n-k));
        list.set(n-k,num);
        ListNode newhead=new ListNode(list.get(0));
        ListNode temp=newhead;
        for(int i=1;i<n;i++){
            ListNode curr=new ListNode(list.get(i));
            temp.next=curr;
            temp=temp.next;
        }
        return newhead;
    }
}