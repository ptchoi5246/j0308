package t3_override;

public class Cc extends Aa {
	//Cc가 Aa를 그대로 가져와서 수정 :: override  오버라이드
	//원넓이 계산 = 반지름 * 반지름 * pi
//	public void areaCircle(int r) {
//		double area = r * r * Math.PI;
//		System.out.println("반지름 "+r+"인 원넓이? " + area);
//	}
	//부모 메소드로 가져와서 내껄로 재정의해서 사용 :: 오버라이드
	//정말로 많이 사용한다.
	//오버로딩 차이점 정리하기
	
//원넓이 계산 = 반지름 * 반지름 * pi
//	public void areaCircle(int r) {
//		double area = r * r * 3.14;
//		System.out.println("반지름 "+r+"인 원넓이? " + area);
//	}
	//오버라이드 맞다.
	//부모꺼를 그대로 가져와서 사용했다. = 선언부는 고치지 않고 내용만 고친다.
	
	//어쨌든 부모꺼를 가져오면 오버라이드
	
	//**선언부
	//오버로딩 선언부 리턴타입 관계 없음
	//오버라이드 선언부 리턴타입 관계 있다
	
//	public int areaCircle(int r) {
//		double area = r * r * 3.14;
//		System.out.println("반지름 "+r+"인 원넓이? " + area);
//		return area; //오버로딩 위반 ::*매개변수*가 차이가 있어야한다.
//	}//오버라이드 위반 :: 선언부 *리턴타입*이 변했기 때문에 = 선언부가 완전히 같아야한다.
	
	public void areaCircle2(int r) { //선언부가 다르기 때문에 오버라이드 아니다
		double area = r * r * 3.14;
		System.out.println("반지름 "+r+"인 원넓이? " + area);
	}
	
	
}
//선언부 접근제한자는 달라도 된다, 단 접근제한자가 더 폐쇄적으로 되면 안 된다.