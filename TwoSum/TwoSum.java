package com.TwoSum;

import java.util.*;

class GetIndex{
	public int[] GetIndex(int[] arr,int target){
		Arrays.sort(arr);
		int l=arr.length;
		int n=0;
		HashMap<Integer,Integer> hash=new HashMap<>();
		for(int i=0;i<l;i++ ) {
			int sum=target-arr[i];
			if(hash.containsKey(sum)) {
				return new int[] {i,hash.get(sum)};
			}
			else {
				hash.put(arr[i],n);
				n++;
			}
		}
		return new int[] {};
		
	}
	
}

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetIndex gi=new GetIndex();
		int[] A= {1,2,3,4,5,6,7,8,9,10};
		int[] res=gi.GetIndex(A,12);
		System.out.println(Arrays.toString(res));
	
	}

}
