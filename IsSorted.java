class IsSorted
{
	public static void main(String[] args) {
		int arr[]={5,6,7,1};
		boolean issorted= true;

		for (int i =0;i<arr.length;i++ ) 
		{
			if (arr[i]>arr[i+1]) 
			{
				issorted=false;
				break;
			}
		}
		if (issorted) 
		{
			System.out.println("is sorted");
		}
		else
		{
			System.out.println(" is not sorted ");
		}
	}
}

// is not sorted