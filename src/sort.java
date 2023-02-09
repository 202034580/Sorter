public class sort {
      public static void insertionSort(int array[]) {  
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }  
    }  
     public static void sorter(int array[]){
        insertionSort(array);
         System.out.println("Insertion Sort:");
        selectionSort(array);
         System.out.println("Selection Sort:");
        for(int i:array){    
            System.out.print(i+" ");    
        }    
    }
    public static void main(String[] args) {
        int[] arr1 = {9,14,3,2,43,11,58,22};  
        sorter(arr1);
        int [] arr = new int[5];
        arr[0]=2;
        arr[1]=122;
        arr[2]=62;
        arr[3]=102;
        arr[4]=82;
        selectionSort(arr);
        sorter(arr);
    }
    static void selectionSort(int arr[])
    {
        int n = arr.length;
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
}