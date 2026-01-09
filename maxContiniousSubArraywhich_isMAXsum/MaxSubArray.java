package com.maxContiniousSubArraywhich_isMAXsum;

class SubArray{
	public int sum(int[] nums) {
		int currsum=0;
		int max=nums[0];
		
		for(int i=0;i<nums.length;i++) {
			if(currsum<0) {
				currsum=0;
			}
			currsum=currsum+nums[i];
			max=Math.max(max,currsum);
		}
		
		return max;
	}
}

public class MaxSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubArray sa=new SubArray();
		int[] a= {-2,1,-3,4,-1,2,1,-5,4};
		int[] b= {5,4,-1,7,8};
		System.out.println(sa.sum(a));
		System.out.println(sa.sum(b));
	}

}
