import java.util.Scanner;

public class haveMeal {
    public static void main(String[] args) {
        /*
键盘录入一个整数，表示身上的钱。
如果大于等于100块，就是网红餐厅。
否则，就吃经济实惠的沙县小吃。
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数表示身上的钱");
        int n = sc.nextInt();
        if (n>=100){
            System.out.println("吃网红餐厅");
        }else {
            System.out.println("福建大酒店");
        }
    }
}
