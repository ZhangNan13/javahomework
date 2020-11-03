import java.util.*;
public class hw6_17 {
    public static void main(String[] args) {
        //测试函数
        System.out.println("请输入矩阵维数n：");
        Scanner input = new Scanner(System.in);
        try {
            int n = input.nextInt();//读取输入的整数
            printMatrix(n); //打印数组
        }catch(InputMismatchException e){
            System.out.print("输入错误!n仅能为正整数！");//若输入不是整数，提示输入错误
        }
    }
    public static void printMatrix(int n){
        //利用两个循环嵌套输出随机生成的0-1矩阵
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                int number = (int)(10*Math.random())%2; //生成0到10的随机数，对2取余得到0或1
                System.out.print(number + " "); //不换行输出
            }
            System.out.print ("\n"); //每输出n个数据，进行换行
        }
    }
}
