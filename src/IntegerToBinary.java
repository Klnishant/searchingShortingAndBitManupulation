import java.util.Scanner;

public class IntegerToBinary {
    public static int toBinary(int num){
        if (num/2==0){
            return num%2;
        }
        int binary_num = num%2 + 10*toBinary(num/2);
        return binary_num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int num = sc.nextInt();

        System.out.println("Binary representation of the given number is "+toBinary(num));
    }
}
