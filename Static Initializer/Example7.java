class Example7
{
	static int i ;
	public static void main(String[] args) 
	{
		System.out.println(i);
		i=10;
		m1();
	}

	public static void m1()
	{
		System.out.println(Example7.i);
	}

	void m2()
	{
		System.out.println(i);
	}
}

// 0
// 10