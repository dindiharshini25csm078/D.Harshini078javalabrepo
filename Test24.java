class A
{
	void m1()
	{
		System.out.println("hi");
	}
	void m2()
	{
		System.out.println("Hello");
	}
}
class B extends A
{
	void m1()
	{
		System.out.println("Arun");
	}
}
class Test24
{
	public static void main(String[]args)
	{
		A a=new B();
		a.m1();
		a.m2();
	}
}