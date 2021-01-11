package leetcode;

public class MergeTwoSortedList {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        
        ListNode temp = null;
        //if l1 value is greater then swap the value bcz l1 
        //always contains smaller value
        if(l1.val > l2.val){
            temp = l1;
            l1 = l2;
            l2 = temp;
        }
        //store the head of small value l1 value is small
        ListNode r = l1;
        
        while(l1 != null && l2 != null){
            //store the prev value of l1 to point it to the smaller value 
            temp = null;
            while(l1 != null && l1.val <= l2.val){
                temp = l1;
                l1 = l1.next;
            }
            //inner loop will terminate if l1 value is greater and when it reach to null
            //then point it to the l2 because now l2 value is smaller so the inner loop is
            //terminated 
            temp.next = l2;
            //as l1 only contains the small value so now l1 is point to the greater value 
            //so swap the value
            ListNode d = l1;
            l1 = l2;
            l2 = d;
        }
        //return the head stored in r
        return r;
}
