package t4_override;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Aa aa = new Aa(); //public final class Aa 생성은 된다. but 상속은 안된다.
		
		Cc cc = new Cc();
		
		//cc.areaCircle(50); //Cc가 Aa를 상속하고 있으니 Aa의 원넓이 구할 수 있다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.신라 2.백제?");
		int ans = sc.nextInt();
		
		System.out.println("반지름을 입력하세요. ");
		int r = sc.nextInt();
		
		if(ans == 1)cc.areaCircle(r); //pi
		else if (ans == 2) cc.areaCircle2(r); //3.14
		else System.out.println("코드를 다시 처리해 주세요.");
				
				
		
		
		
		
		sc.close();
		
				
	}
}
