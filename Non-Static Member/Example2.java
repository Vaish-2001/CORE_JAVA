class Example2
{
	String str="non static var";
	public static void main(String[] args) 
	{
		System.out.println("helllo from main");
		
	}
	void m1()
	{
		System.out.println("hello from m2()");
		System.out.println(str);
		m2();
	}
     void m2()
     {
     	System.out.println("hello from m2()");
     	System.out.println(str);
     }
}

//helllo from main
