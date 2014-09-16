package structuralpattern.Decorator;

public class BlackBorderDecorator extends Decorator{

	public BlackBorderDecorator(Component component) {
		super(component);

	}

	public void display(){
		this.setBlackBorder();
		super.display();
	}
	
	public void setBlackBorder(){
		System.out.println("为构件增加黑色边框....");
	}
}
