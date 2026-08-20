package LinkedList;
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
        int count=0;
        while(count<k && temp!=null){
            temp=temp.next;
            count++;
        }
        if(count<k){
            return head;
        }
        ListNode prev=null;
        ListNode curr=head;
        
        count=0;
        while(curr!=null && count<k){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            count++;
        }
        head.next=reverseKGroup(curr,k);
        return prev;
        
    }
}
