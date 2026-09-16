class A
{
	int m(int k,int l)
	{
		return(k+l);
	}
	float m(float m,float n)
	{
		return(m+n);
	}
	class Test20
	{
		public static void main(String[]args)
		{
			A a = new A();
			a.m(10,20);
			System.out.println(a.m(10,20));
			System.out.println(a.m(105,106));
		}
	}
}