package t11_interface4;

import java.util.Scanner;

/* 장난감 만드는 회사
   기능   곰돌이    로보트    비행기    탱크
	움직임    O        O       X       O
	레이저    X        X       O       O
	미사일    X        O       O       O
	연령대   전연령     4세~    8세~     13세~
	
	구매 어린이의 나이를 입력하여 구매 가능한 장난감을 표시해 주세요.
 */
public class ToyRun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //나이 입력
		
		//배열
		Toy[] toys = {new Bear(), new Robot(), new Airplane(), new Tank()}; //구현객체
		 //상속받는 interface Toy와 타입이 같다.
		String[] titles = {"곰돌이", "로보트", "비행기", "탱크"};
		int[] possible = new int[toys.length]; //사용 가능한 나이 [0,1,2,3]
		
		for(int i=0; i<toys.length; i++) {
			System.out.println("장난감 : " + titles[i]);	
			toys[i].moving();
			toys[i].fire();
			toys[i].misaile();
			toys[i].possibleAge();
			System.out.println();
			possible[i] = toys[i].possibleAge(); //사용연령 비교를 위함
		}
		System.out.println("==================================================");
		
		int age;
		System.out.println("현재 아이의 나이를 입력하세요~!  ");
		age = sc.nextInt(); //privage int age = 랑 비교
		
		System.out.println("구매 가능한 장난감은?  ");
		for(int i=0; i<titles.length; i++) {
			if(age >= possible[i] ) {
				System.out.print(titles[i] + " / ");
			}
		}
		
		System.out.println("\n감사합니다.");
		System.out.println();
		
		
		
		
		
		
		
		sc.close();
		
	}
}
