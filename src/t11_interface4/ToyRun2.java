package t11_interface4;

import java.util.Scanner;

/* 장난감 만드는 회사
   기능   곰돌이    로보트    비행기    탱크
	움직임    O        O       X       O
	레이저    X        X       O       O
	미사일    X        O       O       O
	연령대   전연령     4세~    8세~     13세~
	
	장난감 목록을 표시해주고 해당 장난감의 기능을 보여주세요.
	ex) 어떤 장난감 구매를 희망하십니까?
	1. 곰돌이 2. 로보트 3. 비행기 4. 탱크 0.종료 ==>1
	곰돌이는 팔, 다리를 움직일 수 있습니다.
	모든 연령대가 다 사용하실 수 있습니다.
	
	구매를 희망하십니까?(Y/N) ==>
	Y. 곰돌이 구매가 완료되었습니다.
	N. 다음에 또 이용해 주세요. 감사합니다.
 */
public class ToyRun2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //장난감 번호 입력

		//배열
		Toy[] toys = {new Bear(), new Robot(), new Airplane(), new Tank()}; //구현객체
		 //상속받는 interface Toy와 타입이 같다.
		String[] titles = {"곰돌이", "로보트", "비행기", "탱크"};

		int choice;
		
		while(true) {
			System.out.println("\n어떤 장난감 구매를 희망하십니까?  ");
			System.out.println("1.곰돌이 2.로보트 3.비행기 4.탱크 0.종료");
			choice = sc.nextInt(); //장난감 번호
			
			if(choice == 0) break;
			
			System.out.println(" * 장난감 이름 : " + titles[choice-1] + " *");
			toys[choice-1].moving();
			toys[choice-1].fire();
			toys[choice-1].misaile();
			toys[choice-1].age();
			
			System.out.println("해당 장난감을 구매하시겠습니까?  Y.네 / N. 아니오");
			String ans = sc.next().toUpperCase();
			
			if(ans.equals("N")) {
				System.out.print("다음에 또 이용해 주세요.");
				break;				
			}
			else System.out.println(titles[choice-1] + " 구매가 확정되었습니다.");				
		}
		System.out.println("감사합니다.");				
		sc.close();
	}
}
