package t2_inheritance;

public class Bb extends Aa {
	//필드 
	//상속을 가져와서 쓸 수 있다.
	//동작 메소드를 작성하면 오류
	int su = item1; //상속을 받지 않으면 int su = item1; == 오류 //item1을 선언 안 하고도 상속 받아서 부모껄로 사용 가능
	
	public Bb() {
		System.out.println("이곳은 Ba 클래스의 기본 생성자");
	}
	
	public Bb(int su) { //부모를 먼저 보고 본인 
		super(10); //공부하기 -> Aa(int item1) 출력 //위치:제일 첫번째 위치
		System.out.println("이곳은 Ba 클래스의  사용자 정의 생성자, su : " +su);
	}
	
	public Bb(int item1, int x, int y) {
		//Aa의 areaRec을 구하기 위해
		super(item1, x, y);
	}
	
//사다리꼴 면적 = (윗변 + 아래변) * 높이 /2
	public void areaPoly(int x, int y, int z) {
		int area = (x + y) * z / 2;
		System.out.println("사다리꼴의 면적(윗변 :"+x+", 아래변:"+y+", 높이: "+z+" ) : " + area);
	}
}
