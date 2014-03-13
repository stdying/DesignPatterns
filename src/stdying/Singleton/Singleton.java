package stdying.Singleton;

public class Singleton {
	private Singleton(){};
	
	//private ֻ���ڲ�ʹ��
	private static Singleton instance = new Singleton();
	
	//�ṩһ�����ⲿ���ʱ�class�ľ�̬����
	public static Singleton getInstance(){
		return instance;
	}
}
