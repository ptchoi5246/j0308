package t7_polymorphism;
//down casting
public class Run {
	public static void main(String[] args) {
		
		Aa aa = new Aa();
		
		//Bb ab = (Bb)aa; //실행오류 //부모객체를 자식객체로 바로 Down Caasting 할 수는 없다.
		//부모는 자식이 누군지 모른다;
		//상속을 받는애 한테는 변환이 되는게 맞다.
		//자식 - 부모 - 자식
		//업 캐스팅 하면 다운캐스팅 된다.
		
		//Down Casting은 자식객체가 부모객체로 Up Casting 하였을 경우에만 다시 Down Casting 할 수 있다.
		
		Aa ba = new Bb(); //up casting
		Bb bb = (Bb)ba;
		System.out.println();
		
		
		Bb db = new Dd();
		Dd dd = (Dd)db;
		System.out.println();
		
//		Cc ec = new Ee();
//		Ee ee = (Ee)ec;
//		System.out.println();
//		
//		Aa eca = ec;
//		Cc ecac = (Cc)eca;
		
		Aa ea = new Ee();
		Ee eae = (Ee)ea;
		
		Cc eac = (Cc)ea;
		
		//업 캐스팅은 뭊건 된다
		//다운 캐스팅은 자식이 -> 부모 또는 조상 > 다시 내려올 수 있다.
		//
		
	}
}
// 타입변환 해설