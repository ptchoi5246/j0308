package t11_interface7;

interface Aa2{
	static void abc() {
		System.out.println("여기는 Aa2 인터페이스의 정적 메소드 abc()이다.");
	}
}

public class Test3Run {
	public static void main(String[] args) {
		//정적 메소드 호출 :: 클래스이름. //static 객체 생성 불가 -> 클래스이름. 호출
		Aa2.abc();
	}
}
