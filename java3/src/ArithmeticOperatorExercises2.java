public class ArithmeticOperatorExercises2 {
    public static void main(String[] args) {
        // /
        /*1.整数相除结果只能得到整除，如果结果想要是小数，必须要有小数参数。
            2.小数直接参与运算，得到的结果有可能是不精确的。*/
        System.out.println(10 / 2);//5
        System.out.println(10 / 3);//3
        System.out.println(10.0 / 3);//3.3333333333333335
        //%
        System.out.println(10 % 2);//0
        System.out.println(10 % 3);//1
    }
}
