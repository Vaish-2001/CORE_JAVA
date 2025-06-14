//count the digit in a number
class Count_digit
{
	public static void main(String[] args) {
		int num=123;
		int count=0;
		
		//  for (int n = num; n != 0; n = n / 10) {
        //     count++;
        //     System.out.println(count);
        // }

		if (num==0) 
		{
			count =1;
		}
		else{
			while(num != 0)
			{
				num=num/10;
				count++;
			}
		}

		System.out.println(count);
	}
}