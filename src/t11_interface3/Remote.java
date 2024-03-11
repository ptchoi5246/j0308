package t11_interface3;
//리모컨을 만들어서 tv도 사용하고 라디오도 사용
public interface Remote { //인터페이스 - 값을 바꿀 수 없다. :: 상수
	//상수필드 - public static final
	public static final int  MAX_VOLUME = 10; //초기값 변경 불가
	int MIN_VOLUME = 0; //5번 6번 같다. 6번에 public static final 생략
	
	//추상메소드
	public abstract void switchOn(String name); //중괄호 블록 없음 = 실행 블록 없다
	void switchOff(String name); //9번 10번 같다. pulbic abstract 생략
	
	void remoteName(String name); //public abstract 생략
	void setVoulume(int volume);
	
}
