package kth.element;

class Solution2{
//	
//	public String helper(String str,int i) {
//		StringBuilder sb=new StringBuilder();
//		for(int j=0;j<str.length();j++) {
//			char s=str.charAt(j);
//			char ap=(char) ('a'+(s-'a'+i)%26);
//			sb=sb.append(ap);
//		}
//		return str+sb;
//			
//	}
//	
//	
//	public char kth(int k,int[] op) {
//		String str="a";
//		if(k==0) return 'a';
//		for(int i=0;i<str.length();i++) {
//			if(str.length()<k) {
//				 str=helper(str,op[i]);
//				 
//			}else {
//				break;
//			}
//		}
//		System.out.println(str);
//		return str.charAt(k-1);
//		
//	}
}



public class GameII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution2 s=new Solution2();
		int[] arr= {0};
//		System.out.println(s.kth(2,arr));
	}

}
