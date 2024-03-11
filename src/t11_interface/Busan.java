package t11_interface;
// 구현객체
public class Busan implements Test1 { //클래스인지 인터페이스인지 구별하기
	//상속 extends - 추상클래스 / implements - 인터페이스
	int min;
	
//추상 메소드
	@Override
	public void data() {
		System.out.println("이곳은 Busan 클래스의 data 메소드 입니다.");
	}

	@Override
	public void data1(int su) {
		if(su < MIN) min = su;
		else min = MIN;
		System.out.println("최소값 : " + min);
	}

	@Override
	public void data2() {
		System.out.println("이곳은 Busan 클래스의 data2 메소드 입니다.");
	}

}
