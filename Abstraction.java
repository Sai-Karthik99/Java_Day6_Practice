abstract class A
{
	abstract void demo();
}
class B extends A
{
	@Override
	void demo()
	{
		System.out.println("implementing method from class A in class B");
		
	}
}

public class Abstraction {
	
	public static void main(String[] args) {
		A a=new B();
		a.demo();
		
	}

}
