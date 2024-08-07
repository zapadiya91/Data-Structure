public class InsertionSort {
     static public void insertionSort(int []arr)
    {
        for(int i=1;i<arr.length;i++)
        {
            int key=arr[i];
            int j=i-1;
            while(j>=0 && key<arr[j])
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        

    }
    public static void main(String[] args) {
        int array[]={55,78,41,69,44};
        insertionSort(array);
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
}
