package com.UniquePath;
import java.util.*;
class UniqueP{
	public int path(int m,int n) {
		int[][] dp=new int[m][n];
		for(int[] row:dp) {
			Arrays.fill(row,1);
		}
		for(int i=1;i<m;i++) {
			for(int j=1;j<n;j++) {
				dp[i][j]=dp[i-1][j]+dp[i][j-1];
			}
		}
		
		return dp[m-1][n-1];
		
	}
}

public class UniquePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UniqueP up=new UniqueP();
		int n=up.path(3,3);
		System.out.println(n);
	}

}
