public class BubbleSort {

    public static void bubbleSort(int []arr)
    {
       int last=arr.length-1;
        while(last!=0)
        {
            for(int i=0;i<last;i++)
            {
                if(arr[i]>arr[i+1])
                {
                int temp=arr[i+1];
                arr[i+1]=arr[i];
                arr[i]=temp;
                }
            }
            last=last-1;
        }

    }

    public static void main(String[] args) {

        int array[]={55,78,41,69,44};
        bubbleSort(array);
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
}
