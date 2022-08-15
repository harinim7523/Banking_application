import java.lang.*;
import java.util.*;
class banking
{
int choice;
String cname;
String acno;
double balamt;
double wd_amt;
double dep_amt;
Scanner sc=new Scanner(System.in);
banking()
{
System.out.println("Enter the customer name:");
cname=sc.nextLine();
System.out.println("Enter your valid Account number:");
acno=sc.nextLine();
while(true)
{
System.out.println("\n\n1.BALANCE CHECK 2.WITHDRAWL 3.DEPOSIT 4.EXIT");
System.out.println("Enter your choice:");
        choice=sc.nextInt();
     
   
        switch(choice)
        {
        case 1:
        {
        balcheck();
        break;
        }
        case 2:
        {
        withdrawl();
        break;
        }
        case 3:
        {
        deposit();
        break;
        }
        case 4:
        {
        System.exit(0);
        break;
        }
       }
    }
       
}
   void balcheck()
   {
System.out.println("Hi!,"+cname);
System.out.println("your account number is "+acno);
System.out.println("The CURRENT BALANCE in your account is "+balamt);
 
   }
 void withdrawl()
 {
System.out.println("Enter the amount to be withdrawn!");
        wd_amt=sc.nextDouble();
        if(wd_amt>balamt)
    System.out.println("OOPS!INSUFFICIENT BALANCE");
        else
        {
System.out.println("WITHDRAWL SUCCESSFUL!");
balamt=balamt-wd_amt;
        }
   balcheck();

 }
 
 void deposit()
 {
System.out.println("Hi,"+cname+" WELCOME FOR DEPOSITION");
System.out.println("Enter the amount that you are going to deposit:");
dep_amt=sc.nextDouble();
System.out.println("DEPOSITION SUCCESSFUL!");
        balamt=balamt+dep_amt;
        balcheck();

 }
}


    class sample
    {
    public static void main(String args[])
    {
    banking b1=new banking();
    }
   
    }

