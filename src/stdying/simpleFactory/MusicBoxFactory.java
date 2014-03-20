package stdying.simpleFactory;

public class MusicBoxFactory {
	public static AbsMusicBox createMusicBox(String name)
			throws InstantiationException, IllegalAccessException,
			ClassNotFoundException {
		// 这边使用的是Java的Reflection机制来产生实例,要注意使用完整的包名
		// 不过客户端不用管啦
		// 以后就算改变了这边的程式，客户端程式是不用更改的
		return (AbsMusicBox) Class.forName(name).newInstance();
	}
}
