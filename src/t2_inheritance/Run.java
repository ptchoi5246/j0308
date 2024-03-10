package t2_inheritance;

public class Run { //클래스 = 스레드
	public static void main(String[] args) {
		System.out.println("이곳은 Run클래스 입니다.");
		
		Bb bb1 = new Bb(); //Bb 생성하면 Aa도 같이 생성된다.
		//부모가 있어야지 자식이 생성된다.
		//순서 : Aa가 먼저 실행되고 Bb가 생성된다.
		//젤 윗대가리부터 먼저 생성하고 밑으로 쭉쭉 내려온다.
		//기본 생성자만 실행이 된다.
		//()매개변수를 넣어서 부르면 매개변수가 들어간 걸 부른다.
		//Aa 기본생성자
		bb1.areaRec(10, 20); //Aa의 areaRec
		bb1.areaPoly(1, 2, 3); //Bb의 areaPoly
		System.out.println();
		
		
		Bb bb2 = new Bb(10);
		bb2.areaPoly(2, 3, 4);		
		System.out.println();
		
		Bb bb3 = new Bb(10,20,30);
		System.out.println();
		
		
		
		System.out.println("2. 이곳은 Run클래스 입니다.");
		
		//같은 클래스에 있으니까 기본 생성자, 사용자정의 생성자 다 사용할 수 있다.
		//어떤 생성자로 해도 관계가 없다.
		
		
		//공부해서 정리하기
		
		//
		
	}
}
