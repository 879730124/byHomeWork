package day02;

public class Demo01 {

    public static void main(String[] args) throws Exception {

        division(3,0);
    }

    //throws写在方法上，声明该方法接受的异常，多个异常逗号隔开
        public static void division (int a,int b) throws Exception,RuntimeException{

//            try{
//                int i = a/b;
//                System.out.println(i);
//            }catch (ArithmeticException e){
//                System.out.println("恭喜你出错了不能除以0");
//            }catch (Exception e){
//                System.out.println("恭喜你出错了不能除以0"+e.getMessage());
//            }
            try{
                int i = a/b;
                System.out.println("abcabc");
                System.out.println(i);
            }catch (RuntimeException e){
                throw new RuntimeException();

            }catch (Exception e){
                //主动抛出异常
                throw new Exception("除数不能为0");
            }finally {  //一定会执行的代码  关闭流释放资源
                System.out.println("我来处理后事");
            }
        }


}
