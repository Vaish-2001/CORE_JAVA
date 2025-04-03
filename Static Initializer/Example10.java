class Example10
{
	static int i =10;
	public static void main(String[] args) 
	{
		 i =20;
		 System.out.println(i);
		 System.out.println(Example10.i);
		 // Example10.m1();
		 m1();
	}

	public static void m1()
	{
		System.out.println(i);
		// Example10.m1();
	}
}

// 20
// 20
// 20