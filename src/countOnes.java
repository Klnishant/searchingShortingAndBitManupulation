import java.util.Scanner;

public class countOnes {
    public static int count(int[] arr){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==1){
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

        System.out.println("Enter the element of the array in sorted and binary form:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = count(arr);

        System.out.println("Numbers of 1 present in the given array:"+result);
    }
}
