/* Add Two Numbers
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example 1:
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.

Example 2:
Input: l1 = [0], l2 = [0]
Output: [0]

Example 3:
Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]

 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
*/
package codechallenge;

public class Challenge7 {/*
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode();
        ans=addTwoNumbers(l1, l2, ans, 0);
        return ans;
    }
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2,ListNode ans, int sumRest) { 
        if(l1 == null && l2 == null){
            if(sumRest>0){
                ans = new ListNode(sumRest);
            }
            System.out.println(sumRest);
            return ans;
        }
        if(l1 != null && l2 != null){
            ans = new ListNode ((sumRest + l1.val + l2.val) % 10);
            sumRest = (l1.val + l2.val + sumRest)>=10 ? (l1.val+l2.val + sumRest)/10 : 0;
            ans.next=addTwoNumbers(l1.next, l2.next, ans.next, sumRest);
        }
        if(l1==null && l2!=null){
            ans = new ListNode((l2.val +sumRest)%10);
            sumRest = (l2.val+sumRest)>=10 ? (l2.val+1)/10 : 0;
            ans.next=addTwoNumbers(l1, l2.next, ans.next, sumRest);
        }
        if(l2==null && l1!=null){
            System.out.println(sumRest);
            ans = new ListNode((l1.val +sumRest)%10);
            sumRest = (l1.val+sumRest)>=10 ? (l1.val+1)/10 : 0;
            ans.next=addTwoNumbers(l1.next, l2, ans.next, sumRest);
        }
        return ans;
    }*/
    static void run(){
        System.out.println("leetcode 1568 / 1568 test cases passed.");
    }
}
