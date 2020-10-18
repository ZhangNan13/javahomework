import java.util.*;
public class hw6_4 {
    public static void main(String[] args) {
        //测试函数
        System.out.println("请输入一个整数：");
        Scanner input = new Scanner(System.in);
        try {
            int number = input.nextInt();//读取输入的整数
            reverse(number); //调用反向显示函数
        }catch(InputMismatchException e){
            System.out.print("输入错误!请输入整数！");//若输入不是整数，提示输入错误
        }
    }
    public static void reverse(int number) {
        //反向显示函数
        int number2 = 0;
        int n;
        while (number > 0) {
            int d = number % 10; //采用取余依次获取输入整数的各个位数
            number2 = number2 * 10 + d; //通过运算反向组合整数各位数
            n = number / 10;
            number = n;
        }
        System.out.println("其反向显示为：" + number2);
    }
}
