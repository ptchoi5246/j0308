package t1_inheritance;

public class Run2 { //실행
	public static void main(String[] args) {
		
			
		D d = new D(); //클래스 D를 객체 d로 만들기
		System.out.print("4. ");
		d.areaRec(40, 50); //객체 d가 부모 A의 areaRec 불러서 입력값 넣어서 출력
		
		
//		b.areaPoly(10, 20, 5); //객체 b가 본인 B의 areaPoly 불러서 입력값 넣어서 출력
		d.areaPoly(10, 20, 5); //객체 d가 부모 B의 areaPoly 불러서 입력값 넣어서 출력
//		//클래스 D (객체d)는 B를 부모로 상속받기 때문에 d.areaPoly로 사용해도 된다.
		
	}
}
