package Inoreder.Traversal;
import java.util.ArrayList;

class BTS{
	int val ;
	BTS left;
	BTS right;
	BTS(){}
	BTS(int val){
		this.val=val;
	}
	BTS(int val,BTS left,BTS right){
		this.val=val;
		this.left=left;
		this.right=right;
	}
}

class Solution{
	ArrayList<Integer> l=new ArrayList<>();
	public ArrayList inorder(BTS root) {
		if(root==null) return l;
		inorder(root.left);
		l.add(root.val);
		inorder(root.right);
		return l;
	}
}

public class Inorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s=new Solution();
		BTS node=new BTS(5);
		node.left=new BTS(4);
		node.right=new BTS(6);
		
		node.left.left=new BTS(2);
		node.right.right=new BTS(8);
		ArrayList n=s.inorder(node);
		System.out.println(n);
	}

}
