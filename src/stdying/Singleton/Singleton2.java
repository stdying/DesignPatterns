package stdying.Singleton;

public class Singleton2 {
	private static Singleton2 instance = null;
	
	//synchronized ����Ҫ�����û�п��ܲ������ʵ��
	public static synchronized Singleton2 getInstance(){
		if(instance == null){
			instance = new Singleton2();
		}
		return instance;
	}
}
