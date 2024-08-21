import java.util.Scanner;
/*
在实际开发中，电影院选座也会使用到if判断。

​	假设某影院售卖了100张票，票的序号为1~100。

​	其中奇数票号坐左侧，偶数票号坐右侧。

​	键盘录入一个整数表示电影票的票号。

​	根据不同情况，给出不同的提示：

​	如果票号为奇数，那么打印坐左边。

​	如果票号为偶数，那么打印坐右边。
 */
public class CinemaSeatSelection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入票号");
        int rows = Integer.parseInt(scanner.nextLine());
        if (rows >=1 && rows <=100) {
            if (rows % 2 == 0) {
                System.out.println("坐右边");
            }else {
                System.out.println("坐左边");
            }
        }else {
            System.out.println("不合法");
        }
    }
}
