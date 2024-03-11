package t11_interface6;

import java.util.Scanner;

public class ActorRun {
	public static void main(String[] args) {
		
		
		Actor actor = new Actor();
		actor.catching();
		actor.fire();
		actor.pizza();
		actor.save();
		actor.search();
		actor.spaghetti();
		System.out.println("=================================");
		
		
		Scanner sc = new Scanner(System.in);
		String[] titles = {"경찰관","소방관","요리사"}; //제목 찍기 - 배열
		
		int choice;
		while(true) {
		System.out.println("궁금한 직업을 선택하세요~!  ");
		System.out.print("1.경찰관 2.소방관 3.요리사 0.종료 ==>  ");
		choice = sc.nextInt();
		
		if(choice < 1 || choice > 3) {
			if(choice == 0) break;
			System.out.println("1,2,3번의 배역만 조회가 가능합니다.");
			continue; //다시 while로 보낸다
		}
		
		//각각의 역할을 출력
		System.out.println(titles[choice-1] + " 의 역할은?");
		
		switch(choice) {
			case 1:
				actor.catching();
				actor.search();
				break;
				
			case 2:
				actor.fire();
				actor.save();
				break;
				
			case 3:
				actor.pizza();
				actor.spaghetti();
				break;				
		}
		System.out.println("===========================================");
		}
		System.out.println("-------------------------------------------");
		System.out.println("각 배우의 역할을 충분히 연습해 오세요");			
			
		sc.close();
		
	}
}
