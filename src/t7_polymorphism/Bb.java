package t7_polymorphism;

public class Bb extends Aa{
	
	public int su = 200;
		
	//생성자
	public Bb() {
		System.out.println("이곳은 Bb 기본 생성자 입니다.");		
	}
	
	public void modBb() {
		System.out.println("이곳은 Bb 클래스의 modBb 메소드 입니다.");
	}	
}
