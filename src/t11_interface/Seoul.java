package t11_interface;
//인터페이스의 실질적인 내용을 넣겟다 - 구현 클래스, 실체 클래스
public class Seoul implements Test1{
	int max;
	//추상 메소드만 구현 : 실행블록이 없어서 무조건 실행할 내용 입력
	@Override //오버라이드
	public void data() {
		System.out.println("이곳은 Seoul 클래스의 data 메소드");
	}

	@Override
	public void data2() {
		System.out.println("이곳은 Seoul 클래스의 data2 메소드");		
	}

	@Override
	public void data1(int su) {
		if(su > MAX) max = su;
		else max = MAX;
		System.out.println("최대값 : " + max);
		
	}
	

}
