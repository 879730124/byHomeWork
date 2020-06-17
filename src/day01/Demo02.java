package day01;

public class Demo02 {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        // a = 20  b = 10
        int t = a;
        a = b;
        b = t;
        System.out.println(a);
        System.out.println(b);

        //1.帮助我们做类型转换
        String str = "188";
        //int price = str;
        int price = Integer.parseInt(str);
        //2.本身定义了一些常用的操作
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Short.MAX_VALUE);

        //Integer i = 1;  //装箱
        //Integer i = new Integer(1); //编译后

        Integer i = 10; //自动装箱
        int j = i;      //拆箱
//        int j = i.intValue();   //编译后

    }
}
