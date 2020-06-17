package day01;

public class Demo05 {

    public static void main(String[] args) {

        //
        int num = 10;

        num += 5;   //  =>  num = num + 5;

        System.out.println(num);

        // & 和的意思，全真为真，有假则假
        // | 或的意思，全假为假，有真则真
        //  &&  ||  具有短路的功能

        //两个数找最大值
        int a = 10;
        int b = 20;

      //  int max = a > b? a : b;
      //  System.out.println(max);

        //三个数找最大值
        a = 100;
        b = 50;
        int c = 200;
//        int t = a > b ? a : b;
//        int max = t > c ? t : c;
        int max = a > b ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println(max);
        // max ?
    }


}
