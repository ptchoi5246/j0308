package t1_inheritance;

public class Run { //실행
	public static void main(String[] args) {
		A a = new A(); //클래스 A를 객체 a로 만들기
		System.out.print("1. ");
		a.areaRec(10, 20); // 객체 a가 본인 A의 areaRec 불러서 입력값 넣어서 출력
		
		B b = new B(); //클래스 B를 객체 b로 만들기
		System.out.print("2. ");
		b.areaRec(20, 30); //객체 b가 부모 A의 areaRec 불러서 입력값 넣어서 출력
		
		C c = new C(); //클래스 C를 객체 c로 만들기
		System.out.print("3. ");
		c.areaRec(30, 40); //객체 c가 부모 A의 areaRec 불러서 입력값 넣어서 출력
		
		D d = new D(); //클래스 D를 객체 d로 만들기
		System.out.print("4. ");
		d.areaRec(40, 50); //객체 d가 부모 A의 areaRec 불러서 입력값 넣어서 출력
		
		E e = new E(); //클래스 E를 객체 e로 만들기
		System.out.print("5. ");
		e.areaRec(50, 60); //객체 e가 부모 A의 areaRec 불러서 입력값 넣어서 출력
		System.out.println();
		
		b.areaPoly(10, 20, 5); //객체 b가 본인 B의 areaPoly 불러서 입력값 넣어서 출력
		d.areaPoly(10, 20, 5); //객체 d가 부모 D의 areaPoly 불러서 입력값 넣어서 출력
		//클래스 D (객체d)는 B를 부모로 상속받기 때문에 d.areaPoly로 사용해도 된다.
		
	}
}
