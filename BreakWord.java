package com.BreakWord;
import java.util.*;
class Check{
	public boolean breaks(String s,List<String> wordDict) {
		boolean[] dp=new boolean[s.length()+1];
		dp[0]=true;
		Set<String> wordset=new HashSet<>(wordDict);
		
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<i;j++) {
				if(dp[j] && wordset.contains(s.substring(j,i))) {
					dp[i]=true;
					break;
				}
			}
		}
		return dp[s.length()-1];
		
	}
}

public class BreakWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Check c=new Check();
		List<String> A=new ArrayList<>();
		A.add("leet");
		A.add("code");
		String[] B= {"leet","code"};
		System.out.println( c.breaks("leetcode",A));
	}

}


// something is wrong in this code 
