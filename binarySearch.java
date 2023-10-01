import java.util.*;
class binarySearch
{
    int search(int arr[], int x, int low, int high)
    {
        while (low <= high) {
            int mid = low + (high - low) / 2;
      
            if (arr[mid] == x)
              return mid;
      
            if (arr[mid] < x)
              low = mid + 1;
      
            else
              high = mid - 1;
          }
          return -1;
        }
    public static void main (String args [])
    {
        Scanner in=new Scanner(System.in);
        binarySearch ob=new binarySearch();
        System.out.println("Enter array size");
        int size= in.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the array elements : ");
        for(int i=0; i<size; i++)
        {
            arr[i]= in.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(" Sorted Array is :");
        for(int i=0; i<size; i++)
        System.out.print(arr[i] + " ");
        System.out.println();
        System.out.println("Enter number to be searched : ");
        int key= in.nextInt();
        int result= ob.search(arr, key, 0, (size-1));
        if (result == -1)
            System.out.println("Element is not present in array");
        else
            System.out.println("Element is present at " + "index :" + result);
    }
}