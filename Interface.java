interface A1
{
	  int a=10;
	  static void sheela()
	  {
		  System.out.println("this from sheela method");
	  }
}
interface B1
{
	
	static void laila()
	{
		System.out.println("this from laila class");
	}
	
}
class implementating implements A1,B1
{
	
}
public class Interface {

	public static void main(String[] args) {
		implementating i=new implementating();
		A1.sheela();

	}

}
