class A
{
	int i;
	int j;
	A(int k,int l)
	{
		this.i=k;
		this.j=l;
	}
}
class Test17
{
	public static void main(String[]args)
	{
		A a= new A(10,20);
		System.out.println(a.i);
	}
}