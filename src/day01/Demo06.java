package day01;

public class Demo06 {

    public static void main(String[] args) {

        int a = 77;
        int b = 88;
        int sum = sum(a, b);
        System.out.println(sum);
        sum1(a, b);
        sum2(1,2,3,4,5,6,7);
        int c = 99;
        int max = max(a, b, c);
        System.out.println(max);
    }

    //方法与方法之间是并列的关系
    //方法的定义  修饰符  返回值类型  方法名（参数）{}
    public static int sum(int a, int b){

        //返回值类型不为空，必须有return
        return a + b;
    }
    //void 返回值类型为空
    public static void sum1(int a, int b){
        System.out.println(a+b);
    }

    //创建一个方法  帮助我们找出三个数的最大值
    public static int max(int a, int b, int c){
        if(a > b && a > c){
            return a;
        }
        else if(b > a && b > c){
            return b;
        }
        else
            return c;
    }

    //...表示个数不定，灵活改变
    public static void sum2(int ... values){
        //这个值是一个集合/数组
        int sum = 0;
        for(int x : values){
            sum += x;
        }
        System.out.println(sum);
    }
}
/*
    1.良好的编程缩进风格
    2.写注释
    3.熟练使用快捷键
    4.要怎么写代码
        注意，代码不是一句一句写出来的，而是先分析需求，分析完写开发步骤，把一个复杂的问题，分成很多小步骤，每个小步骤
    去解决一个问题，把每个小问题解决了，整个问题也就解决了。


    养成debug习惯
        Debug快捷键:
        F5 - 进入方法
        F6 - 单步跳过，执行下一行
        F7 - 返回方法，跳出当前方法
        F8 - 跳到下一个断点
 */