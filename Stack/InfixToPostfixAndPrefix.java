package stack;

import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfixAndPrefix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		
		Stack<String> post = new Stack<>();
		Stack<String> pre = new Stack<>();
		Stack<Character> opr = new Stack<>();
		
		for (int i = 0; i < n.length(); i++) {
			char ch = n.charAt(i);
			if(ch == '(')
				opr.push(ch);
			else if((ch >= '0' && ch <= '9')||(ch >= 'a' && ch <= 'z')
					||(ch >= 'A' && ch <= 'Z')) {
				post.push(ch + ""); //convert it to string
				pre.push(ch + ""); // convert it to string
			} else if(ch == ')') {
				while(opr.peek() != '(') {
					process(post, pre, opr);
				}
				//remove the ( also
				opr.pop();
			} else if(ch == '+' || ch == '-' || ch == '/' || ch == '*') {
				while(opr.size() > 0 && opr.peek() != '(' 
						&& precedence(ch) <= precedence(opr.peek())) {
					process(post, pre, opr);
				}
				//after doing all these push the operator
				opr.push(ch);
			}
		}
		while(opr.size() > 0) {
			process(post, pre, opr);
		}
		System.out.println(pre.pop());
		System.out.println(post.pop());
		sc.close();
	}
	
	static int precedence(char op) {
		if(op == '+' || op == '-')
			return 1;
		else if(op == '*'|| op == '/')
			return 2;
		else
			return 0;
	}
	static void process(Stack<String> post, Stack<String> pre,
			Stack<Character> opr) {
		char op = opr.pop();
		String postv2 = post.pop();
		String postv1 = post.pop();
		post.push(postv2 + postv1 + op);
		
		String prev2 = pre.pop();
		String prev1 = pre.pop();
		pre.push(op + prev2 + prev1);
	}
}