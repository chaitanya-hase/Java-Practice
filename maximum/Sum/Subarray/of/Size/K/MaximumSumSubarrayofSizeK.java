package maximum.Sum.Subarray.of.Size.K;

class Solution{
	public int maxsum(int[] arr,int k) {
		int sum=0;
		int max=0;
		int start=0;
		for(int end=0;end<arr.length;end++) {
			sum+=arr[end];
			
			if(end>=k-1) {
				max=Math.max(max, sum);
				sum-=arr[start];
				start++;
				
			}
		}
		return max;
	}
}

public class MaximumSumSubarrayofSizeK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s=new Solution();
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println(s.maxsum(arr, k));
	}

}
