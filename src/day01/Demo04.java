package day01;

public class Demo04 {

    public static void main(String[] args) {

        int a = 10;
        int b = 3;
        int c = a % b;
        System.out.println(c);

        //++  --  自增1 自减1

        //++  -- 写在后面 先赋值再运算
        c = a++;
        System.out.println(c);
        //++  --  写在前面 先运算再赋值
        c = ++a;
        System.out.println(c);

        int i = 5;
        int j = (++i) + (i++) + (--i) + (i--);
        //j = ?
        System.out.println(j);
        System.out.println(i);
    }
}
