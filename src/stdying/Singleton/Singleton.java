package stdying.Singleton;

public class Singleton {
	private Singleton(){};
	
	//private 只供内部使用
	private static Singleton instance = new Singleton();
	
	//提供一个供外部访问本class的静态方法
	public static Singleton getInstance(){
		return instance;
	}
}
