// count the elemnt iin an array
class Count_even_and_odd
{
	public static void main(String[] args) {
		int []arr={1,2,3,4,5};
		int evencount=0;
		int oddcount=0;

		for (int i =0;i<arr.length;i++) 
		{
			if (arr[i] %2==0) 
			{
				evencount++;
			}
			else
			{
				oddcount++;
			}
		}
		System.out.println("evencount is "+ evencount);
		System.out.println("oddcount is" + oddcount);
	}
}

evencount is 2
oddcount is 3