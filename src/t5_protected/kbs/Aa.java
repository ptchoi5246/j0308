package t5_protected.kbs;

public class Aa {
	//필드 접근자
	public int a = 10;
	protected int b = 20;
	//int b = 20;
	int c = 30;
	private  int d = 40; //게터 세터 만들기
	
	

	//메소드 접근자
	public void modA() {
		System.out.println("이곳은 Aa클래스의 modA 메소드 입니다.");
	}
	protected void modB() {
		System.out.println("이곳은 Aa클래스의 modB 메소드 입니다.");
	}
	public void modC() {
		System.out.println("이곳은 Aa클래스의 modC 메소드 입니다.");
	}
	private void modD() {
		System.out.println("이곳은 Aa클래스의 modD 메소드 입니다.");
	}
	
	public void test() { //같은 패키지 안에서 상속 가능
		modD();
	}	
	//void test() { //같은 패키지 안에서 상속 가능
	//		modD();
	//}
	
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
	
	
	
	
	
	
}

//소스확인
