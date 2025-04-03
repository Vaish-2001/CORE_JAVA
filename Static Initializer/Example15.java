class Example15
{
	static
	{
		System.out.println("hello from static1");
        
        m1();
        
        System.exit(0);     
	}

	public static void m1()
	{
		System.out.println("hi from m1()");
		Example15_a.m2();
	}
}

class Example15_a
{
	public static void m2()
	{
		System.out.println("hello from m1()");
	}
}