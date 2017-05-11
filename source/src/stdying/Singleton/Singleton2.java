package stdying.Singleton;

public class Singleton2 {
	private static Singleton2 instance = null;
	
	
	public static Singleton2 getInstance1(){
		if(instance == null){
			instance = new Singleton2();
		}
		return instance;
	}
	
	//synchronized ����Ҫ�����û�п��ܲ������ʵ��
	public static synchronized Singleton2 getInstance2(){
		if(instance == null){
			instance = new Singleton2();
		}
		return instance;
	}
	
	//���ڶ��̵߳ĳ�������Ĵ��ڲ��㣬Ӱ��Ч�ʣ�Ϊ��ӦЧ�ʺ�ʹ��Lazy Initilazition������ʹ��Double-check LOcking
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









