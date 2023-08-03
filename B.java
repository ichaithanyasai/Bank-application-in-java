import java.util.*;
class A
{
Scanner sc=new Scanner(System.in);
float bal;
void withdraw()
{
System.out.println("Enter the amount to withdraw\n");
float withdraw=sc.nextFloat();
if(bal<withdraw)
{
System.out.println("Insufficient Balance\n");
}
else
{
bal-=withdraw;
System.out.println("Please collect your money and card\n");
}
}
void deposit()
{
System.out.println("Enter the amount to deposit");
float deposit=sc.nextFloat();
if(deposit<0)
{
System.out.println("Invalid amount to withdraw\n");
}
else
{
bal+=deposit;
System.out.println("Amount deposited sucessfully\n");
}
}
void bal()
{
System.out.println("Total balance in your account is ="+bal);
}
}
public class B
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
A ob=new A();
boolean status=true;
int pin=1430;
System.out.println("Enter the pin");
int pins=sc.nextInt();
if(pin==pins)
{
while(status)
{
System.out.println("Enter your choice \n1.Withdraw \n2.Deposit \n3.Balance Enquiry\n4.Exit");
int choice =sc.nextInt();
switch(choice)
{
case 1:
ob.withdraw();
break;
case 2:
ob.deposit();
break;
case 3:
ob.bal();
break;
case 4:
System.exit(0);
default:
System.out.println("Incorrect choice");
}
System.out.println("Do you still want to continue true/false");
status=sc.nextBoolean();

}

}
else
{
System.out.println("Incorrect pin try again");
}
}
}
