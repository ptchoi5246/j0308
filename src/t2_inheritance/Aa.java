package t2_inheritance;

public class Aa {
	//필드
	int item1 = 500;
	int item2 = 600;
	
	//생성자
	public Aa() { //기본 생성자
		System.out.println("이곳은 Aa 클래스의 기본 생성자");
	}
	
	public Aa(int item1) { //사용자 정의 생성자1 (매계변수 1개)
		this.item1 = item1; //this. 필드 호출
		System.out.println("이곳은 Aa 클래스의 사용자 정의 생성자1");
	}	
	
	public Aa(int item1, int x, int y) { //사용자 정의 생성자 (매계변수 3개)
		this.item1 = item1;
		System.out.println("이곳은 Aa 클래스의 사용자 정의 생성자2, item1");
		areaRec(x, y);
	}	
	
	//필드 void : 리턴 값 없음 / instance : 기본, 생략가능 / static : 정적
	//사각형의 면적
	public void areaRec(int x, int y) {
		int area = x * y;
		System.out.println("사각형의 면적(가로:"+x+", 세로:"+y+") : " + area);
	}		
	
}

//class에 private 쓰면 상속 불가
//필드나 메소드에 private 적으면 상속은 가능하지만 가져다 쓸 순 없다.