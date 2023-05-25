import java.util.Scanner;

public class descendingInsertionSort {
    public static void sort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int j=i;

            while (j>0 && arr[j]>arr[j-1]){
                int temp;
                temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
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
