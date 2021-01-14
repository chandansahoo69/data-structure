package stack;

import java.util.Scanner;
import java.util.Stack;

public class InfixEvalution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		System.out.println(Evalution(n));
		sc.close();
	}

	static int Evalution(String n) {
		Stack<Integer> st = new Stack<>();
		Stack<Character> operator = new Stack<>();
		for (int i = 0; i < n.length(); i++) {
			char ch = n.charAt(i);
			if(ch == '(')
				operator.push(ch);
			else if(ch >= '0' && ch <= '9')
				st.push(ch-'0');
			else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
				//until stack is not empty and and till ( and 
				//till we get a smaller precedence value
				//because + can't place over * but * can place over +
				while(operator.size() > 0 && operator.peek() != '(' 
					&& precedence(ch) <= precedence(operator.peek())) {
					int v2 = st.pop();
					int v1 = st.pop();
					char op = operator.pop();
					int val = operation(v1, v2, op);
					st.push(val);
				}
				//after process all the expression push the operator
				operator.push(ch);
			} else if(ch == ')') {
				while(operator.peek() != '(') {
					int v2 = st.pop();
					int v1 = st.pop();
					char op = operator.pop();
					int val = operation(v1, v2, op);
					st.push(val);
				}
				//we have to pop also the '('
				operator.pop();
			}
		}
		//after all check is there any value exist in the operator 
		//stack then solve them 
		while(operator.size() != 0) {
			int v2 = st.pop();
			int v1 = st.pop();
			char op = operator.pop();
			int val = operation(v1, v2, op);
			st.push(val);
		}
		return st.peek();
	}

	static int operation(int v1, int v2, char op) {
		if(op == '+')
			return v1 + v2;
		else if(op == '-')
			return v1 - v2;
		else if(op == '*')
			return v1 * v2;
		else if(op == '/')
			return v1 / v2;
		else
			return 0;
	}
	
	static int precedence(char op) {
		if(op == '+' || op == '-')
			return 1;
		else if(op == '*'|| op == '/')
			return 2;
		else
			return 0;
	}
}
