package t5_protected.mbc;

import t5_protected.kbs.Aa;

public class Bb extends Aa { //Aa를 상속받다 - 에러, 같은 패키지 안에 있지 않다.
//다른 패키지 상속 : 1. import

	//필드 접근자
	public int a2 = 10;
	protected int b = 20;
	int c2 = 30;
	private  int d2 = 40;
	
	//메소드 접근자
	public void modA2() {
		System.out.println("이곳은 Bb클래스의 modA 메소드 입니다.");
	}
	protected void modB2() {
		System.out.println("이곳은 Bb클래스의 modB 메소드 입니다.");
	}
	void modC2() {
		System.out.println("이곳은 Bb클래스의 modC 메소드 입니다.");
	}
	private void modD2() {
		System.out.println("이곳은 Bb클래스의 modD 메소드 입니다.");
	}
	@Override
	public void test() {
		modC();
		a = 100;
		b = 200; //Bb 필드 b를 주석처리 해야 가능하다
		// c = 300; default
		// d = 400; private 
		int d = getD(); //private d라서 게터D로 접근
		System.out.println("d" + d);
		
	}
}
