package stdying.Singleton;

public class Singleton1 {
	private Singleton1(){};
	
	//private ֻ���ڲ�ʹ��
	private static Singleton1 instance = new Singleton1();
	
	//�ṩһ�����ⲿ���ʱ�class�ľ�̬����
	public static Singleton1 getInstance(){
		return instance;
	}
}
