package t11_interface2;
//구현 객체
public class Tv implements Remote { //Tv는 Remote라는 인터페이스를 상속, Tv는 Remote를 implement 받으세요

	@Override
	public void switchOn() {
		System.out.println("TV 전원을 켭니다.");
	}

	@Override
	public void switchOff() {
		System.out.println("TV 전원을 끕니다.");
	}

	@Override
	public void remoteName(String name) {
		System.out.println(name + " 리모콘");
	}

}
