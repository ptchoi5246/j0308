package t11_interface2;
//구현 객체
public class Audio implements Remote { //Audio는 Remote 인터페이스를 상속 , Audio는 Remote를 implement 받으세요

	@Override
	public void switchOn() {
		System.out.println("Audio 전원을 켭니다.");
	}

	@Override
	public void switchOff() {
		System.out.println("Audio 전원을 끕니다.");
	}

	@Override
	public void remoteName(String name) {
		System.out.println(name + " 리모콘");
	}

}
