package stdying.Singleton;

public class Singleton2 {
	private static Singleton2 instance = null;
	
	
	public static Singleton2 getInstance1(){
		if(instance == null){
			instance = new Singleton2();
		}
		return instance;
	}
	
	//synchronized 很重要，如果没有可能产生多个实例
	public static synchronized Singleton2 getInstance2(){
		if(instance == null){
			instance = new Singleton2();
		}
		return instance;
	}
	
	//对于多线程的程序，上面的存在不足，影响效率，为不应效率和使用Lazy Initilazition，可以使用Double-check LOcking
	public static Singleton2 getInstance3(){
		if(instance == null){
			synchronized(Singleton2.class){
				if(instance == null){
					instance = new Singleton2();
				}
			}
		}
		return instance;
	}
	
}









