// if the class namw is differnt then class name as a reference is mandatory

class Example3_a
{
	public static void main(String[] args) 
	{
		Example3_b.m1();
		Example3_c.m2();
	}
}

class Example3_b
{
	public static void m1()
	{
		System.out.println("hello from Example3_b");
	}
}

// hello from Example3_b
// hello from Example3_c