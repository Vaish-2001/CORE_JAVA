class Example12
{
	static
	{
       System.out.println("hi from static1");
	}

	public static void main(String[] args) 
	{
		System.out.println("hi from main");
		Example12_a.m1();
	}

	static
	{
         System.out.println("hi from static2");
	}
}

class Example12_a
{
	static 
	{
		System.out.println("i from static 3");
	}
	public static void m1()
	{
		System.out.println("hi from m1()");
	}
}

// hi from static1
// hi from static2
// hi from main
// i from static 3
// hi from m1()
