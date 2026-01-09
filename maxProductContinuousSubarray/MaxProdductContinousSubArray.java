package com.maxProductContinuousSubarray;

class MaxProduct{
	public int maxp(int[] arr) {
		if(arr.length==0) {
			return 0;
		}
		int max=arr[0];
		int min =arr[0];
		int res=max;
		
		for(int i=1;i<arr.length;i++) {
			int curr=arr[i];
			int temp=Math.max(curr,Math.max(max*curr, curr*min));
			min=Math.min(curr,Math.min(curr*max,curr*min));
			max=temp;
			res=Math.max(max,res);
			
		}
		return res;
		
	}
}

public class MaxProdductContinousSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxProduct m=new MaxProduct();
		int[] A= {2,3,-2,4};
		int[] A1= {-2,0,-1};
		System.out.println( m.maxp(A));
		System.out.println( m.maxp(A1));
	}

}
