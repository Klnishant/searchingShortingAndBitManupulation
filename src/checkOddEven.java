import java.util.Scanner;

public class checkOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        if((num & 1) == 1) System.out.println("Given number is odd.");
        else  System.out.println("Given number is even.");
    }
}
