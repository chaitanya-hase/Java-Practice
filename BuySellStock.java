package com.BuySellStock;

class Stock{
	public int maxprofit(int[] arr) {
//		int max=arr[0];
		int min=arr[0];
		int n=arr.length;
		int maxp=0;
		for(int i=1;i<n;i++) {
			int curr=arr[i];
			if(curr<min) {
				min=curr;
			}
			int max=curr-min;
			maxp=Math.max(maxp,max);
			
		}
		
		
		return maxp;
	}
}


public class BuySellStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stock st=new Stock();
		int[] A={7,4,3,6,10,};
		System.out.println( st.maxprofit(A));
		
	}

}
