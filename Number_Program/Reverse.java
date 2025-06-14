// reverse the number
class Reverse
{
	public static void main(String[] args) {
		int num=123;
		int rev=0;
		while(num>0)
		{
			int digit= num%10;
			rev=rev*10+digit;
			//we cannot write rev*=10+ digit becaue they getting zero 
			//only one operation perform with compound operator
			num/= 10;
		}
		System.out.println(rev);
	}
}

//321