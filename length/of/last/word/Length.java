package length.of.last.word;

class Solution{
	public int find(String s) {
		String[] word=s.strip().split(" ");
		int n= word.length;
		int len=word[n-1].length();
		return len;
	}
}

public class Length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s=new Solution();
		System.out.println(s.find("Hello world"));
		System.out.println(s.find("fly me to the moon"));
		System.out.println(s.find("luffy is still joyboy"));
	}

}
