package t1_inheritance;

public class A { //부모	
	//필드
	private int item1 = 500; //private : 다른 클래스에서 부를 수 없다.
	int item2 = 600;
	
	//사각형의 면적 = 가로 * 세로 //메소드
	public void areaRec(int x, int y) {//void 리턴타입 없음; 여기서 출력하고 끝낸다.
		int area = x * y;
		System.out.println("사각형의 면적(가로 :"+x+", 세로:"+y+" ) : " + area);
		
	}
}
