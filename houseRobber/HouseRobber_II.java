package com.houseRobber;

class MaxAmt{
	public int Amount(int[] nums) {
		int n=nums.length;
		if(nums.length==1) return nums[0];
		
		int max1=rob(nums,0,n-1);
		int max2=rob(nums,1,n);
		
		return Math.max(max1, max2);
	}
	private int rob(int[] num,int S,int E) {
		int rob1=0;
		int rob2=0;
		int max=0;
		for(int i=S;i<E;i++) {
			max=Math.max(rob1+num[i],rob2);
			rob1=rob2;
			rob2=max;
		}
		return max;
	}
}

public class HouseRobber_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxAmt amt=new MaxAmt();
		int[] A= {10,20};
		int r=amt.Amount(A);
		System.out.println(r);
	}

}
