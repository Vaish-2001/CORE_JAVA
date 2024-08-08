import java.utl.Scanner;
class Prime_Recursion
{   
	static int num;
	static int i =2;
	static boolean flag= true;
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		num= sc.nextInt();
		prime();
		System.out.println(flag?"prime":"not prime");
	}
	public statc void prime()
	{
		if(num%i==0)
		{
			flag=false;
			return;
		}
		i++;
		if(i==num)
		{
		return;
	    }
	    prime();
	}
}