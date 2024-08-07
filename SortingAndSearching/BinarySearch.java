public class BinarySearch
{
    public static void binarySearch(int arr[],int key)
    {
        int mid,right,left;
        right=arr.length-1;
        left=0;
        boolean notFound=true;
        while(left<=right)
        {
            mid=(left+right)/2;
            if(arr[mid]==key)
            {
                System.out.println("key found at "+mid);
                notFound=false;
                break;
            }
            else if(arr[mid]<key)
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        if(notFound)
        {
            System.out.println("key not found ! ");
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5,6, 7, 8, 9, 10};
        int key=666;
        binarySearch(arr, key);
    }
    
}
