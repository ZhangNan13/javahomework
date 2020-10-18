import java.util.*;
public class hw8_2 {
    public static void main(String[] args) {
        double[][] m = new double[4][4]; //创建数组
        System.out.println("请输入一个4行4列的矩阵：");
        Scanner input = new Scanner(System.in);
        for(int i = 0;i < 4;i++){
            for(int j = 0;j < 4;j++){
                m[i][j] = input.nextDouble();//读取输入的数
            }
        }
        double summ = sumMajorDiagonal(m);
        System.out.println("矩阵主对角线的元素和为：" + summ);
    }
    public static double sumMajorDiagonal(double[][] m){
        double summ = 0;
        for(int i = 0;i < m.length;i++){ //寻找并加和主对角元素
            summ = summ +m[i][i];
        }
        return summ;
    }
}
