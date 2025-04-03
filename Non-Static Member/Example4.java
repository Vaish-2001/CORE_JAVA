class Example4
{   static Example4 obj;
	static String name;
	public static void main(String[] args) 
	{
		System.out.println(obj);
		System.out.println(name);
		name="ramesh";
		System.out.println(name);
		obj=new Example4();
		System.out.println(obj);
	}
}

// null
// null
// ramesh
// Example4@2f92e0f4