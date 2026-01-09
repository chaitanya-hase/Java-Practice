package Sorted.Array.to.BTS;

class BTS{
	int val ;
	BTS left;
	BTS right;
	BTS(){}
	BTS(int val){
		this.val=val;
	}
}

class Solution{
	public BTS tobts(int[] nums) {
		if(nums==null) return null;
		return helper(nums,0,nums.length-1);
	}
	public BTS helper(int[] nums,int left,int right) {
		if(left>right) return null;
		
		int mid=left+(right-left)/2;
		BTS  node=new BTS(nums[mid]);
		node.left=helper(nums,left,mid-1);
		node.right=helper(nums,mid+1,right);
		
		return node;
		
	}
}

public class SortToBTS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s=new Solution();
		int[] arr= {1,2,3,4,5,6};
		BTS n=s.tobts(arr);
		System.out.print(n);
	}

}
