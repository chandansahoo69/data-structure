package leetcode;

public class LinkedListCycleII {
	 public ListNode detectCycle(ListNode head) {
	        if(head == null || head.next == null)
	            return null;
	        ListNode slow = head;
	        ListNode fast = head;
	        
	        while(fast != null && fast.next != null){
	            slow = slow.next;
	            fast = fast.next.next;
	            if(fast == slow)
	                break;
	        }
	        if(fast == slow){
	            //if they meet at head  
	            if(fast == head){
	                return head;
	            }
	            else{
	                //start from the head and ove untill they meet again 
	                //when they meet return ;
	                slow = head;
	                while(slow != fast){
	                    slow = slow.next;
	                    fast = fast.next;
	                }
	                return slow;
	            }
	        }
	        //if loop is not present then return null
	        return null;
	    }
}
