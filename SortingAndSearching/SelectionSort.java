

public class SelectionSort {

    public static void selectionSort(int []arr)
    {
        int min=0;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[min]>arr[j])
                {
                    min=j;
                }
            }
            if(min != i)
            {
                int temp=arr[min];
                arr[min]=arr[i];
                  arr[i]=temp;
            }
        }
        }

    public static void main(String[] args) {

        int array[]={55,78,41,69,44,12};
        selectionSort(array);
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
    
}
