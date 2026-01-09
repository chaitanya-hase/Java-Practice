package symmetric.tree;

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode root;
	TreeNode(){}
	TreeNode(int val){
		this.val=val;
	}
	
	TreeNode(int val,TreeNode left,TreeNode right){
		this.val=val;
		this.left=left;
		this.right=right;
	}
}

class Solution{
	
	public boolean symmetric(TreeNode root) {
		if(root==null) return true;
		return isMirror(root.left,root.right);
	}
	
	public boolean isMirror(TreeNode t1,TreeNode t2) {
		if(t1==null && t2==null) return true;
		else if(t1==null || t2==null) return false;
		
		return t1.val==t2.val &&  isMirror(t1.left,t2.right) && isMirror(t1.right,t2.left);
	}
}
public class SymmetricTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s=new Solution();
		TreeNode root=new TreeNode(1,
				new TreeNode(2,new TreeNode(3),new TreeNode(4)),
				new TreeNode(2,new TreeNode(4),new TreeNode(3)));
				
		System.out.println(s.symmetric(root));
	}

}
