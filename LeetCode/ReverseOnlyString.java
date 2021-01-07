package leetcode;

import java.util.Scanner;

public class ReverseOnlyString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		System.out.println(reverse(n));
		sc.close();

	}
	
	static String reverse(String s) {
		 char ch[] = s.toCharArray();
	        int i = 0;
	        int j = ch.length - 1;
	        while(i<j){
	            //check the value is not a char then increment the pointer or decrement
	            if(!Character.isAlphabetic(ch[i]))
	                i++;
	            else if(!Character.isAlphabetic(ch[j]))
	                j--;
	            //if not then swap it
	            else{
	                char temp = ch[i];
	                ch[i] = ch[j];
	                ch[j] = temp;
	                i++;
	                j--;
	            }
	        }
	        //return by convert it to string
	        return String.valueOf(ch);
		
	}
	

}
