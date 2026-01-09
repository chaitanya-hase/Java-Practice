package com.two.suminput.array.sorted;

import java.util.*;

class Solution{
	public int[] twosum(int[] number,int target) {
		int l=0;
		int r=number.length-1;
		
		int sum=0;
		while(l<r) {
			sum=number[l]+number[r];
			if(sum<target) {
				l++;
			}
			else if(sum>target){
				r--;
			}
			else {
				return new int[] {l,r};
			}
		}
		return new int[0];
	}
	
}

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s=new Solution();
		int[] arr= {1,4,6,8,9};
		int[] result=s.twosum(arr, 10);
		System.out.println(Arrays.toString(result));
		
		
		
		
	}

}
