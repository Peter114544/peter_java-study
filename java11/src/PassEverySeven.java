public class PassEverySeven {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            // i % 7 == 0 表示数字是7的倍数
            // i / 10 % 10 == 7 表示数字的十位数是7
            // i % 10 == 7 表示数字的个位数是7
            if (i % 7 == 0 || i / 10 % 10 == 7 || i % 10 == 7) {
                System.out.println("过");
            }else{
                continue;
            }
        }
    }
}
