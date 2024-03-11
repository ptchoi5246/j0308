package t11_interface;

public interface Test1 { //ctrl + interface - Implementation 구현하고 있는 클래스 볼 수 있다.
	//필드
	//int max = 1000000;
	int MAX = 1000000; //인터페이스에서 사용할 때는 대문자 사용- 상수개념
	public static final int MIN = 0; //상수개념 public static final 생략 - 대문자 사용 //쓸려면 제대로 쓰기, 안 쓰면 컴파일러가 알아서 해줌
	
	
	//메소드
	void data();
	void data1(int su); //추상 메소드 :: 중괄호 블럭이 없다 - 실행 블럭이 없다. - 누군가가 실행 블럭을 써줘야한다. //주로 많이 사용
	public abstract void data2(); //추상 메소드 :: 중괄호 블럭이 없다 - 실행 블럭이 없다. - 누군가가 실행 블럭을 써줘야한다.
	
	default void data3() { //일반 메소드 - 중괄호 블럭 무조건! 실행 블럭 있다 - 가져가서 오버라이드해서 사용
	//실행할 내용을 포함 / 생략
		System.out.println("이곳은 data3 메소드(default)");
	}
	
	static void data4() { //정적 메소드 - 중괄호 블럭 무조건! 실행 블록 있다. 
	//실행할 내용을 포함
		System.out.println("이곳은 data4 메소드(static)");
	}	
}

//Test1의 구현객체는 Seoul 과 Busan이다.
//Seould Busan 클래스의 어떤 부모를 상속받고 있느냐?
//interface - implements / class - extends
