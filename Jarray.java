import java.util.Scanner;
public class Jarray {
public static void main(String args[]) {

int n,i,j;
Scanner scan = new Scanner (System.in);
System.out.println("Enter number of rows: ");
n=scan.nextInt();
int jarr[][] = new int [n][];

for(i=0;i<n;i++) {
jarr[i]=new int[i+1];
}

for(i=0;i<n;i++) {
for (j=0;j<=i;j++) {
jarr[i][j]=j+1;
}
}

for(i=0;i<n;i++) {
for (j=0;j<=i;j++) {
System.out.print(jarr[i][j]+"\t");
}
System.out.println("");
}

}
}

