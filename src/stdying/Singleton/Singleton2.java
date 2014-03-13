package stdying.Singleton;

public class Singleton2 {
	private static Singleton2 instance = null;
	
	//synchronized 很重要，如果没有可能产生多个实例
	public static synchronized Singleton2 getInstance(){
		if(instance == null){
			instance = new Singleton2();
		}
		return instance;
	}
}
