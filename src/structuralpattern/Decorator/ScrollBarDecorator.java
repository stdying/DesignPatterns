package structuralpattern.Decorator;
/**
 * 滚动条装饰类：具体装饰类
 * @author Administrator
 *
 */
public class ScrollBarDecorator extends Decorator{

	public ScrollBarDecorator(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}

	public void display(){
		this.setScrollBar();	//新增业务方法
		super.display();		//原有业务方法
	}
	
	public void setScrollBar(){
		System.out.println("为构件增加滚动条...");
	}
}
