package src.day04;

import java.util.Scanner;

public class HomeWork01 {

    /*  从键盘输入8个整数存放在一个数组中
      然后将奇数和偶数分别存入到两个不同的数组中，
      并按奇数、偶数交替的顺序输出这两个数组中的所有数据
      先交替输出，如果奇数个数多，则在输出剩下的奇数，如果偶数个数多，则再输出剩下的偶数。

      提示与要求：
            (1) 定义一个数组存储从键盘输入的8个整数，先判断这8个整数中奇数和偶数的个数，
                才能定义存储奇数和偶数的数组的长度；
            (2) 把一个大的数组分别存放在奇数和偶数数组中并交替输出的过程定义为方法

     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int [] arr = new int[8];
        for (int i = 0; i < 8; i++){
            arr[i] = scanner.nextInt();
        }
        alternate(arr);
    }

    public static void alternate(int arr[]){
        int odd = 0;    //  奇数
        int even = 0;   //  偶数
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0) even++;
            else odd++;
        }
        int [] arrOdd = new int[odd];
        int [] arrEven = new int[even];
        int p = 0;
        int q = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0){
                arrOdd[p] = arr[i];
                p++;
            }
            else {
                arrEven[q] = arr[i];
                q++;
            }
        }

        if(arrOdd.length > arrEven.length){ //  如果奇数比偶数多
            for (int i = 0; i < arrEven.length; i++){
                System.out.print(arrOdd[i] + " " + arrEven[i] + " ");
            }
            for(int i = arrEven.length; i < arrOdd.length; i++ ){
                System.out.print(arrOdd[i] + " ");
            }
        }
        else{
            for (int i = 0; i < arrOdd.length; i++){
                System.out.print(arrOdd[i] + " " + arrEven[i] + " ");
            }
            for(int i = arrOdd.length; i < arrEven.length; i++ ){
                System.out.print(arrEven[i] + " ");
            }
        }


    }
}
