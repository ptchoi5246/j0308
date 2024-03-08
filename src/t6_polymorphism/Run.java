package t6_polymorphism;
//up casting
public class Run {
	public static void main(String[] args) {
		
		Aa aa = new Aa();
		System.out.println();
		
		Bb bb = new Bb();
		Aa ba = bb; //bb 타입변환		//#1
		Aa ba2 = new Bb(); //#2
		System.out.println();
		
		Cc cc = new Cc();
		Aa ca = cc;
		Aa ca2 = new Cc();
		System.out.println();
		
		Dd dd = new Dd();
		Bb db = new Dd(); //부모 up Casting
		Aa da = new Dd(); //조상 
		System.out.println();
		
		Ee ee = new Ee();
		Cc ec = new Ee(); //부모
		Aa ea = new Ee(); //조상
		System.out.println();
		
		//자식 -> 부모 up Casting
	}
}
// 타입변환 해설