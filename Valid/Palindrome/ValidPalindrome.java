package com.Valid.Palindrome;

class Solution{
	public boolean pal(String s) {
		int l=0;
		int r=s.length()-1;
		while(l<=r) {
			while(l<r && !Character.isLetterOrDigit(s.charAt(l))) {
				l++;
			}
			while(r>l && !Character.isLetterOrDigit(s.charAt(r))) {
				r--;
			}
			
			if(Character.toLowerCase( s.charAt(l))!=Character.toLowerCase(s.charAt(r))) return false;
			l++;
			r--;
			
		}
		return true;
	}
}


public class ValidPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s=new Solution();
		String p="Was it a car or a cat I saw?";
		boolean r=s.pal(p);
		System.out.print(r);
	}

}
