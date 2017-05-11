package stdying.Singleton;

public class Singleton1 {
	private Singleton1(){};
	
	//private 只供内部使用
	private static Singleton1 instance = new Singleton1();
	
	//提供一个供外部访问本class的静态方法
	public static Singleton1 getInstance(){
		return instance;
	}
}
