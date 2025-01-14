import java.util.Arrays;
class Constuctor_String
{
	public static void main(String[] args) 
	{
		String str1= new String();// pubic string()
		System.out.println(str1);

		String str2= new String("hello");// pubic string(string str)
		System.out.println(str2);

		StringBuffer str3a= new StringBuffer("hello");// pubic string(stringBuffer sb)
		String str3b= new String(new StringBuffer("world"));
		System.out.println(str3b);

		StringBuilder str4a= new StringBuilder("hello");// pubic string(stringBuilder sb)
		String str4b= new String(new StringBuilder("world"));
		System.out.println(str4b);

		char ch[]={'a','b','c'};
		System.out.println(Arrays.toString(ch));  //public string(char[] ch)
		String str5= new String(ch);
		System.out.println(str5);

		byte b[]={67,68,69,70};
		System.out.println(Arrays.toString(b));////public string(byte[]b)
		String str6= new String(b);
		System.out.println(str6);
	}
}

// hello
// world
// world
// [a, b, c]
// abc
// [67, 68, 69, 70]
// CDEF