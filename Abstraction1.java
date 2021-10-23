abstract class Shape
{
	abstract void draw();
}
class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("implementimg the method from  shape in  rectangle");
	}
}

public class Abstraction1 {

	public static void main(String[] args) {
		Shape s=new Rectangle();
		s.draw();
		
	}

}
