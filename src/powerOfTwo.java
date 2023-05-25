import java.util.Scanner;

public class powerOfTwo {
    public static void isPowerOfTwo(int num,int check){
        if (num%2==1){
            check++;
        }
        if (num<=0){
            System.out.println("The given number is the power of two");
            return;
        }
        if (check>1){
            System.out.println("The given number is not power of two");
            return;
        }
        isPowerOfTwo(num/2,check);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int check=0;
        isPowerOfTwo(num,check);
    }
}
