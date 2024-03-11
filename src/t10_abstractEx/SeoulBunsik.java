package t10_abstractEx;

public class SeoulBunsik extends Bonsa {

//	public SeoulBunsik(String shopName, int kimchi, int budae, int bibim, int sundae, int konggi) {
//		super(shopName, kimchi, budae, bibim, sundae, konggi);
//	}
	public SeoulBunsik() {
		super("서울분식", 5000, 5000, 5000, 4000, 0);
	}

	@Override
	public void kimchi() {
		System.out.println("김치찌게 : " + kimchi);
	}

	@Override
	public void budae() {
		System.out.println("부대찌게 : " + budae);
	}

	@Override
	public void bibim() {
		System.out.println("비빔밥 : " + bibim);
	}

	@Override
	public void sundae() {
		System.out.println("순대국 : " + sundae);
	}

	@Override
	public void konggi() {
		System.out.println("공기밥 : " + konggi);
	}

}
