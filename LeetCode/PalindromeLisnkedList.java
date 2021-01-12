package leetcode;

public class PalindromeLisnkedList {
	public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)
            return true;
        
        ListNode slow = head;
        ListNode fast = head;
        
        //find the middle of they list
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        //reverse the second half and point it to the next of middle part
        slow.next = reverse(slow.next);
        //move the slow pointer to compare
        slow = slow.next;
        
        while(slow != null){
            //if the valu of haed and slow is not equal then return false
            //the value will be equal if they are palindrome 
            if(head.val != slow.val)
                return false;
            slow = slow.next;
            head = head.next;
        }
        
        return true;
    }
    static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode next = null;
        while(head != null){
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
