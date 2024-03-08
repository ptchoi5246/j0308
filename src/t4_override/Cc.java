package t4_override;

public class Cc extends Aa {

	//Cc가 Aa를 그대로 가져와서 수정 :: 오버라이드 ::자식이 우선
	//원넓이 계산 = 반지름 * 반지름 * pi
//	public void areaCircle(int r) {
//		double area = r * r * Math.PI;
//		System.out.println("반지름 "+r+"인 원넓이? " + area);
//	}
	
	@Override
	public void areaCircle(int r) {
		double area = r * r * Math.PI;
		System.out.println("반지름 "+r+"인 원넓이? " + area);
	}
	
	public void areaCircle2(int r) {
//		double area = r * r * Math.PI;
//		System.out.println("반지름 "+r+"인 원넓이? " + area);
		super.areaCircle(r);
	}

	
}
