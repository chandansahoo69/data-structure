package stack;

import java.util.Scanner;
import java.util.Stack;

public class NextSmallestElementToRight {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int b[] = Solution(a);
		for (int i = 0; i < n; i++) {
			System.out.print(b[i]+" ");
		}
		sc.close();
	}

	static int[] Solution(int[] a) {
		int b[] = new int[a.length];
		Stack<Integer> st = new Stack<>();
		for (int i = b.length - 1; i >= 0; i--) {
			//when the stack top is not greater than a[i] 
			//the while loop will be terminate in two cases 
			//if size is not 0 then we have found the smaller element
			//else the size is zero means there is nothing so add -1
			while(st.size() > 0 && st.peek() >= a[i])
				st.pop();
			
			if(st.size() == 0)
				b[i] = -1;
			else
				b[i] = st.peek();
			//all the time push in the stack
			st.push(a[i]);
		}
		return b;
	}
}
