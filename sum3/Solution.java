package com.sum3;

import java.util.*;

class Sum3{
	public List<List<Integer>> sum(int[] arr){
		Arrays.sort(arr);
		List<List<Integer>> res=new ArrayList<>();
		for(int i=0;i<arr.length-1;i++) {
			if(i>0 && arr[i]==arr[i-1]) continue;
			
			int l=i+1;
			int r=arr.length-1;
			
			while(l<r) {
			int sum=arr[i]+arr[l]+arr[r];
			if(sum==0) {
				res.add(Arrays.asList(arr[i],arr[l],arr[r]));
				l++;
				r--;
				while(l<r && arr[l]==arr[l-1]) {
					l++;
				}
			}
			else if(sum<0) {
				l++;
			}
			else {
				r--;
			}
			}
		}
		
		
	return res;	
	}
}













//class Sum3{
//	public List<List<Integer>> sum(int[] nums){
//		Arrays.sort(nums);
//		List<List<Integer>> res=new ArrayList<>();
//		
//		for(int i=0;i<nums.length;i++) {
//			if(i>0 && nums[i]==nums[i-1]) continue;
//			int l=i+1;
//			int r=nums.length-1;
//			while(l<r) {
//				int sum =nums[i]+nums[l]+nums[r];
//				if(sum==0) {
//					res.add(Arrays.asList(nums[i],nums[l],nums[r]));
//					l++;
//					r--;
//					while(l<r && nums[l]==nums[l-1]) {
//						l++;
//					}
//				}
//				else if(sum<0) {
//					l++;
//				}
//				else {
//					r--;
//				}
//			}
//		}
//		return res;
//	} 
//}

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum3 s=new Sum3();
		int[] arr= {-1,0,1,-7,5,2};
		System.out.println(s.sum(arr));
	}

}
