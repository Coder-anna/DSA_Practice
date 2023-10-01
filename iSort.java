import java.util.*;
class iSort
{
    void insertionSort(int arr[])
    {
        int size= arr.length;
        for (int step = 1; step < size; step++) {
            int key = arr[step];
            int j = step - 1;
      
            while (j >= 0 && key < arr[j]) {
              arr[j + 1] = arr[j];
              --j;
            }
      
            
            arr[j + 1] = key;
          }
    }
    public static void main (String args [])
    {
        int data[]= {89,96,45,12,1,0,123,456,4522,475};
        iSort ob=new iSort();
        ob.insertionSort(data);
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(data));

    }
}