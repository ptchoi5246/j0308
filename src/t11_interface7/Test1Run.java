package t11_interface7;

interface Aa{
	//상수 필드
	public static int AA = 10;
	//추상 메소드
	public abstract void abc(); //선언만	
}

class Bb implements Aa {
	@Override //오버라이드
	public void abc() {
		System.out.println("Bb 클래스의 abc() 메소드");
	}	
}
class Cc implements Aa {
	@Override //오버라이드
	public void abc() {
		System.out.println("Cc 클래스의 abc() 메소드");
	}	
}

public class Test1Run { //실행 클래스
	public static void main(String[] args) {
//		Bb b1 = new Bb();
//		Bb b2 = new Bb();
//		Cc c1 = new Cc();
//		Cc c2 = new Cc();
		//구현 객체 생성
		Aa b1 = new Bb(); //up casting
		Aa b2 = new Bb(); //up casting
		Aa c1 = new Cc(); //up casting
		Aa c2 = new Cc(); //up casting
		
		//구현 객체 안의 메소드 호출
		b1.abc();
		b2.abc();
		c1.abc();
		c2.abc();
		
		
	}
}
//하나의 클래스 안에 인터페이스, 구현 객체까지 다 들어갈 수 있다.
