package t10_abstractEx;
//추상클래스 - 우두머리 작업지시서
public abstract class Bonsa {
	//필드 //가격을 계산해야해서 int
	public String shopName;
	public int kimchi; //김치찌개
	public int budae; //부대찌개
	public int bibim; //비빔밥
	public int sundae; //순대국
	public int konggi; //공기밥
		
	//생성자
	public Bonsa(String shopName, int kimchi, int budae, int bibim, int sundae, int konggi) {
		this.shopName = shopName;
		this.kimchi = kimchi;
		this.budae = budae;
		this.bibim = bibim;
		this.sundae = sundae;
		this.konggi = konggi;
	}
	//추상 메소드 - 중괄호 생략
	public abstract void kimchi();
	public abstract void budae();
	public abstract void bibim();
	public abstract void sundae();
	public abstract void konggi();
	
	//일반 메소드
	public void getShopName() { //getter 받아서 출력
		System.out.println("점포명 : " + shopName); //유효성 검사
		
	}
}
