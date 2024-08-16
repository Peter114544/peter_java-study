import java.util.Scanner;
//需求：键盘录入一个三位数，将其拆分为个位、十位、百位后，打印在控制台
public class NumericalResolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int a = sc.nextInt();//三位数
        int b = (a / 100 % 10 );//百位
        int c = (a / 10 % 10);//十位
        int d = (a % 10);//个位
        System.out.println(d);
        System.out.println(c);
        System.out.println(b);
    }
}
