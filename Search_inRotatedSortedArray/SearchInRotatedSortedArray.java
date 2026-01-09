package com.Search_inRotatedSortedArray;

class Search{
	public int S(int[] arr,int target) {
		int left=0;
		int n=arr.length;
		int right=n-1;
		
		while(left<=right) {
			int mid=(left+(right))/2;
			if(arr[mid]==target) {
				return mid+1;
			}
			else if(arr[left]<arr[mid]) {
				if(target<arr[left] || target>arr[mid]) {
					left=mid+1;
				}
				else {
					right=mid-1;
				}
			}
			else {
				if(target>arr[right] || target<arr[mid]) {
					right=mid-1;
				}
				else {
					left=mid+1;
				}
			}
			
		}
		
		return -1;
				
	} 
}


public class SearchInRotatedSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Search s1=new Search();
		int[] A= {5,6,7,8,0,1,2,3,4};
		int r=s1.S(A,3);
		System.out.println(r);
	}

}
