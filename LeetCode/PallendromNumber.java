package leetcode;

public class PallendromNumber {
	public boolean isPalindrome(int x) {
        boolean flag = false;
        if(x<0){
            flag = true;
            x = -x;
        }
        int n = x;
        int sum = 0;
        while(x>0){
            sum = sum*10 + x%10;
            x /= 10;
        }
        if(sum == n &&(!flag))
            return true;
        
        sum = flag ? -sum : sum;
        
        return false;
    }
}
