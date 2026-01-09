package com.ClimbingStairs;

class Way{
	public int Step(int n) {
		int one=1;
		int two=2;
		if(n==0) return 0;
		if(n==1) return one;
		for(int i=3;i<=n;i++) {
			int total=one+two;
			one=two;
			two=total;
		}
		
		return two;
	}
}

public class ClimbingStair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Way w=new Way();
		System.out.println(w.Step(2));
	}

}
