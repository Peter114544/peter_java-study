package java2;

public class Question3 {
    /*请用代码描述下列银行流水变化过程：

1. 小明账户bankBalance初始值有500.00元
2. 存入250元
3. 支出100元
4. 打印剩余存款*/
    public static void main(String[] args) {
     int bankBalance =500;
     bankBalance = bankBalance + 250;
     bankBalance = bankBalance - 100;
        System.out.println(bankBalance);
    }
}
