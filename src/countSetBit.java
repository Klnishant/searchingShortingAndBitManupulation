import java.util.Scanner;

public class countSetBit {
    public static int CountingSetBit(int num){
        int count = 0;
        while (num > 0) {
            count += num & 1;
            num >>= 1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int result = CountingSetBit(num);
        System.out.println("The number of set bits in the given numbers are:"+result);
    }
}
