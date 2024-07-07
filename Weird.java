import java.util.Scanner;
class Weird{
	public static void main(String args[]){
	System.out.println("Enter a number :");
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	if(n%2 != 0 || (n%2==0 && (n>=6 && n<=20)))
	{
		System.out.println("Weird");
	}
	else
	{
		System.out.println("Not Weird");
	}
}
}
