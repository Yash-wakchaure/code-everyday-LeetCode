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
        Stack <Integer> s = new Stack<>();

         //  Push all the int into stack 
       ListNode temp = head;
       while(temp !=null){
        s.push(temp.val);
        temp = temp.next;
       }

    //   traverse the linkList
    temp = head;
    while( temp != null ){
        if(temp.val != s.pop()){
            return false;
        }
        temp = temp.next;
    }

    return true;
}}