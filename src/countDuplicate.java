import java.util.Scanner;

public class countDuplicate {
    public static int count(int[] arr,int target){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the element of the array in sorted form:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target element to find the number of occurences:");
        int target = sc.nextInt();

        int result = count(arr,target);

        System.out.println("Number of occurences of "+target+" in given array is "+result);
    }
}
