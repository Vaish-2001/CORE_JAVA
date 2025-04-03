class Demo1_a
{
	void m2()
	{
		System.out.println("hello from m2()");
		Demo1 obj=new Demo1();
		System.out.println(obj.str);
	}

}

class Demo1
{
	String str="non static var";
	public static void main(String[] args) 
	{
		Demo1_a obj= new Demo1_a();
		obj.m2();
	}
	void m1()
	{
		System.out.println(str);
	}
}


// hello from m2()
// non static var