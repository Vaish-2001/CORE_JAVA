class Demo1
{
	static int i;
	public static void main(String[] args) 
	{
		System.out.println(i);
		i=10;
		m1();
	}
	public static void m1()
	{
		System.out.println(i);
		System.out.println(Demo1.i);
	}
}

// 0
// 10
// 10