import java.util.Scanner;

public class searchElement {

    public static int search(int[] arr,int num){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==num){
                return i;
            }
        }
        return -1;
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

        System.out.println("Enter the number for searching:");
        int num = sc.nextInt();

        int result = search(arr, num);

        if (result == -1) {
            System.out.println("Entered number not present in this array");
        } else {
            System.out.println("Entered number present at " + result + " index");
        }
    }
}
