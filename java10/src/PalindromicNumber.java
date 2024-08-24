import java.util.Scanner;

public class PalindromicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字:");
        int originalNumber = scanner.nextInt();
        int number = originalNumber;
        int reverseNumber = 0;

        while (number != 0) {
            int b = number % 10;
            number = number / 10;
            reverseNumber = reverseNumber * 10 + b;
        }

        if (reverseNumber == originalNumber) {
            System.out.println("回文数");
        } else {
            System.out.println("不是回文数");
        }
    }
}