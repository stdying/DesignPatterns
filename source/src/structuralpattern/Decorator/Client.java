package structuralpattern.Decorator;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Component component,componentSB,ComponentBB;  //使用抽象构件定义
		component = new Window();		//定义具体构件
		
		componentSB = new ScrollBarDecorator(component);		//定义装饰后的构件
		
		ComponentBB = new BlackBorderDecorator(componentSB); 	//将装饰后的对象注入另一个装饰类中，进行二次装饰
		
		componentSB.display();
		ComponentBB.display();
	}

}
