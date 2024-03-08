package t4_override;

//public final class Aa { //부모	
public class Aa { //부모	
	//필드
	private int item1 = 500; //private : 다른 클래스에서 부를 수 없다.
	int item2 = 600;
	
	//사각형의 면적 = 가로 * 세로 //메소드
	public void areaRec(int x, int y) {//void 리턴타입 없음; 여기서 출력하고 끝낸다.
		int area = x * y;
		System.out.println("사각형의 면적(가로 :"+x+", 세로:"+y+" ) : " + area);		
	}
	
	//원넓이 계산 = 반지름 * 반지름 * pi
	public void areaCircle(int r) {
	//public final void areaCircle(int r) { //final 사용하면 메소드 오버라이드(재정의)해서 사용할 수 없다.
		double area = r * r * 3.14;
		System.out.println("반지름 "+r+"인 원넓이? " + area);
	}	
}
