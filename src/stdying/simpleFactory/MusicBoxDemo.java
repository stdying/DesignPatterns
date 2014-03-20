package stdying.simpleFactory;

public class MusicBoxDemo {
	public static void main(String[] args) throws Exception {

		AbsMusicBox box1 = MusicBoxFactory
				.createMusicBox("stdying.simpleFactory.PianoBox");
		AbsMusicBox box2 = MusicBoxFactory
				.createMusicBox("stdying.simpleFactory.ViolinBox");
		box1.play();
		box2.play();

	}

}