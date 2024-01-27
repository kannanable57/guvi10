package task10;
import java.util.*;
//compiler version jdk 11.0.2
public class bank {
int ac_no;
String name, type;
float amount;
void details(int n, String nm, String t,float a)
{
	ac_no = n;
	name=nm;
	type=t;
	amount=a;
}
void show()
{
	System.out.println(ac_no+""+name+""+type+""+amount);
}
void deposit(float a)
{
	amount+=a;
	System.out.println("Deposit amount:"+a);
}
void withdraw (float a)
{
if(amount<a)
	 System.out.println("insufficient balnce");
else
	amount-=a;
System.out.println("withdraw amount:");
}
void  checkbalance()
{
	System.out.println("Balance is :"+amount);
}
}
class test{public static void main(String args[])
	{
	bank b=new bank();
	b. details (123456,"kannan","Saving",1000);
	b. show();
	b. deposit(40000);
	b. checkbalance();
	b. withdraw(10000);
	b. checkbalance();
	}
}
	
	
	

			

	


