package JumpGame;

class Reach{
	public boolean check(int[] jump) {
		int finall=jump.length-1;
		for(int i=jump.length-2;i>=0;i--) {
			
			if(i+jump[i]>=finall) {
				finall=i;
			}
			
		}
		
		return finall==0?true:false;
	}
}

public class JumpGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reach r=new Reach();
		int[]A= {2,2,1,1,2,5};
		System.out.println( r.check(A));
	}

}
