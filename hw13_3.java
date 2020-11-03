import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
public class hw13_3 {
    public static void main(String[] args) {
        //创建ArrayList的实例al1检验函数有效性
        ArrayList<Number> al1 = new ArrayList<>();
        //在实例al1中，元素为随机函数及加入的不同类型数值
        int n = 10;
        Random random = new Random();
        System.out.print("ArrayList为：");
        for(int i = 0; i < n; i++){
            al1.add(random.nextInt(n) + 1);
            System.out.print(al1.get(i) + " ");
        }
        al1.add(1234.56);
        al1.add(new BigInteger("12345678900000000"));
        al1.add(new BigDecimal("3.14159265358979323846"));
        for(int i = n; i < al1.size(); i++){
            System.out.print(al1.get(i) + " ");
        }
        System.out.print("\n");
        sort(al1);
        System.out.print("排序后ArrayList为：");
        for(Number nn:al1){
            System.out.print(nn + " ");
        }
        System.out.print("\n");
    }
    public static void sort(ArrayList<Number> list){
        int s1 = list.size();
        int ii;
        for(int i = 1; i < s1; i++){
            Number temp = list.get(i);
            ii = i;
            for(int j = i-1; j >= 0; j--){
                Number temp2 = list.get(j);
                //由于输入为Number类型，采用其中的doubleValue函数进行大小比较
                boolean result = temp.doubleValue()<temp2.doubleValue();
                if(result){
                    list.remove(ii);
                    ii = j;
                    list.add(j,temp);
                }
            }
        }
    }
}
