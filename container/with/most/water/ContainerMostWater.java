package com.container.with.most.water;

class Solution {
	public int MostWater(int[] arr) {
		int max=0;
		int l=0;
		int r=arr.length-1;
		
		while(l<r) {
			int area=(r-l)*Math.min(arr[l],arr[r]);
			max=Math.max(max, area);
			if(arr[l]>arr[r]) {
				r--;
			}
			else {
				l++;
			}
		}
		
		
		return max;
	}
}















//class Solution{
//	public int MostWater(int[] height) {
//		int max=0;
//		int l=0;
//		int r=height.length-1;
//		while(l<r){
//			int area=(r-l)*Math.min(height[l],height[r]);
//			max=Math.max(max, area);
//			if(height[l]<=height[r]) {
//				l++;
//			}
//			else {
//				r--;
//			}
//		}
//	
//		
//		 return max;
//	}
//}

public class ContainerMostWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s=new Solution();
		int[] arr= {1,8,6,2,5,4,8,3,7};
		System.out.println(s.MostWater(arr));
	}

}
