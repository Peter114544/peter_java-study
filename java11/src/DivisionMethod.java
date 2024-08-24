import java.util.Scanner;

public class DivisionMethod {
    public static void main(String[] args) {
        System.out.println("number1");
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("number2");
        int b = Integer.parseInt(scanner.nextLine());
        int c = 0;
        while (a>=b){
            a=a-b;
            c++;
        }
        System.out.println("余数"+a);
        System.out.println("商"+c);
    }
}
