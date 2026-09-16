class A
{
	int i,j,k;
	A(int i)
	{
		this.i=i;
	}
	A(int i,int j)
	{
		this.i=i;
		this.j=j;
	}
	A(int i,int j,int k)
	{
		this.i=i;
		this.j=j;
		this.k=k;
	}
	void m()
	{
		System.out.println(i+j+k);
	}
}
	class Test22
	{
		public static void main(String[] args)
		{
			A a1 =new A(10);
			A a2=new A(20,30);
			A a3=new A(30,40,50);
			a1.m();
			a2.m();
			a3.m();
		}
	}
