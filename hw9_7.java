import java.text.SimpleDateFormat;
import java.util.Date;
public class hw9_7 {
    public static void main(String[] args) {
        //实例
        Account a1 = new Account();
        Account a2 = new Account(1234, 1111);
        //利用a1,a2检查各函数
        a1.getid();
        a1.getbalance();
        a1.getannualInterestRate();
        a1.getdateCreated();
        a1.changeid(11);
        a1.changebalance(123);
        a1.changeannualTnterestRate(1.015);
        a1.getid();
        a1.getbalance();
        a1.getannualInterestRate();
        a1.getMonthlyInterestRate();
        a2.getid();
        a2.getbalance();
        a2.getannualInterestRate();
        a2.withDraw(120);
        a2.getbalance();
        a2.deposit(130);
        a2.getbalance();
    }
}
//定义账户类
class Account{
    private int id = 0;
    private double balance = 0;
    private static double annualInterestRate = 0; //采用静态变量使所有账户有相同利率
    private final Date dateCreated;

    public Account(){//无参数构造方法，由于id与余额有默认值，仅使开户日期等于当前时间
        dateCreated = new Date();
    }
    public Account(int id,double balance){
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }
    public void getid(){
        System.out.println("当前账户为："+ id);
    }
    public void changeid(int id){
        this.id = id;
    }
    public void getbalance(){
        System.out.println("当前余额为："+ balance);
    }
    public void changebalance(double balance){
        this.balance = balance;
    }
    public void getannualInterestRate(){
        System.out.println("年利率为："+ annualInterestRate);
    }
    public void changeannualTnterestRate(double annualInterestRate){
        Account.annualInterestRate = annualInterestRate; //由于为静态成员，直接通过类名访问
    }
    public void getdateCreated(){ //访问并显示开户日期
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy年MM月dd日");
        String date1 = format1.format(dateCreated);
        System.out.println("开户日期为："+ date1);
    }
    public void getMonthlyInterestRate(){
        System.out.println("月利率为："+ (1+(annualInterestRate-1)/12));
    }
    public void withDraw(double wd){
        if(wd > balance){
            System.out.println("余额不足，取款失败" );
        }else{
            changebalance(balance - wd);
            System.out.println("取出"+ wd + "元，余额为："+ balance + "元");
        }
    }
    public void deposit(double d){
        changebalance(balance + d);
        System.out.println("存入"+ d + "元，余额为："+ balance + "元");
    }
}
