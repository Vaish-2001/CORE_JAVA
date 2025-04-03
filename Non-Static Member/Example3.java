class Example3
{
	String str="string globle";
	public static void main(String[] args) 
	{
		System.out.println("maiin");
		Example3 obj=new Example3();
		obj.m1();
	}
	 public void m1()
	{
         String str="hi i'm local";
         System.out.println(str);
         System.out.println(this.str);
	}
}

// maiin
// hi i'm local
// string globle
