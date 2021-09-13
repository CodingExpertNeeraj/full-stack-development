import java.util.Arrays;
public class StringArray {
    public static void main(String[] args) {
        String[] arr = {"Apple","Australia","Data","Rachit","Amit","Saurabh","Neeraj","Kanchan","Partha","Jack"};
        int[] arr2 = {1,2,3,9,7,4};
        Arrays.sort(arr);
        Arrays.sort(arr2);
        for(int i = 0; i< arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println("This is my string array");
    }
}
