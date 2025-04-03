class Example1
{
	String str="hi i'm from domain class";
	public static void main(String[] args) 
	{
		System.out.println("hi from main");
		Example1_a obj= new Example1_a();
		obj.m1();
	}
}

class Example1_a
{
	static Example1 obj=new Example1();
	void m1()
	{
		System.out.println("hi from m1()");
		System.out.println(obj.str);
		m2();
	}
	void m2()
	{
		System.out.println("hi from m2()");
		System.out.println(obj.str);
		m3();
	}
	 static void m3()
	{
        System.out.println("hello from m3()");
        System.out.println(obj.str);
	}
}

// hi from main
// hi from m1()
// hi i'm from domain class
// hi from m2()
// hi i'm from domain class
// hello from m3()
// hi i'm from domain class