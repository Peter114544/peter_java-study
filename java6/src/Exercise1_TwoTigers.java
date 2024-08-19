import java.util.Scanner;

public class Exercise1_TwoTigers {
    public static void main(String[] args) {
        /*动物园里有两只老虎，两只老虎的体重分别为通过键盘录入获得，
          请用程序实现判断两只老虎的体重是否相同。*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first tigers:");
        int firstTigers = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the second tigers:");
        int secondTigers = Integer.parseInt(sc.nextLine());
        //System.out.println(firstTigers==secondTigers);
        System.out.println(firstTigers==secondTigers?"相同":"不相同");
    }
}
