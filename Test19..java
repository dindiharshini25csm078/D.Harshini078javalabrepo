class A
{
	int i=10;
	int j=20;
	void m()
	{
		System.out.println("Hello");
	}
	class B extends A
	{
		void m()
		{
			System.out.println("Hello");
		}
	}
}
class Test19
{
	public static void main(String[]args)
	{
		A a=new B();
		System.out.println(b.i);
		System.out.println(b.j);
	}
}