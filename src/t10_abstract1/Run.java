package t10_abstract1;

public class Run {
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.sound();
		System.out.println();
		
		Cat cat = new Cat();
		cat.sori();
		System.out.println();
		
		Animal animalDog = new Dog();		
		animalDog.sound(); //오버라이드 먼저  멍멍
		//타입 일치
		Animal animalCat = new Cat();
		animalCat.sori(); //오버라이드 먼저 야옹
		//타입 일치
		
		
		
		
	}
}
