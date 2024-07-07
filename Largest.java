import java.io.*;
class Largest{
public static void main(String args[])throws IOException{
InputStreamReader r = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(r);
int n1 = Integer.parseInt(br.readLine());
int n2 = Integer.parseInt(br.readLine());
int n3 = Integer.parseInt(br.readLine());
if(n1 >= n2){
	if(n1 >= n3)
		System.out.println(n1 + "is the largest number.");
		else
		System.out.println(n3 + "is the Largest Numbe.");
	}
else{
	if(n2 >= n3)
	System.out.println(n2 + "is the largest number.");
	else
	System.out.println(n3 + "is the Largest Number.");
	}
}
}

