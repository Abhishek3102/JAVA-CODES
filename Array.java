import java.util.*;
class Array{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("Enter number of elements");
int n=sc.nextInt();
int x[]=new int[n];
int sum=0;
for (int i=0;i<n;i++)
{System.out.print("Enter element "+(i+1));
x[i]=sc.nextInt();
}
for (int i=0;i<n;i++)
{sum=sum+x[i];
}

System.out.print("Sum of array =" + sum);}}
