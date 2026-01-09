package kth.element;

class Solution1{
	public String helper(String str) {
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<str.length();i++) {
			char ap=(char)('a'+(str.charAt(i)-'a'+1)%26);
			sb=sb.append(ap);
			
		}
		return str+sb;
	}
	public char kth(int k) {
		String str="a";
		
		
		for(int i=0;i<str.length();i++) {
			if(str.length()>=k) {
				break;
			}
			else {
				str=helper(str);
			}
		}
		return str.charAt(k-1);
		
	}
}

public class NewKthEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution1 s=new Solution1();
		System.out.println(s.kth(5));
	}

}
