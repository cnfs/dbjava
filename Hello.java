package helloworld;

public class Hello {

	public static void main(String args[])
	{
		System.out.println("hello");
		Calci c=new Calci();
		c.add(4, 5);
		c.mul(4, 5);
		c.div(6,4);
		c.sub(5, 4);
	}
}
