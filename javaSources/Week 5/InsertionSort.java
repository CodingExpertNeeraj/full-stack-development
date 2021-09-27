public class InsertionSort {
    public static void InsertionSortImpl(int arr[]) {
        int n = arr.length;
        for (int j = 1;j < n; j++){
            int key = arr[j];
            int i = j -1;
            while ((i > -1) && (arr[i]>key)){
                i--;
            }
            arr[i + 1] = key;
        }
    }public static void main(String[] a) {
        int Array[] = {100,102,2,4,1,56,27,9};
        System.out.println("Array before insertion sort");
        for (int i =0;i < Array.length; i++){
            System.out.println(Array[i] + " ");
          }
          System.out.println();
  // sorting Array elements using Insertion Sort
  InsertionSortImpl(Array);
  System.out.println("Array after insertion sort");
  for(int i =0; i < Array.length; i++){
      System.out.print(Array[i] + " ");
  }
        
    }













}