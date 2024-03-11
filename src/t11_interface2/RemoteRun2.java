package t11_interface2;

public class RemoteRun2 { //배열 사용
	public static void main(String[] args) {
		
//		Remote audio = new Audio(); //up casting
//		Remote tv = new Tv(); //up casting
		
		//타입 같으니까 배열 가능
		
		Remote[] remotes = {new Audio(), new Tv()};
		String[] titles = {"Audio", "TV"};
		
		for(int i=0; i<remotes.length; i++) {
			remotes[i].switchOn();
			remotes[i].remoteName(titles[i]);
			remotes[i].switchOff();
			System.out.println();
		}
		
		/*
		audio.switchOn();
		audio.remoteName("Audio");
		audio.switchOff();
		System.out.println();
		
		tv.switchOn();
		tv.remoteName("Tv");
		tv.switchOff();
		*/
		
	}
}
