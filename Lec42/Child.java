package Lec42;

public class Child extends Parent{
	
	int y = 100;
	int d = 200;
	
	Child()
	{
		super(10);
	}
	
	
	void saysHello()
	{
		System.out.println("Child says Hello");
	}
	
	void saysHello1()
	{
		System.out.println("Child says Hello1");
	}
	
	@Override
	public String toString()
	{
		return this.y+" "+this.d+" Hello I am a Child";
	}
	
}
