package com.LongestConsecutiveElementSeuenceForInteger;
import java.util.*;
class Longest{
	public int consecutive(int[] arr) {
		int n=arr.length;
		HashSet<Integer> hash=new HashSet<>();
		
		for(int i=0;i<n;i++) {
			hash.add(arr[i]);
		}
		int max=0;
		for(int num:arr) {
			if(!hash.contains(num-1)) {
				int curr=num;
				int count=1;
				while(hash.contains(curr+1)) {
					count++;
					curr++;
				}
				max=Math.max(max,count);
			}
			
		}
		return max;
	}
}

public class LongestConsecutiveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Longest l=new Longest();
		int[] A= {0,3,7,2,5,8,4,6,0,1};
		int[] b= {1,0,5,1,2};
		System.out.println(l.consecutive(A));
		System.out.println(l.consecutive(b));
	}

}
