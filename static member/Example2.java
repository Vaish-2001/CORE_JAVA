// we can also use class name as reference to access the static member
// within the same class but using aclass as a reference is not mandatory in same class

class Example2
{
    public static void m1()
    {
    	System.out.println("hello from m1()");
    }

	public static void main(String[] args) 
	{
		m1();
		Example2.m1();
		m2("vaish");
		Example2.m2("vaish");
	}

	public static void m2(String name)
	{
		System.out.println("hello from m2 "+name);
	}
}

// hello from m1()
// hello from m1()
// hello from m2 vaish
// hello from m2 vaish
