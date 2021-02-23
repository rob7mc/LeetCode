// Given a singly linked list, determine if it is a palindrome.

/*
    Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
 */

class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> s = new Stack<>();
 
        ListNode node = head;
        while (node != null) {
            s.push(node.val);
            node = node.next;
        }
 
        node = head;
        while (node != null) {
            int top = s.pop();
            if (top != node.val) {
                return false;
            }
            node = node.next;
        }
        return true;
    }
}        