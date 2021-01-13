package recursion;

import java.util.Scanner;

public class PrintEncoding {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String str = sc.next();
			printCode(str, "");
			sc.close();
		}

		static void printCode(String str, String ans) {
			if(str.length() == 0) {
				System.out.println(ans);
			} else if(str.length() == 1) {
				char ch = str.charAt(0);
				if(ch == '0')
					return ;
				else {
					int chval = ch - '0';
					char charcode = (char)('a' + chval - 1);
					System.out.println(ans+charcode);
				}
			} else { //if we have more than 1 character then else part
				char ch = str.charAt(0);
				String ros = str.substring(1);
				//if the first character is 0 then don't anything
				if(ch == '0')
					return ;
				else {
					int chval = ch - '0';
					char charcode = (char)('a' + chval - 1);
					printCode(ros, ans+charcode);
				}
				//second get the 2 character and pass it
				String ch12 = str.substring(0, 2);
				String ros2 = str.substring(2);
				//convert the int value of the character
				int ch12val = Integer.parseInt(ch12);
				if(ch12val <= 26) {
					char ch12code = (char)('a'+ch12val-1);
					printCode(ros2, ans+ch12code);
				}
			}
		}

}
