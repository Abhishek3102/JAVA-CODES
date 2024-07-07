import java.util.*;
public class Pattern2{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
int n=sc.nextInt();
for (int i=1;i<=n;i++){
int l=1,m=i;
for(int j=1;j<=i;j++){
if(i%2==0){
System.out.print(m+"\t");
m--;}
else {
System.out.print(l+"\t");
l++;}}
System.out.print("\n");
}}}
