package stdying.simpleFactory;

public class MusicBoxFactory {
	public static AbsMusicBox createMusicBox(String name)
			throws InstantiationException, IllegalAccessException,
			ClassNotFoundException {
		// ���ʹ�õ���Java��Reflection����������ʵ��,Ҫע��ʹ�������İ���
		// �����ͻ��˲��ù���
		// �Ժ����ı�����ߵĳ�ʽ���ͻ��˳�ʽ�ǲ��ø��ĵ�
		return (AbsMusicBox) Class.forName(name).newInstance();
	}
}
