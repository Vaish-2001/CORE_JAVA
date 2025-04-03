class Example3
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
		System.out.println(i);
		System.out.println(Example3.i);
        Example3_a.m2();
	}
}
 class Example3_a
 {
 	static int j = Example3.i;
 	public static void m2()
 	{
 		System.out.println("...");
 	}
 }

//  0
// 10
// 10
// ...