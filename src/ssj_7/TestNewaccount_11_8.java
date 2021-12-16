package ssj_7;

import java.util.ArrayList;
import java.util.Date;

class Account{
	private String name;
    private int id=0;
    private double balance=0;
    static private double annualInterestRate=0;
    private java.util.Date dateCreated;
    private java.util.ArrayList<Transaction> transactions=new java.util.ArrayList<>();
    public Account()
    {
        dateCreated=new java.util.Date();
    }
    public String getName() {
		return name;
	}
    public ArrayList<Transaction> getTransactions() {
		return transactions;
	}
    public Account(String name,int id,double balance) {
		this.name=name;
		this.id=id;
		this.balance= balance;
		dateCreated=new Date();
	}
    public void setId(int x)
    {
        this.id=x;
    }
    public int getId()
    {
        return this.id;
    }
    public void setBalance(double x)
    {
        balance=x;
    }
    public double getBalance()
    {
        return balance;
    }
    public static void setAnnualInterestRate(double x)
    {
        Account.annualInterestRate=x;
    }
    public static double getAnnualInterestRate()
    {
        return annualInterestRate;
    }
    public java.util.Date getDateCreated()
    {
        return dateCreated;
    }
    public double getMonthlyInterest()
    {
        return balance*(annualInterestRate/1200);
    }
    public void withDraw(double money)
    {
        balance-=money;
        transactions.add(new Transaction("取款",money,balance,""));
    }
    public void deposit(double money)
    {
        balance+=money;
        transactions.add(new Transaction("存款",money,balance,""));
    }
}
class Transaction//用户交易信息类
{
    private String type;
    private java.util.Date date;
    private double money;
    private double balance;
    private String description;
    public Transaction(String type,double money,double balance,String description)
    {
        this.type=type;//交易类型（取款，存款）
        date=new java.util.Date();//时间
        this.money=money;//存取的多少
        this.balance=balance;//交易完还剩多少钱
        this.description=description;//交易备注
    }
    public double getBalance()
    {
        return balance;
    }
    public String getType()
    {
        return type;
    }
    public double getMoney()
    {
        return money;
    }
    public String getDescription()
    {
        return description;
    }
    public Date getDate()
    {
        return date;
    }
}

public class TestNewaccount_11_8 //测试类
{
    public static void main(String[] args) 
    {
        Account account = new Account("George",1122,1000);
        Account.setAnnualInterestRate(1.5);
        account.deposit(30);
        account.deposit(40);
        account.deposit(50);
        account.withDraw(5);
        account.withDraw(4);
        account.withDraw(2);
        System.out.println("账户姓名："+account.getName());
        System.out.println("年利率："+Account.getAnnualInterestRate());
        System.out.println("余额："+account.getBalance());
        ArrayList<Transaction> list=account.getTransactions();
        System.out.printf("%-30s%-14s%-14s%-15s\n","交易时间","交易类型","交易金额","账户余额");
        for(int i=0;i<list.size();i++)
        {
        	Transaction transaction=(Transaction)(list.get(i));
            System.out.printf("%-32s%-15s%-14s%-15s\n",transaction.getDate(),transaction.getType(),transaction.getMoney(),transaction.getBalance());
        }
    }
}
