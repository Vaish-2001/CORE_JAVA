class Second_largest
{
	public static void main(String[] args) {
		int arr[]={1,2,3,5,6};
		int largest= arr[0];

		for (int i=0;i<arr.length;i++ ) 
		{
			if (arr[i]> largest) 
			{
				largest=arr[i];
			}
		}
		int secondlarget=Integer.MIN_VALUE;
		for (int i =0;i< arr.length;i++) 
		{
			if (arr[i] > secondlarget && arr[i] < largest)
			{
				secondlarget=arr[i];
			}
		}
		System.out.println(secondlarget);
	}
}

//5