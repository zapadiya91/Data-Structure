public class LinearSearch
{
    public static void linearSearch(int[] arr, int key)
    {
        boolean notFound=true;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == key)
            {
               System.out.println("Key found at "+ i);
               notFound=false;
               break;
            }
            }
            if(notFound)
            {
                System.out.println("Key not found");
            }
        }
            public static void main(String[] args) {
                int[] arr = {1, 2, 3, 4, 5,
                    6, 7, 8, 9, 10};
                    int key = 7;
                    linearSearch(arr, key);
        }

}