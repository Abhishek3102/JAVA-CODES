import java.util.*;

class Series{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("Enter a number");
int n=sc.nextInt();
double sum=0;
for (int i=1;i<=n;i++){
sum=sum+(1.0/(i*i));}
System.out.println("Sum of series is "+sum);
}}

