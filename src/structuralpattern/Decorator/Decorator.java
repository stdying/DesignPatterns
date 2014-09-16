package structuralpattern.Decorator;

/**
 * 构建装饰类
 * @author Administrator
 *
 */
public abstract class Decorator extends Component{

	private Component component;	//维持对抽象构建类型对象的引用
	
	//注入抽象构建类型的对象
	public Decorator(Component component){
		this.component = component;
	}
	
	@Override
	public void display() {
		
		this.component.display();	//调用原有业务方法
	}

}
