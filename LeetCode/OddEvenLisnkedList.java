package leetcode;

public class OddEvenLisnkedList {
	 public ListNode oddEvenList(ListNode head) {
	        if(head == null || head.next == null)
	            return head;
	        
	        ListNode odd = head;
	        
	        ListNode even = odd.next;
	        //store the head of even node
	        ListNode evenH = even;
	        
	        while(even != null && even.next != null){
	            //odd point to the next of even
	            odd.next = even.next;
	            odd = odd.next;
	            //even point to the next of odd
	            even.next = odd.next;
	            even = even.next;
	        }
	        //point the odd last end to even head
	        odd.next = evenH;
	        
	        return head;
	    }
}
