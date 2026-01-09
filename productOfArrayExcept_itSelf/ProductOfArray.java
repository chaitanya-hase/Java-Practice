package com.productOfArrayExcept_itSelf;
import java.util.*;
class Product{
	public int[] pro(int[] arr) {
		int[] res=new int[arr.length];
		int pre=1;
		int post=1;
		for(int i=0;i<arr.length;i++) {
			res[i]=pre;
			pre=pre*arr[i];
		}
		for(int i=arr.length-1;i>=0;i--) {
			res[i]=res[i]*post;
			post=post*arr[i];
		}
		
		return res;
	}
}

public class ProductOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p=new Product();
		int[] A= {1,1,1,2};
		System.out.println(Arrays.toString(p.pro(A)));
	}

}

/*
 * arr={1,2,3,4}
 * ans={1,1,2,6}
 * ans={24,12,8,6}
 * pre1=1,pre2=pre1(1)*arr[0]=1, pre3=pre2(1)*arr[1]=2,pre4=pre3(2)*arr[2]=6;
 * post1=1,post2=4*1,post3=4*3,post4=12*2;  post=24
 * 
 * */
