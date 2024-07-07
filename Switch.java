import java.util.*;
public class Switch{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter Operator: ");
char op=sc.next().charAt(0);
System.out.print("Enter Intergers:");
int a,b,ans;
a = sc.nextInt();
b = sc.nextInt();

switch(op){
case'+':
ans=a+b;
System.out.println("Sum of the numbers is " +ans);
break;
case'-':
ans=a-b;
System.out.println("Differance of the numbers is " +ans);
break;
case'*':
ans=a*b;
System.out.println("Product of the numbers is " +ans);
break;
case'/':
ans=a/b;
System.out.println("Division of the numbers is " +ans);
break;
default:
System.out.println("Enter valid operator");

}}}
