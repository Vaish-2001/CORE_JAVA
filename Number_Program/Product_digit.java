//Product of digits
class Product_digit
{
	public static void main(String[] args) {
		int num=123;
		int product=1;
		while(num>0)
		{
			int digit= num %10;
			product =product*digit;
			num= num/10;
		}
		System.out.println(" product of digit is: "+product);
	}
}

// product of digit is: 6