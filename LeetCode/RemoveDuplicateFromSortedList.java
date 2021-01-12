package leetcode;

public class RemoveDuplicateFromSortedList {
	public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
            return head;
        
        ListNode prev = null;
        ListNode cur = head;
        
        while(cur != null){
            //store the current value
            prev = cur;
            //skip the repeted value 
            while(cur.next != null && cur.val == cur.next.val){
                // move the pointer 
                cur = cur.next;
            }
            // then point the prev value to current next val means the non repeate val
            prev.next = cur.next;
            // move the pointer 
            cur = cur.next;
        }
        
        return head;
    }
}
