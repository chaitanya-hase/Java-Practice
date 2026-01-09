package com.houseRobber;

//class MaxAmount{
//	public int Robbery(int[] robbary) {
//		int rob1=0;
//		int rob2=0;
//		int max=0;
//		for(int i=0;i<robbary.length;i++) {
//			max=Math.max(rob1+robbary[i],rob2);
//			rob1=rob2;
//			rob2=max;
//		}
//		
//		return max;
//	}
//}

class MaxAmount{
	public int Robbery(int[] rbr) {
		int max=0;
		int rob1=0;
		int rob2=0;
		
		for(int i=0;i<rbr.length;i++) {
			max=Math.max(rob1+rbr[i], rob2);
			rob1=rob2;
			rob2=max;
		}
		
		return max;
	}
}


public class HouseRobber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxAmount ma=new MaxAmount();
		int[] A= {1,2,3,1,0,3,0,0,3};
		System.out.println( ma.Robbery(A));
	}

}
