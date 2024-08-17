import java.util.Scanner;
public class NumericalResolutionPro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int a = sc.nextInt();//三位数
        int b = (a / 100 % 10 );//百位
        int c = (a / 10 % 10);//十位
        int d = (a % 10);//个位
        System.out.println("个位" + d);
        System.out.println("十位" + c);
        System.out.println("百位" + b);

    }
}

