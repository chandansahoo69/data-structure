package stack;

import java.util.Scanner;
import java.util.Stack;

public class CheckForValidBracketSequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		System.out.println(checkSequence(n));
		sc.close();
	}

	static boolean checkSequence(String n) {
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < n.length(); i++) {
			char ch = n.charAt(i);
			if(ch == '}' || ch == ']' || ch == ')') {
				//if it a end bracket then pop till opening bracket
				while(st.size() > 0 && st.peek() != '(' && st.peek() != '{' && st.peek() != '[')
					st.pop();
//				if the size will be zero then return false
				//because ) for this the ans should be false 
				if(st.size() == 0)
					return false;
				//else take the top and check the brackets are matching or not
				char c = st.pop();
				if(isSequence(c, ch))
					return false;
			}else {
				st.push(ch);
			}
		}
		return true;
	}

	static boolean isSequence(char c, char ch) {
		if(c == '(' && ch == ')')
			return false;
		else if(c == '[' && ch == ']')
			return false;
		else if(c == '{' && ch == '}')
			return false;
		return true;
	}
}
