package com.ChackDublicate;
import java.util.*;
class Check{
	public boolean dublicate(int[] arr) {
		HashSet<Integer> hash=new HashSet<>();
		int n=arr.length;
		for(int i=0;i<n;i++) {
			if(hash.contains(arr[i])) {
				return true;
			}
			hash.add(arr[i]);
		}
		return false;
	}
}

public class Dublicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Check c=new Check();
		int[] A= {1,2,3,4,99,9,9};
		System.out.println(c.dublicate(A));
	}

}


