package parenthesis;
import java.util.Stack;
class Check{
	public boolean ismatch(char open,char close) {
		if(open=='('&& close==')') {
			return true;
		}
		else if(open=='{'&& close=='}') {
			return true;
		}
		else if(open=='['&& close==']') {
			return true;
		}
		return false;
		
	}
	public boolean isValid(String str) {
		
		if(str==null ||str.length()==0) { 
			return false;
			}
		
		Stack stack=new Stack();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='(' || str.charAt(i)=='{' ||str.charAt(i)=='[' ) {
				stack.push(str.charAt(i));
			}
			else if(str.charAt(i)==')' || str.charAt(i)=='}' ||str.charAt(i)==']') {
				if(stack.isEmpty()) {
					return false;
				}
					char top=(char)stack.pop();
					if(!ismatch(top,str.charAt(i))) {
						return false;
					}
			}
			}
		return stack.isEmpty();
	}
}

public class Parenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Check c=new Check();
		System.out.println(c.isValid("{(){}[][]}]["));
	}

}
