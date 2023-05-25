import java.util.Scanner;

public class descendingSelectionSort {

    public static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int max_idx = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]>arr[max_idx]){
                    max_idx = j;
                }
            }
            if (max_idx !=i){
                int temp = arr[i];
                arr[i] = arr[max_idx];
                arr[max_idx]=temp;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the element of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sort(arr);
        System.out.println("Sorted array in descending order:");
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
