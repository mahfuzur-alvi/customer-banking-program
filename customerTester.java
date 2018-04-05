import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TestApp {
public static String getAccountNumber(){
String accNumber ="SB"+ (100000 + new Random().nextInt(900000));
return accNumber;
}


public static void main(String[] args) {
Set<Customer> custSet=new TreeSet<Customer>();
String custFname;
String custLname;
String accNumber;
Customer c;
Scanner sc=new Scanner(System.in);
int choice;
boolean isAccFound=false;
while(true){
System.out.println("Please choose your option");
System.out.println("1. Create Customer Account");
System.out.println("2. Deposit into Customer Account");
System.out.println("3. Withdraw from Customer Account");
System.out.println("4. Edit Customer's Ŝrst and last names");
System.out.println("5. Search Customer's account by name");
System.out.println("6. Display Customer's info by account number");
System.out.println("7. Display all customers info");
System.out.println("8. Quit");
choice=sc.nextInt();
switch (choice) {
case 1:
System.out.println("Please enter custome Ŝrst name");
custFname=sc.next();
System.out.println("Please enter custome last name");
custLname=sc.next();
c=new Customer(custFname, custLname);
c.setAccountNumber(getAccountNumber());
c.setAccountBalance(0.00);
custSet.add(c);
System.out.println("Account is created successfully. Please note account number for future reference");
System.out.println(c.getAccountNumber());
c.display();
break;
case 2:
System.out.println("Please enter account number");
String accNum=sc.next();
for (Iterator iterator = custSet.iterator(); iterator.hasNext();) {
Customer customer = (Customer) iterator.next();
if(customer.getAccountNumber().equals(accNum)){
isAccFound=true;
System.out.println("Please enter amount to deposit");
System.out.println("account is deposited successfully."
+ "Available balance:"+customer.deposit(sc.nextDouble()));
break;
}
}
if(!isAccFound)
System.out.println("could not Ŝnd the account number");
break;
case 3:
System.out.println("Please enter account number");
accNum=sc.next();
for (Iterator iterator = custSet.iterator(); iterator.hasNext();) {
Customer customer = (Customer) iterator.next();
if(customer.getAccountNumber().equals(accNum)){
isAccFound=true;
System.out.println("Please enter amount to withdraw");
double bal=sc.nextDouble();
if(customer.getAccountBalance()-bal>0){
System.out.println("account is withdrawn successfully."
+ "Available balance:"+customer.withDraw(bal));
}else{
System.out.println("There is no sufficient balance to withdraw");
}
break;
}
}
if(!isAccFound)
System.out.println("could not Ŝnd the account number");
break;
case 4:
System.out.println("Please enter account number");
accNum=sc.next();
for (Iterator iterator = custSet.iterator(); iterator.hasNext();) {
Customer customer = (Customer) iterator.next();
if(customer.getAccountNumber().equals(accNum)){
isAccFound=true;
System.out.println("Please enter the Ŝrst name");
customer.setFirstName(sc.next());
System.out.println("Please enter the last name");
customer.setLastName(sc.next());
System.out.println("customer details are updates successfully");
break;
}
}
if(!isAccFound)
System.out.println("could not Ŝnd the account number");
break;
case 5:
System.out.println("Please enter customer's Ŝrst name");
custFname=sc.next();
for (Iterator iterator = custSet.iterator(); iterator.hasNext();) {
Customer customer = (Customer) iterator.next();
if(customer.getFirstName().equals(custFname)){
isAccFound=true;
customer.display();
break;
}
}
if(!isAccFound)
System.out.println("could not Ŝnd the account");
break;
case 6:
System.out.println("Please enter account number");
accNum=sc.next();
for (Iterator iterator = custSet.iterator(); iterator.hasNext();) {
Customer customer = (Customer) iterator.next();
if(customer.getAccountNumber().equals(accNum)){
isAccFound=true;
customer.display();
break;
}
}
if(!isAccFound)
System.out.println("could not Ŝnd the account number");
break;
case 7:
for (Iterator iterator = custSet.iterator(); iterator.hasNext();) {
Customer customer = (Customer) iterator.next();
customer.display();
System.out.println("********************");
}
break;
case 8:
System.exit(0);
break;
default:
break;
}
}
}
}
}
