package src.day03;


    public class HomeWork {
        public static void main(String[] args) {

            //打印等腰三角形
            System.out.println("打印等腰三角形");
            printTriangle(6);

            //打印0-100所有质数的和
            System.out.println("0-100所有质数的和为：");
            printSum();
        }

        private static void printSum() {
            int sum = 0;
            for(int i = 2; i <= 100; i++){
                boolean b = true;
                for(int j = 2; j < i; j++){
                    if( i % j == 0){
                        b = false;
                    }
                }
                if(b){
                    sum += i;
                }
            }
            System.out.println(sum);
        }


        //打印等腰三角形
        /*
                  *       1   1
                 ***      3   2
                *****     5   3
               *******    7   4
         */
        private static void printTriangle(int n) {

            for(int i = 1; i <= n; i++){    //控制行数
                for(int j = 1; j <= n - i; j++) {    //控制空格个数
                    System.out.print(" ");
                }
                for(int k = 1; k <= 2 * i - 1; k++){    //控制打印的图形
                    System.out.print("*");
                }
                System.out.println();

            }
        }
    }


