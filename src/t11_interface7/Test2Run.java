package t11_interface7;
//실행 클래스
public class Test2Run {
	public static void main(String[] args) {
		//인터페이스 new 객체 생성 불가
		// new Test2(); //인터페이스를 생성하려면 익명 구현객체를 사용해서 가능하다.
		
		//익명 구현객체에 구현할 메소드를 만들어준다.
		Test2 t22 = new Test2() {
			int atom = 200;
			
			@Override
			public void abc(){ //메소드 만들기 //접근제한자 public 무조건! 생략할 경우 default로 기본으로 돼서 오류
				int temp = atom; ////인터페이스 변수로 접근 불가이다
				System.out.println("이곳은 Test2Run 클래스의 t22익명 객체 안의 abc()메소드 입니다.");
			}
		};
		
		Test2 t23 = new Test2() {
			public void abc(){ //메소드 만들기 //접근제한자 public 무조건! 생략할 경우 default로 기본으로 돼서 오류
				System.out.println("이곳은 Test2Run 클래스의 t23익명 객체 안의 abc()메소드 입니다.");
			}
		};
		
		//익명 객체 안의 메소드 호출하기
		t22.abc();
		//인터페이스 변수로 익명 객체 안의 필드와 일반 변수에 접근 불가이다.
//		System.out.println("atom : " + t22.atom());
//		System.out.println("temp : " + t22.atom().temp);
		t23.abc();
		
		if(t22 == t23) System.out.println("같은 객체를 가리킵니다."); //얕은 복사
		else System.out.println("서로 다른 객체를 가리킵니다."); //출력
	
	}
}	
