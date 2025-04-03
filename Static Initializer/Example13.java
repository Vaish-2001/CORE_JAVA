class Example13

{
	static
	{
		System.out.println("hi from static 1");
		Example13_a.m1();
	}
	static 
	{
		System.out.println("hi from static 2");
	}
	public static void main(String[] args) 
	{
		System.out.println("hello from main");
	}
}

class Example13_a
{
	static
	{
		System.out.println("hello fromstatic 3");
	}
	public static void m1()
	{
		System.out.println("hello from m1()");
	}
}

// hi from static 1
// hello fromstatic 3
// hello from m1()
// hi from static 2
// hello from main