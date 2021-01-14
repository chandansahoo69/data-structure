package stack;

import java.util.Scanner;
import java.util.Stack;

public class DuplicateBrackets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		System.out.println(checkDuplicates(n));
		sc.close();
	}

	static boolean checkDuplicates(String n) {
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < n.length(); i++) {
			char ch = n.charAt(i);
			//if the character is ) then 
			if(ch == ')') {
				//check if the top bracket is ( then return true
				//because if the character is ) then the top character
				//is ( then no need of () so it a duplicate 
				if(st.peek() == '(')
					return true;
				else {
					//else pop all the element till don't get (
					while(st.peek() != '(')
						st.pop();
					st.pop();
				}
			} else {
				st.push(ch);
			}
		}
		return false;
	}

}
