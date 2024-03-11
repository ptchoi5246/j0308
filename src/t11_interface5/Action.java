package t11_interface5;

public interface Action {

	//추상 메소드 - 실행블록 없어야 한다.
	
	//경찰관(범인잡기, 물건찾기) //public abstract 생략
	void catching();
	void search();
	
	//소방관(불 끄기, 인명구조)
	void fire();
	void save();
	
	//요리사(피자, 스파게티를 만든다)
	void pizza();
	void spaghetti();
	
	//역할명 //실행블록 없어야 하는데 있으니까 default 작성
	default void action(String action) {
		System.out.println(action + " 역할?");
	}
}
