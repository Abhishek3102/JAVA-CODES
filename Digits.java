import java.io.*;
class Digits{
public static void main(String args[]){
int n = Integer.parseInt(args[0]);
int c = 0;
while(n!=0)
	{
		n=n/10;
		c++;
	}
System.out.println("Number of digits in the entered integer are :: " +c);
}
}
