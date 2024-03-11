package t11_interface2;

public class AudioRun { //Audio에서 사용하는 Remote
	public static void main(String[] args) {
	
		Audio audio = new Audio();
		
		System.out.println("Audio 최대 볼륨 : " + audio.MAX_VOLUME);
		System.out.println("Audio 최소 볼륨 : " + audio.MIN_VOLUME);
		System.out.println();
		
		audio.switchOn();
		audio.remoteName("Audio");
		audio.switchOff();
		
	}
}
