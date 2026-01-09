package com.MettingRoom;

import java.util.Arrays;

class Meeting{
	public boolean room(int[][] interval) {
		Arrays.sort(interval,(a,b)-> a[0]-b[0]);
		for(int i=1;i<interval.length;i++) {
			int prev=interval[i-1][1];
			int currstart=interval[i][0];
			if(prev>currstart) {
				return false;
			}
		}
		
		return true;
	}
}

public class MetetingRooms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Meeting m=new Meeting();
		int[][] A= {{1,2},{8,12},{14,19}};
		boolean res=m.room(A);
		System.out.println(res);
	}

}
