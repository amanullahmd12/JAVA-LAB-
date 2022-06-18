class ImplementSorting
{
   void InstertionSort(int arr[])
	{
		int n = arr.length;
		for (int i = 1; i < n; ++i) 
{
			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key)
 {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}
   void SelectionSort(int arr[])
	{
		int n = arr.length;

		
		for (int i = 0; i < n-1; i++)
		{
			
			int min_idx = i;
			for (int j = i+1; j < n; j++)
				
                               if (arr[j] < arr[min_idx])
				min_idx = j;


			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
	}

   void BubbleSort(int arr[])
	{
		int n = arr.length;

		for (int i = 0; i < n-1; i++)
		for (int j = 0; j < n-i-1; j++)

		    if (arr[j] > arr[j+1])
		{
			int temp = arr[j];
			arr[j] = arr[j+1];
			arr[j+1] = temp;
		}
	}

   static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; ++i)
		System.out.print(arr[i] + " ");

		System.out.println();
	}
    public static void main(String args[])
 	{
		int arr[]   = { 12, 11, 13, 5, 6 };

                 int array[] = {34, 73, 32, 12, 9};

        
		ImplementSorting ob  = new ImplementSorting();

       		ob.InstertionSort(arr);


                 ob.printArray(arr);

                 ob.BubbleSort(array);


                 ob.printArray(array);

                 ob.SelectionSort(arr);

                 ob.printArray(arr);



	}
}