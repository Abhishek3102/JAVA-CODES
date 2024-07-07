import java.io.*;
class Ternary{
public static void main(String args[]) throws IOException{
InputStreamReader r = new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(r);
int a=Integer.parseInt(br.readLine());
int b=Integer.parseInt(br.readLine());
int c=Integer.parseInt(br.readLine());
int large=(a>b)?((a>c)?a:c):(b>c?b:c);
System.out.printf("%d is Largest",large);}
}
