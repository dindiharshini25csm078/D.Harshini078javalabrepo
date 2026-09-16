class A
{
	static int m=90;
	int i;
	int j;
	A(int k,int l)
	{
		this.i=k;
		this.j=l;
	}
}
class Test14
{
	public static void main(String[]args)
	{
		A a=new A(10,20);
		A a1=new A(30,40);
		A a2=new A(50,60);
		System.out.println(A.m);
		System.out.println(a1.i);
		System.out.println(a1.m);
		System.out.println(a2.m);
		System.out.println(a.i);
	}
}
		