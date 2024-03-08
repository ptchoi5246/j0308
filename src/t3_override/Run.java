package t3_override;

public class Run {
	public static void main(String[] args) {
		Cc cc = new Cc();
		
		cc.areaCircle(50); //Cc가 Aa를 상속하고 있으니 Aa의 원넓이 구할 수 있다.
	}
}
