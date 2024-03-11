package t11_interface3;

public class RemoteRun {
	public static void main(String[] args) {
		Product product = new Product();
		
		product.remoteName("TV");
		product.switchOn("TV");
		product.setVoulume(5);
		product.setVoulume(15);
		product.setVoulume(-5);
		product.switchOff("TV");
		System.out.println("===============================");
		System.out.println();
		
		product.remoteName("Audio");
		product.switchOn("Audio");
		product.setVoulume(8);
		product.setVoulume(19);
		product.setVoulume(-2);
		product.switchOff("Audio");
		System.out.println();
		
	}
}
