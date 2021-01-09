package leetcode;

public class LinkedListCycle {
	public boolean hasCycle(ListNode head) {
        //if one node os present then break it
        if(head == null || head.next == null)
            return false;
        ListNode slow = head;
        ListNode fast = head;
        //if loop is not present then return flase there is no loop
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            //if they will match then then loop is present and return true 
            if(fast == slow)
                return true;
        }
        return false;
    }
}
