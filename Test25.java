abstract class A
{
	abstract void m1();
	abstract void m3();
	void m2()
	{
		System.out.println("Hello");
	}
}
abstract class B extends A
{
	void m1()
	{
		System.out.println("swathi");
	}
}
class C extends B
{
	void m3()
	{
		System.out.println("siri");
	}
}
class Test25
{
	public static void main(String[]args)
	{
		C c = new C();
		c.m1();
		c.m2();
	}
}