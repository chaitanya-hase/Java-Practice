package com.MettingRoom;

import java.util.Arrays;

//class MeetingRoom{
//	public int rooms(int[][] interval) {
//		
//		int[] start=new int[interval.length];
//		int[] end=new int[interval.length];
//		
//		for(int i=0;i<interval.length;i++) {
//			start[i]=interval[i][0];
//			end[i]=interval[i][1];
//		}
//		Arrays.sort(start);
//		Arrays.sort(end);
//		
//		int startpt=0;
//		int endpt=0;
//		int res=0;
//		
//		while(startpt<start.length) {
//			if(start[startpt]>=end[endpt]) {
//				res--;
//				endpt++;
//			}
//			res++;
//			startpt++;
//			
//		}
//		
//		return res;
//		
//	}
//}

class MeetingRoom{
	public int rooms(int[][] rm) {
		int res=0;
		int[] start=new int[rm.length];
		int[] end=new int[rm.length];
		
		for(int i=0;i<rm.length;i++) {
			start[i]=rm[i][0];
			end[i]=rm[i][1];
		}
		Arrays.sort(start);
		Arrays.sort(end);
		
		int str=0;
		int ed=0;
		
		while(str<start.length) {
			if(start[str]>=end[ed]) {
				res--;
				ed--;
			}
			res++;
			str++;
		}
		
		
		return res;
	}
}

public class MeetingRoomII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MeetingRoom rm=new MeetingRoom();
		int[][] A= {{7,10},{2,4}};
		int[][] B= {{0,30},{5,10},{15,20}};
		
		
		System.out.println(rm.rooms(A));
		System.out.println(rm.rooms(B));
	}

}
