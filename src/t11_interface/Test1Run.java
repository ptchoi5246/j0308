package t11_interface;

public class Test1Run {
	public static void main(String[] args) {
		//new Test1(); //인터페이스는 생성해서 사용할 수 없다.
		
//		Seoul seoul = new Seoul();
//		Busan busan = new Busan(); //인터페이스 구현 객체
		
		Test1 seoul = new Seoul();
		Test1 busan = new Busan(); //interface로 상속받았으니까 타입변환 가능 
		
	}
}
