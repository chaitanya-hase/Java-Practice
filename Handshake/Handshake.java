package com.Handshake;

class Hands{
	public int shake(int p) {
		if(p==0) {
			return 0;
		}
		//return p-1+shake(p-1);
		return (p*(p-1))/2;
	}
	
}

public class Handshake {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hands h=new Hands();
		System.out.println(h.shake(5));
		System.out.println(h.shake(25));
		System.out.println(h.shake(0));
	}

}
