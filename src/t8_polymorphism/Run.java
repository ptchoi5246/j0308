package t8_polymorphism;

public class Run {
	public static void main(String[] args) {
		Bb bb = new Bb();
		System.out.println();
		
		System.out.println("bb. su : " + bb.su); //su : int Bb
		bb.modBb();
		bb.modAa();
		System.out.println();
		
		//오버라이딩 출력 이해 안됨
		
		/*--------Up Casting-------------*/
		
		Aa ba = new Bb();
		ba.modAa(); //su : int Aa //본인(자식)Bb은 안 나오고 부모Aa만 나온다.
		System.out.println();
		
		/*--------Down Casting-------------*/
		//부모로 업캐스팅이 되어 있을 경우에만 자신으로 다운캐스팅 할 수 있다. //수정하기
		
		Bb bab= (Bb)ba;
		bab.modAa(); //su : int Bb //
		System.out.println();
		
		/*---------------------------------*/
		Aa ca = new Cc();
		ca.modAa(); //up casting 부모가 된다.		
		ca.modCc();
		ca.modHH(50, 100);
		
		
		
		
		
		
	}
}

//객체가 변하고 싶을 때 up down 캐스팅
//자식 = 자식, 부모
//자식 = 부모 = 업캐스팅
//자식 = 자식 : 업캐스팅 -> 다운캐스팅
//업캐스팅 + 오버라이딩 = 부모가 자식꺼를 쓰고 싶어서
