class Example9
{
	static int i =10;
	public static void main(String[] args) 
	{
		 i =20;
		System.out.println(i);
		System.out.println(Example9.i);
		Exampple9_a.m2();
	}
}

class Exampple9_a
{
	public static void m2()
	{
		System.out.println(Example9.i);
	}
}

// 20
// 20
// 20