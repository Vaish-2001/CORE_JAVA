//sum of element in an arrays

class Sum_of_element
{
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5};
		int sum=0;

		for (int i =0;i<=arr.length;i++) 
		{
			sum=sum+arr[i];
		}
		System.out.println("sum of element :"+ sum);
	}
}

//sum of element :36
