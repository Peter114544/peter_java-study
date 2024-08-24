import java.util.Scanner;

public class ForLoopExercises_CountNumberTimes {
    public static void main(String[] args) {
        /*
        ​	  键盘录入两个数字，表示一个范围。

        ​           统计这个范围中。

        ​           既能被3整除，又能被5整除数字有多少个？
         */
        int a =0;
        Scanner input = new Scanner(System.in);
        System.out.print("1 number: ");
        int b = input.nextInt();
        System.out.print("2 number: ");
        int c = input.nextInt();
        for (int d= 1;d<=c-b;d++){
         if (d % 3==0 && d % 5==0){
             a++;
         }
        }
        System.out.println(a);
    }
}
