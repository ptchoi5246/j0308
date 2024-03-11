package t10_abstractEx;

public class BunsikRun2 {
	public static void main(String[] args) {
		//클래스
//		WangjaBunsik wangjaBunsik = new WangjaBunsik();
//		SeoulBunsik seoulBunsik = new SeoulBunsik();
//		WoojuBunsik woojuBunsik = new WoojuBunsik();
		
		//업캐스팅
//		Bonsa wangjaBunsik = new WangjaBunsik();
//		Bonsa seoulBunsik = new SeoulBunsik();
//		Bonsa woojuBunsik = new WoojuBunsik();
		
		//타입이 같아서 배열로 출력		
		Bonsa[] bonsas = {new WangjaBunsik(), new SeoulBunsik(), new WoojuBunsik()};
		
		//반복문
		for(int i=0; i<bonsas.length; i++) {
			bonsas[i].getShopName();
			bonsas[i].kimchi();
			bonsas[i].budae();
			bonsas[i].bibim();
			bonsas[i].sundae();
			bonsas[i].konggi();
			System.out.println("=========================================");
		}
		
		/*
		wangjaBunsik.getShopName();
		wangjaBunsik.kimchi();
		wangjaBunsik.budae();
		wangjaBunsik.bibim();
		wangjaBunsik.sundae();
		wangjaBunsik.konggi();
		System.out.println("=========================================");
		System.out.println();
		
		seoulBunsik.getShopName();
		seoulBunsik.kimchi();
		seoulBunsik.budae();
		seoulBunsik.bibim();
		seoulBunsik.sundae();
		seoulBunsik.konggi();
		System.out.println("=========================================");
		System.out.println();
		
		woojuBunsik.getShopName();
		woojuBunsik.kimchi();
		woojuBunsik.budae();
		woojuBunsik.bibim();
		woojuBunsik.sundae();
		woojuBunsik.konggi();
		System.out.println("=========================================");
		System.out.println();
		*/		
	}
}
