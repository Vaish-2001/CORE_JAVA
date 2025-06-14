//check if the given number is palindrome or not
// a palindrome number is a number that remains the same
// when its digits are same
class Palindrome
{
	public static void main(String[] args) {
		int num= 121;
		int temp = num;
		int rev=0;
		while(num>0)
		{
			int digit= num%10;
			rev= rev*10+digit;
			num=num/10;
		}

		if (temp==rev) 
		{
			System.out.println( temp +": It is palindrome number");
		}
		else{
			System.out.println(temp+": it is not a palindromem number");
		}
	}
}

//121: It is palindrome number