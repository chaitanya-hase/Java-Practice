package kth.element;

class Solution{
	public String helper(int k,String res) {
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<res.length();i++) {
		char ap=(char) ('a'+(res.charAt(i)-'a'+1)%26);
		sb= sb.append(ap);
		}
		return  res + sb.toString();
	}
	public  char kth(int k) {
		String res="a";
		while(res.length()<=k) {
			if(res.length()>k) {
				break;
			}
			else {
				res=helper(k,res);
			}
		}
		System.out.println(res);
		return res.charAt(k-1);
	}
}


public class KthElement {
	public static void main(String[] arg) {
		Solution s=new Solution();
		System.out.println(s.kth(10));
	}
}
