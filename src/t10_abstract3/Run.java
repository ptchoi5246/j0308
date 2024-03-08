package t10_abstract3;

public class Run {
	public static void main(String[] args) {
		
		Phone samsungPhone = new Samsung("홍길동");
		samsungPhone.powerOn();
		samsungPhone.sound();
		samsungPhone.function();
		samsungPhone.functionSamsung(); //일반메소드 추가
		samsungPhone.powerOff();
		System.out.println();
		
		Phone LGPhone = new LG("김말숙");
		LGPhone.powerOn();
		LGPhone.sound();
		LGPhone.function();
		LGPhone.functionLG(); //일반메소드 추가
		LGPhone.powerOff();
		
	}
}
