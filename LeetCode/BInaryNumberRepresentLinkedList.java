package leetcode;

public class BInaryNumberRepresentLinkedList {
	 public int getDecimalValue(ListNode head) {
	        if(head == null)
	            return 0;
	        int res = 0;
	        while(head != null){
	            res = res*2 + head.val;
	            head = head.next;
	        }
	        return res;
	    }
}
