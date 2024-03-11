package t11_interface4;

public class Robot implements Toy {
	private int age = 4;

	@Override
	public void age() {
		System.out.println(age + "세 이상 사용 가능합니다.");
	}

	@Override
	public void moving() {
		System.out.println("팔, 다리를 움직일 수 있습니다.");
	}

	@Override
	public void fire() {} //기능 없으니까 중괄호 실행 블럭 닫기

	@Override
	public void misaile() {
		System.out.println("미사일 발사 기능이 있습니다.");
	} 

	@Override
	public int possibleAge() { //일종의 age getter
		return age; 
	}

}
