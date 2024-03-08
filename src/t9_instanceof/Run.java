package t9_instanceof;
//instance of : Down Casting을 할 때 Up Casting이 되었나 확인할 때 사용
//(객체명 instanceof 타입명)
public class Run {
	public static void main(String[] args) {
		
		Aa aa = new Bb(); //Up Casting - Down Casting 된다.
		
		//Aa aa = new Aa(); //Down Casting 불가 :: Up Casting을 안 했기 때문에
		
		//aa객체가 과거에 Aa 타입으로 Up Casting 했었는지를 알아보고 처리한다.
		if(aa instanceof Bb) { //객체명 instanceof 타입명
			Bb bb = (Bb)aa; //강제 Down Casting // 에러 :: Up Casting 진행이 안 됐기 때문에
			System.out.println("Down Casting 성공");
		} 
		else {
			System.out.println("Down Casting 불가");
		}
	}
}
