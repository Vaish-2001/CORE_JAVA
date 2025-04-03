class Example14
{
	static
	{
		System.out.println("hello from static1");
		Example14_a.m1();
	}
	public static void main(String[] args) 
	{
		System.out.println("hello from main");
		Example14_a.m1();

	}
}

class Example14_a
{
	static
	{
		System.out.println("helllo from static 2");
	}
	public static void m1()
	{
		System.out.println("hello from m1");
	}
}

// hello from static1
// helllo from static 2
// hello from m1
// hello from main
// hello from m1