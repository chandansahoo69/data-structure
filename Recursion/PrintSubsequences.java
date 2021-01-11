package recursion;

import java.util.Scanner;

public class PrintSubsequences {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String str = sc.next();
			subsequence(str, "");
			sc.close();
		}

		static void subsequence(String str, String ans) {
			//when we get to the end of the string then after that 
			//we print the values 
			if(str.length() == 0) {
				System.out.print(ans + " ");
				return ;
			}
			//get the first character
			char ch = str.charAt(0);
			String ros = str.substring(1);
			
			//we are doing two things first we are adding the value 
			//second we are not adding the values then at the end of
			//the day we are getting the result adding one and ignoring
			//the value
			subsequence(ros, ans+ch);
			subsequence(ros, ans+"");
		}
}
