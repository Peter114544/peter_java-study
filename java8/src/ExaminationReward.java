import java.util.Scanner;

public class ExaminationReward {
//95~100 自行车一辆
//90~94   游乐场玩一天
//80 ~ 89 变形金刚一个
//80 以下  胖揍一顿
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("请输入小明的成绩");
    int n = Integer.parseInt(scanner.nextLine());
    if (0<=n && n<=100) {
    if (95<=n && n<=100) {
        System.out.println("自行车一辆");
    }else if (90<=n && n<=94) {
        System.out.println("游乐场玩一天");
    }else if (80<=n && n<=89) {
        System.out.println("变形金刚一个");
    }else {
        System.out.println("胖揍一顿");
    }
    }else {
        System.out.println("不是真实成绩");
    }
    }
}
