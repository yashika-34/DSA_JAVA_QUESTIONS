package LinkedList;
/*
LeetCode 206 - Reverse Linked List

Approach:
1. Maintain two pointers: prev and curr.
2. Reverse the link of each node.
3. Move both pointers forward.
4. Return prev as the new head.

Time Complexity: O(n)
Space Complexity: O(1)
*/
class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
