package day01;

public class Demo03 {
    public static void main(String[] args) {

        //小到大（隐式转换）
        //隐式转换也就是自动转换
        byte a = 120;
        short b = 120;

        int c = a;  //直接转自动


        //大到小（显式转换）
        int d = 120;

        //byte e = d;   报错，在编译时发现c的类型大于d的类型
        byte e = (byte)d;

    }
}
