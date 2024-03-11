package t11_interface4;

public class Bear implements Toy {
	private int age = 0;

	@Override
	public void age() {
		System.out.println("모든 연령대가 다 사용할 수 있습니다.");
	}

	@Override
	public void moving() {
		System.out.println("팔, 다리를 움직일 수 있습니다.");
	}

	@Override
	public void fire() {} //기능 없으니까 중괄호 실행 블럭 닫기

	@Override
	public void misaile() {} //기능 없으니까 중괄호 실행 블럭 닫기

	@Override
	public int possibleAge() { //일종의 age getter
		return age; 
	}

}
