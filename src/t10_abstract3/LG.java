package t10_abstract3;

public class LG extends Phone {

	public LG(String name) {
		super(name + "(LG)");
	}

	@Override //작업지시서
	public void function() {
		System.out.println(getName() + "폰은 화질이 우수합니다.");
	}

	@Override //작업지시서
	public void sound() {
		System.out.println(getName() + "폰의 전화벨 소리는 띠리리링~ 입니다.");
	}
	
	//일반메소드
	public void functionLG() {
		System.out.println("이번에 새로 추가된 기능은 '만보기'가 있습니다.");
	}

}
