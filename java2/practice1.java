public class practice1 {
    public static void main(String[] args) {
        //byte 负的2的7次方 ~ 2的7次方-1(-128~127)
        byte b =10;
        System.out.println(b);//10
        //short 负的2的15次方 ~ 2的15次方-1(-32768~32767)
        short s =20;
        System.out.println(s);//20
        //int 负的2的31次方 ~ 2的31次方-1
        int i =30;//30
        System.out.println(i);
        //long 负的2的63次方 ~ 2的63次方-1
        long l =49999L;//49999
        System.out.println(l);
        //float 1.401298e-45 ~ 3.402823e+38
        float f =10.1F;//10.1
        System.out.println(f);
        //doudle 4.9000000e-324 ~ 1.797693e+308
        double d =20.2D;//20.2
        System.out.println(d);
        //char 0-65535
        char c ='吃';
        System.out.println(c);
        //boolean true，false
        boolean b1 =true;
        System.out.println(b1);
    }
}